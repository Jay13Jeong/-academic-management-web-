package student.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import student.model.vo.Admin;
import student.model.vo.Professor;

public class AdminDao {
	  public Admin selectOne(Connection conn, String id, String treasure ) {
		  Admin admin = null;
	      PreparedStatement pstmt = null;
	      ResultSet rset = null;

	      String query = "select * from administrator where id = ? and treasure = ? ";
					
					
	      try {
	         pstmt = conn.prepareStatement(query);
	         pstmt.setString(1, id);
	         pstmt.setString(2, treasure);
	         rset = pstmt.executeQuery(); //쿼리를 디비로 보냄

	         if (rset.next()) {
	        	 admin = new Admin();

	        	 admin.setId(rset.getString("id"));
	        	 admin.setTreasure(rset.getString("treasure"));
	           
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         close(rset);
	         close(pstmt);
	        
	      }
	      

	      return admin;
	   }

	public int updateadminpassword(Connection conn, String cryptoPwd, String id) {
		int result = 0;
		PreparedStatement pstmt = null;
		String query = "update administrator set password =? where id = ?";
		
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, cryptoPwd);
			pstmt.setString(2, id);
			
			result = pstmt.executeUpdate(); //담은 쿼리문을 db에서 실행해서 결과를 result에 넣는다.
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}

	public int updateAdmin(Connection conn, Admin admin) {
		int result = 0;
		PreparedStatement pstmt = null;
		String query = "update administrator set password = ?, address = ?, phone = ?, email = ?, treasure= ? where id = ? ";
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, admin.getPassword());
			pstmt.setString(2, admin.getAddress());
			pstmt.setString(3, admin.getPhone());
			pstmt.setString(4, admin.getEmail());
			pstmt.setString(5, admin.getTreasure());
			pstmt.setString(6, admin.getId());
			
			result = pstmt.executeUpdate();
			
			System.out.println("result adao" + result);
			System.out.println(admin + "수정성공" );
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
