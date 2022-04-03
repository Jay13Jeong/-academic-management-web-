package student.model.service;

import static common.JDBCTemp.*;
import static common.JDBCTemp.getConnection;

import java.sql.Connection;

import student.model.dao.AdminDao;
import student.model.vo.Admin;



public class AdminService {
	private AdminDao adao = new  AdminDao();
	
	public AdminService() {}

	public Admin selectOne(String id, String treasure ) {
		Connection conn = getConnection();
		Admin admin = adao.selectOne(conn, id, treasure);
		close(conn);
		return admin;
	}

	public int updateadminpassword(String cryptoPwd, String id) {
		Connection conn = getConnection();
		int result = adao.updateadminpassword(conn, cryptoPwd, id);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int updateAdmin(Admin admin) {
		Connection conn = getConnection();
		int result = adao.updateAdmin(conn, admin);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
}
