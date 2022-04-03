package category.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import category.model.dao.CategoryDao;
import category.model.vo.Category;
import static common.JDBCTemp.*;

public class CategoryService {
	private CategoryDao cdao = new CategoryDao();
	
	public CategoryService() {};
	
	public ArrayList<Category> selectCategory() {
		Connection conn = getConnection();
		ArrayList<Category> list = cdao.selectCategory(conn);
		close(conn);
		return list;
	};
	
	public int insertCategory(String catename) {
		Connection conn = getConnection();
		int result = cdao.insertCategory(conn, catename);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	};
	
	public int updateCategory(String catename, String newname) {
		Connection conn = getConnection();
		int result = cdao.updateCategory(conn, catename, newname);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	};
	
	public int deleteCategory(String catename) {
		Connection conn = getConnection();
		int result = cdao.deleteCategory(conn, catename);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	};
}
