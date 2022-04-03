package absence.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import absence.model.vo.Absence;
import static common.JDBCTemp.*;

public class AbsenceDao {
	public AbsenceDao() {};
	
	public ArrayList<Absence> selectAbsence(Connection conn) {
		ArrayList<Absence> list = new ArrayList<Absence>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * from absence order by requestdate desc";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Absence ab = new Absence(rset.getString("requestid"), rset.getString("id"),rset.getDate("requestdate"), rset.getDate("limitcanceldate"), rset.getString("approval"));
				list.add(ab);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		return list;
	};
	
	public Absence selectOneAbsence(Connection conn, String requestid) {
		Absence absence =null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from absence where requestid = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, requestid);
			rset = pstmt.executeQuery();

			if(rset.next()) {
				absence = new Absence(rset.getString("requestid"), rset.getString("id"),rset.getDate("requestdate"), rset.getDate("limitcanceldate"), rset.getString("approval"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return absence;
	};
	
	
	public ArrayList<Absence> selectPrivateAbsence(Connection conn, String studentid) {
		ArrayList<Absence> list = new ArrayList<Absence>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from absence where id = ?  order by requestdate desc";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, studentid);
			
			rset = pstmt.executeQuery();
			while(rset.next()) {
				Absence ab = new Absence(rset.getString("requestid"), studentid ,rset.getDate("requestdate"), rset.getDate("limitcanceldate"), rset.getString("approval"));
				
				list.add(ab);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return list;
	};

	public int insertAbsence(Connection conn, String value, String studentid) {
		int result = 0;
		PreparedStatement pstmt = null;
		String query = "insert into absence values(concat( ?, (select max(to_number(substr(requestid,2)))+1 from absence where substr(requestid,1,1) = ?)), ?, default, default, default)";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, value);
			pstmt.setString(2, value);
			pstmt.setString(3, studentid);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
		close(pstmt);
		}
		return result;
	};
	
	//승인하면 approval 이 Y로 바뀌고 학생테이블의 휴학웨더값을 바꾸어줌
	//휴학이 휴학신청, 휴학이 복학신청, 재학이 휴학신청
	public int updateYAbsence(Connection conn, String requestid) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update absence set approval = 'Y' where requestid = ?"; 
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, requestid);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		close(pstmt);
		return result;
	};
	
	public int updateNAbsence(Connection conn, String requestid) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update absence set approval = 'N' where requestid = ?"; 
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, requestid);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		close(pstmt);
		return result;
	};
	
	//신청취소하면 학생테이블가서 휴학여부바꾸어줌
	public int studentAbsenceChange(Connection conn, String id) {
		int result = 0;
		PreparedStatement pstmt = null;
		String query = "  update student set ABSENCEWHETHER = (select case ABSENCEWHETHER when 'Y' then 'N' when 'N' then 'Y' end from student where id = ?) where id = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, id);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	
	public int studentCountPlus(Connection conn, String id) {
		int result = 0;
		PreparedStatement pstmt = null;
		String query = "  update student set absencecount = absencecount+1 where id = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	
	public int studentCountMinus(Connection conn, String id) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "  update student set absencecount = absencecount-1 where id = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	
	public int deleteAbsence(Connection conn, String requestid) {
		int result = 0; // 신청취소가 되면 승인여부고려해서 학생테이블의 휴학웨더 바꾸어준다.
		PreparedStatement pstmt = null;
		
		String query = "delete from absence where requestid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, requestid);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
		close(pstmt);
		}
		return result;
	}

	public ArrayList<Absence> selectApprovalAbsence(Connection conn, String able) {
		ArrayList<Absence> list = new ArrayList<Absence>(); // 승인된 아이들만 조회 able이 Y로 옴
															// 미승인된 아이들만 조회. able이 N으로 옴
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from absence where appoval = ?  order by requestdate desc";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, able);
			
			rset = pstmt.executeQuery();
			while(rset.next()) {
				Absence ab = new Absence(rset.getString("requestid"), rset.getString("id"),rset.getDate("requestdate"), rset.getDate("limitcanceldate"), rset.getString("approval"));
				
				list.add(ab);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}
	
	public String selectApprovalChk(Connection conn, String requestid) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String approval = null;
		
		String query = "select approval from absence where requestid = ? ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, requestid);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				approval = rset.getString("approval");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return approval;
	}

	public ArrayList<Absence> selectABA(Connection conn, String value) {
		ArrayList<Absence> list = new ArrayList<Absence>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from absence where substr(requestid,1,1) = ?  order by requestdate desc";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, value);
			rset = pstmt.executeQuery();

			while(rset.next()) {
				Absence absence = new Absence(rset.getString("requestid"), rset.getString("id"),rset.getDate("requestdate"), rset.getDate("limitcanceldate"), rset.getString("approval"));

				list.add(absence);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}
	
	public float canceldateChk(Connection conn, String requestid) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		float date = 0.0f;

		String query = " select round(to_number(LIMITCANCELDATE - sysdate),2) as \"date\" from absence where requestid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, requestid);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				date  = rset.getFloat("date");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return date;
	}
}
