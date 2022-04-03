package scholarship.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.commit;
import static common.JDBCTemp.getConnection;
import static common.JDBCTemp.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import scholarship.model.dao.ScholarshipDao;
import scholarship.model.vo.Scholarship;


public class ScholarshipService {
	private ScholarshipDao ssdao = new ScholarshipDao();
	
	public ScholarshipService() {};
	
	public ArrayList<Scholarship> selectScholarship() {
		Connection conn = getConnection();
		ArrayList<Scholarship> list = ssdao.selectScholarship(conn);
		close(conn);
		return list;
	};
	
	public Scholarship selectOneScholarship(String ssname) {
		Connection conn = getConnection();
		Scholarship scholarship = ssdao.selectOneScholarship(conn, ssname);
		close(conn);
		return scholarship;
	};
	
	public int insertScholarship(Scholarship ss) {
		Connection conn = getConnection();
		int result = ssdao.insertScholarship(conn, ss);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	};
	
	public int updateScholarship(Scholarship ss, String originname) {
		Connection conn = getConnection();
		int result = ssdao.updateScholarship(conn, ss, originname);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	};
	
	public int deleteScholarship(String ssname) {
		Connection conn = getConnection();
		int result = ssdao.deleteScholarship(conn, ssname);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	};
}
