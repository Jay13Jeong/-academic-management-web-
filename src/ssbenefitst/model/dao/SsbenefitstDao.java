package ssbenefitst.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import ssbenefitst.model.vo.Ssbenefitst;

public class SsbenefitstDao {
	public SsbenefitstDao() {}

	public ArrayList<Ssbenefitst> selectSsbenefitst(Connection conn, int currentPage, int limit) {
		ArrayList<Ssbenefitst> list = new ArrayList<Ssbenefitst>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from "
	      		+ " (select rownum rnum, benefitterm, id, ssname "
	      		+ " from (select * from ssbenefitst order by benefitterm desc)) "
	      		+ " where rnum >= ? and rnum <= ? ";
		
		int startRow = ( (currentPage - 1) * limit ) + 1;
	      //1페이지면 1~10, 2페이지면 11~20
	    int endRow = startRow + limit - 1;
		
		try {
	    	 pstmt = conn.prepareStatement(query);
	         pstmt.setInt(1, startRow);
	         pstmt.setInt(2, endRow);
	         
	         rset = pstmt.executeQuery();
	         
			while(rset.next()) {
				Ssbenefitst ssst = new Ssbenefitst(rset.getInt("benefitterm"), rset.getString("id"), rset.getString("ssname"));
				
				list.add(ssst);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	public Ssbenefitst selectOneSsbenefitst(Connection conn, int benefitterm, String studentid) {
		Ssbenefitst ssst = new Ssbenefitst();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		
		String query = "select * from ssbenefitst where benefitterm = ? and id = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, benefitterm);
			pstmt.setString(2, studentid);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				ssst = new Ssbenefitst(rset.getInt("benefitterm"), rset.getString("id"), rset.getString("ssname"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return ssst;
	}

	public int insertSsbenefitst(Connection conn, Ssbenefitst ssst) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "insert into ssbenefitst values(?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, ssst.getBenefitterm());
			pstmt.setString(2, ssst.getStudentid());
			pstmt.setString(3, ssst.getSsname());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}	
		return result;
	}

	public int updateSsbenefitst(Connection conn, Ssbenefitst newssst, Ssbenefitst originssst) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update ssbenefitst set benefitterm = ?, id=? , ssname=? where benefitterm= ? and id = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, newssst.getBenefitterm());
			pstmt.setString(2, newssst.getStudentid());
			pstmt.setString(3, newssst.getSsname());
			pstmt.setInt(4, originssst.getBenefitterm());
			pstmt.setString(5, originssst.getStudentid());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}	
		return result;
	}

	public int deleteSsbenefitst(Connection conn, int benefitterm, String studentid) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "delete from ssbenefitst where benefitterm = ? and id = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, benefitterm);
			pstmt.setString(2, studentid);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}		
		return result;
	}

	public ArrayList<Ssbenefitst> selectPrivateSsst(Connection conn, String studentid) {
		ArrayList<Ssbenefitst> list =  new ArrayList<Ssbenefitst>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		
		String query = "select * from ssbenefitst where id = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, studentid);
			
			rset = pstmt.executeQuery();
			while(rset.next()) {
				Ssbenefitst ssst = new Ssbenefitst(rset.getInt("benefitterm"), rset.getString("id"), rset.getString("ssname"));
				
				list.add(ssst);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return list;
	};
	
	public ArrayList<String> selectRank(Connection conn, int term, int startrank, int endrank) { //과별 등수에 따른 학번을 ArrayList로 리턴.
		ArrayList<String> studentlist = new ArrayList<String>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select sid from" + 
				"    (select semester, sid, majorname, DENSE_RANK() OVER (partition by semester,majorname ORDER BY max(totalscore) DESC) as rank" + 
				"    from lscoreView" + 
				"    group by semester, sid, majorname" + 
				"    order by semester, majorname, rank)" + 
				"    where rank >= ? and rank <=?" + 
				"    and semester = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startrank);
			pstmt.setInt(2, endrank);
			pstmt.setInt(3, term);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				
				String sid = rset.getString("sid");
				studentlist.add(sid);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return studentlist;	
	};
	
	public int termPlus(Connection conn, int term){
		int plusterm= 0;
		PreparedStatement pstmt = null;
		ResultSet  rset = null;
		
		String query = "select case substr(to_char(?), 6, 1) when '1' then concat(to_char(extract(YEAR from to_date(?, 'yyyymm'))), '02')" + 
								 "  when substr(to_char(?), 6, 1) then concat(to_char(extract(YEAR from to_date(?, 'yyyymm'))+1), '01') end as seme from dual";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, term);
			pstmt.setInt(2, term);
			pstmt.setInt(3, term);
			pstmt.setInt(4, term);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				plusterm = Integer.parseInt(rset.getString("seme"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return plusterm;
	}
	
	public int insertScoreRank(Connection conn, int plusterm, String sid, String ssname) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "insert into ssbenefitst values (?, ?, ?)";
		
		try {
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, plusterm);
				pstmt.setString(2, sid);
				pstmt.setString(3, ssname);
			
				result=  pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}

	public int getListCount(Connection conn) {
		int listCount = 0;
		Statement stmt =null;
		ResultSet rset =null;
		
		String query ="select count(*) from ssbenefitst";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				listCount = rset.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return listCount;
	}
	
	
}
