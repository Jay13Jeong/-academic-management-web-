package student.model.service;

import static common.JDBCTemp.*;

import java.sql.Connection;

import student.model.dao.StudentDao;
import student.model.vo.Member;
import student.model.vo.Student;



public class StudentService {
private StudentDao sdao = new  StudentDao();
	
	

	public StudentService() {
}



	public Student selectOne(String id, String treasure ) {
		Connection conn = getConnection();
		Student student = sdao.selectOne(conn, id, treasure);
		close(conn);
		return student;
	}



	public int updatestudentpassword(String cryptoPwd, String id) {
		Connection conn = getConnection();
		int result = sdao.updatestudentpassword(conn, cryptoPwd, id);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}



	public int updateStudent(Student student) {
		Connection conn = getConnection();
		int result = sdao.updateStudent(conn, student);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	

}
