package major.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import major.model.vo.Major;
import major.model.vo.Major1;
import major.model.vo.Major2;
import notice.model.vo.Notice;




public class MajorDao {
	public MajorDao() {
		
	}

	public int getListCount(Connection conn) {
		int listCount = 0;
		Statement stmt = null;
		ResultSet rset = null;

		String query = "SELECT COUNT(*) FROM major";
		System.out.println("행조회성공");
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);

			if (rset.next()) {
				listCount = rset.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		System.out.println("getListCount Dao성공 !");
		
		return listCount;
	}

	public ArrayList<Major> selectList(Connection conn) {
		ArrayList<Major> list = new ArrayList<Major>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * from major ";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Major major = new Major();
				major.setMajorno(rset.getString("majorno"));
				major.setMajorname(rset.getString("majorname"));
				major.setCapacity(rset.getInt("capacity"));
				major.setTuition(rset.getInt("tuition"));
				major.setCategoryname(rset.getString("categoryname"));
				
				list.add(major);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(stmt);
			close(rset);
		}
		return list;
	}

	public int insertMajor(Connection conn, Major major) {
		int result =0;
		PreparedStatement pstmt = null;
		
		String query= "insert into major values(?,?,?,?,?)";
		System.out.println("dao성공!");
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, major.getMajorno());
			pstmt.setString(2, major.getMajorname());
			pstmt.setInt(3, major.getCapacity());
			pstmt.setInt(4, major.getTuition());
			pstmt.setString(5, major.getCategoryname());
			
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
}

	public Major selectOne(Connection conn, String majorno) {
		Major major = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select * from major where majorno=?";
		System.out.println("majordetail dao성공");
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, majorno);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				major = new Major();
				major.setMajorno(rset.getString("majorno"));
				major.setMajorname(rset.getString("majorname"));
				major.setCapacity(rset.getInt("capacity"));
				major.setTuition(rset.getInt("tuition"));
				major.setCategoryname(rset.getString("categoryname"));
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
			
		}
		return major;
		
	}

	public int deleteMajor(Connection conn, String majorNo) {
		int result = 0;
		PreparedStatement pstmt = null;

		String query = "delete from major where majorno=?";

		try {
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, majorNo);

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		System.out.println("dao" + result);
		return result;

	}

	public Major selectOne(Connection conn, int majorNo) {
		Major major = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select * from major where majorno=?";
			System.out.println("하나고름!");
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, majorNo);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				 major = new Major();
				major.setMajorno(rset.getString("majorno"));
				major.setMajorname(rset.getString("majorname"));
				major.setCapacity(rset.getInt("capacity"));
				major.setTuition(rset.getInt("tuition"));
				major.setCategoryname(rset.getString("categoryname"));
				
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
			
		}
		return major;
	}

	public int updateNotice(Connection conn, Major major) {
		int result = 0;
		PreparedStatement pstmt = null;

		String query = "update major set  majorname=? , capacity = ? , tuition = ?   where majorno = ? ";
		System.out.println("update!");
		try {
			pstmt = conn.prepareStatement(query);
			
			
			pstmt.setString(1, major.getMajorname());
			pstmt.setInt(2, major.getCapacity());
			pstmt.setInt(3, major.getTuition());
			pstmt.setString(4, major.getMajorno());
			
			

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}

	public Major1 selectOneTuition(Connection conn, String id) {
		PreparedStatement pstmt = null;
		Major1 major1 = null;
		ResultSet rset = null;
		String query = "select a.categoryname  , b.majorname   , a.id  , a.name  , b.tuition " + 
				"from student a " + 
				"join major b on a.majorno=b.majorno " + 
				"where id = ?";
		System.out.println("select tuition 도착");
		try {
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, id);
			
			
			
		rset = 	pstmt.executeQuery();
			if(rset.next()) {
				major1 = new Major1();
				
				major1.setCategoryname(rset.getString("categoryname"));
				major1.setMajorname(rset.getString("majorname"));
				major1.setId(rset.getString("id"));
				major1.setName(rset.getString("name"));
				major1.setTuition(rset.getInt("tuition"));
				
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
			
		}
		
		return major1;
	}

	public Date firstTermCheck(Connection conn) {
		Date term = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		String query ="  select sysdate from dual where sysdate between (select to_date(concat(lpad(SCHSTARTMONTH, 2, 0), lpad(SCHSTARTDATE, 2, 0)), 'MMdd') " + 
								"  from schedule " + 
								"  where schname like '%1학기%' and schname like '%개강%' and extract(YEAR from to_date(SCHSTARTYEAR, 'yyyy')) = extract(YEAR from sysdate)) " + 
								"  and (select to_date(concat(lpad(SCHSTARTMONTH, 2, 0), lpad(SCHSTARTDATE, 2, 0)), 'MMdd') " + 
								"  from schedule " + 
								"  where schname like '%2학기%' and schname like '%개강%' and extract(YEAR from to_date(SCHSTARTYEAR, 'yyyy')) = extract(YEAR from sysdate))";
		
		try {
			stmt = conn.createStatement();
			
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				term = rset.getDate("sysdate");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(stmt);
		}
		return term;
	}

	public Date secondCheck(Connection conn) {
		Date termcheck = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		String query =" select sysdate from dual where sysdate between (select to_date(concat(lpad(SCHSTARTMONTH, 2, 0), lpad(SCHSTARTDATE, 2, 0)), 'MMdd') " + 
								" from schedule " + 
								" where schname like '%1학기%' and schname like '%개강%' and extract(YEAR from to_date(SCHSTARTYEAR, 'yyyy')) = extract(YEAR from sysdate)) " + 
								" and (select to_date(concat(lpad(SCHSTARTMONTH, 2, 0), lpad(SCHSTARTDATE, 2, 0)), 'MMdd') " + 
								" from schedule " + 
								" where schname like '%1학기%' and schname like '%종강%' and extract(YEAR from to_date(SCHSTARTYEAR, 'yyyy')) = extract(YEAR from sysdate))";
		
		try {
			stmt = conn.createStatement();
			
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				termcheck = rset.getDate("sysdate");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(stmt);
		}
		return termcheck;
	}

	public Date second2Check(Connection conn) {
		Date termcheck = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		String query =" select sysdate from dual where sysdate between (select to_date(concat(lpad(SCHSTARTMONTH, 2, 0), lpad(SCHSTARTDATE, 2, 0)), 'MMdd') " + 
								" from schedule " + 
								" where schname like '%2학기%' and schname like '%개강%' and extract(YEAR from to_date(SCHSTARTYEAR, 'yyyy')) = extract(YEAR from sysdate)) " + 
								" and (select to_date(concat(lpad(SCHSTARTMONTH, 2, 0), lpad(SCHSTARTDATE, 2, 0)), 'MMdd') " + 
								" from schedule " + 
								" where schname like '%2학기%' and schname like '%종강%' and extract(YEAR from to_date(SCHSTARTYEAR, 'yyyy')) = extract(YEAR from sysdate))";
		
		try {
			stmt = conn.createStatement();
			
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				termcheck = rset.getDate("sysdate");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(stmt);
		}
		return termcheck;
	}

	
	

	public Major2 OneValueAndBene(Connection conn, String id) {
		PreparedStatement pstmt = null;
		Major2 major2 = null;
		ResultSet rset = null;
		String query = "select value, lpad(benefitterm,4) c " + 
				"from ssbenefitst a " + 
				"left join scholarship b  " + 
				"on a.ssname = b.ssname " + 
				"where id= ?";
		
		try {
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, id);
			
			
			
		rset = 	pstmt.executeQuery();
			if(rset.next()) {
				major2 = new Major2();
				
				major2.setValue(rset.getInt("value"));
				major2.setBenefitterm(rset.getInt("c"));
				
				
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
			
		}
		
		return major2;
	}

	/*
	 * public int paymentCheck(Connection conn) { int paymentCheck = 0; Statement
	 * stmt = null; ResultSet rset = null;
	 * 
	 * String query ="select to_number(extract(month from sysdate)) from dual";
	 * 
	 * 
	 * System.out.println("쿼리성공!"); try { stmt = conn.createStatement();
	 * 
	 * rset = stmt.executeQuery(query);
	 * 
	 * if(rset.next()) { paymentCheck =
	 * rset.getInt("to_number(extract(month from sysdate))"); } } catch (Exception
	 * e) { e.printStackTrace(); }finally { close(stmt); } return paymentCheck; }
	 * 
	 * public Date paymentCheck1(Connection conn) { Date payment = null; Statement
	 * stmt = null; ResultSet rset = null;
	 * 
	 * String query ="  select schstartyear , schstartmonth , schstartdate " +
	 * "            from schedule " +
	 * "            where to_number(schstartmonth) < 7 and schname like '%학기%' and schname like '%등록%' and schstartyear = extract(year from sysdate) "
	 * ;
	 * 
	 * try { stmt = conn.createStatement();
	 * 
	 * rset = stmt.executeQuery(query);
	 * 
	 * if(rset.next()) { payment = rset.getDate("sysdate"); } } catch (Exception e)
	 * { e.printStackTrace(); }finally { close(stmt); } return payment; }
	 * 
	 * public Date paymentCheck2(Connection conn) { // TODO Auto-generated method
	 * stub return null; }
	 */


	


	

	
	
	
	
	
	
	
	
	
	
	
	
}
