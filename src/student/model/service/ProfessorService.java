package student.model.service;

import static common.JDBCTemp.*;

import java.sql.Connection;


import student.model.dao.ProfessorDao;
import student.model.vo.Professor;

public class ProfessorService {
	//의존성 주입 (DI : Dependancy Injection)
		private ProfessorDao pdao = new  ProfessorDao();
		
		public ProfessorService() {}
		
		public Professor selectOne(String id, String treasure ) {
			Connection conn = getConnection();
			Professor professor = pdao.selectOne(conn, id, treasure);
			close(conn);
			return professor;
		}

		public int updateprofessorpassword(String cryptoPwd, String id) {
			Connection conn = getConnection();
			int result  = pdao.updateprofessorpassword(conn, cryptoPwd , id);
			if(result > 0) {
				commit(conn);
			}else {
				rollback(conn);
			}
			close(conn);
			return result;
		}

		public int updateProfessor(Professor professor) {
			Connection conn = getConnection();
			int result = pdao.updateProfessor(conn, professor);
			if(result > 0) {
				commit(conn);
			}else {
				rollback(conn);
			}
			close(conn);
			return result;
		}
}
