package category.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import category.model.vo.Category;
import static common.JDBCTemp.close;

public class CategoryDao {
	public CategoryDao() {};
	
	public ArrayList<Category> selectCategory(Connection conn) {
		ArrayList<Category> list = new ArrayList<Category>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * from category order by categoryname";
		
		try {
			stmt = conn.createStatement();
			
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Category ca = new Category(rset.getString("categoryname"));
				
				list.add(ca);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		close(rset);
		close(stmt);
		return list;
	};
	
	public int updateCategory(Connection conn, String catename, String newname) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update category set categoryname = ? where categoryname = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, newname);
			pstmt.setString(2, catename);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		close(pstmt);
		return result;
	};
	
	public int deleteCategory(Connection conn, String catename) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "delete from category where categoryname = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, catename);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		close(pstmt);
		return result;
	}

	public int insertCategory(Connection conn, String catename) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "insert into category values( ? )";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, catename);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
		close(pstmt);
		}
		return result;
	};
}
