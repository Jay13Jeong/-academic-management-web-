package scholarship.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import scholarship.model.vo.Scholarship;

public class ScholarshipDao {
	public ScholarshipDao() {}
	
	public ArrayList<Scholarship> selectScholarship(Connection conn) {
		ArrayList<Scholarship> list = new ArrayList<Scholarship>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query="select * from scholarship order by ssname";
		try {
			stmt = conn.createStatement();
			
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Scholarship ss = new Scholarship(rset.getString("ssname"), rset.getString("benefitcon"), rset.getInt("value"));
				
				list.add(ss);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}	
		return list;
	};

	public Scholarship selectOneScholarship(Connection conn, String ssname) {
		Scholarship ss = new Scholarship();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query="select * from scholarship where ssname = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, ssname);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				ss = new Scholarship(rset.getString("ssname"), rset.getString("benefitcon"), rset.getInt("value"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}	
		return ss;
	}
	
	public int insertScholarship(Connection conn, Scholarship ss) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query="insert into scholarship values(?,?,?)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, ss.getSsname());
			pstmt.setString(2, ss.getBenefitcon());
			pstmt.setInt(3, ss.getValue());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}

	public int updateScholarship(Connection conn, Scholarship ss, String originname) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query="update scholarship set ssname = ?, benefitcon= ?, value= ? where ssname = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, ss.getSsname());
			pstmt.setString(2, ss.getBenefitcon());
			pstmt.setInt(3, ss.getValue());
			pstmt.setString(4, originname);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	
	public int deleteScholarship(Connection conn, String ssname) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query="delete from scholarship where ssname = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, ssname);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}

}
