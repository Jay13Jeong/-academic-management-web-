package student.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import student.model.vo.Professor;
import student.model.vo.Student;

public class ProfessorDao {
	public ProfessorDao() {
	}

	public int insert(Connection conn, Student student) {
		int result = 0;
		PreparedStatement pstmt = null;

		String query = "insert into professor values (?, ?, ?, ?, ?, default, ?, ?, ?, ?,sysdate,defalut,defalut,?)";

		try {
			pstmt = conn.prepareStatement(query);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	// 한명선택

	public Professor selectOne(Connection conn, String id, String treasure) {
		Professor professor = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select * from professor where id = ? and treasure = ? ";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, treasure);
			rset = pstmt.executeQuery(); // 쿼리를 디비로 보냄

			if (rset.next()) {
				professor = new Professor();

				professor.setId(rset.getString("id"));
				professor.setTreasure(rset.getString("treasure"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return professor;
	}

	// 전체조회
	public ArrayList<Student> selectList(Connection conn) {
		ArrayList<Student> list = new ArrayList<Student>();
		Statement stmt = null;
		ResultSet rset = null;

		String query = "select * from student";

		try {
			stmt = conn.createStatement();

			rset = stmt.executeQuery(query);

			while (rset.next()) {
				Student student = new Student();

				list.add(student);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}

		return list;
	}

	public int update(Connection conn, Student student) {
		int result = 0;
		PreparedStatement pstmt = null;

		String query = "update student set studentid = ? where majorno = ?";

		try {
			pstmt = conn.prepareStatement(query);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public int delete(Connection conn, String studentid) {
		int result = 0;
		PreparedStatement pstmt = null;

		String query = "delete from student where studentid = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, studentid);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public int updateprofessorpassword(Connection conn, String cryptoPwd, String id) {
		int result = 0;
		PreparedStatement pstmt = null;
		String query = "update professor set password =? where id = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, cryptoPwd);
			pstmt.setString(2, id);
			result = pstmt.executeUpdate(); // result 값을 실행을함
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;

	}

	public int updateProfessor(Connection conn, Professor professor) {
		int result = 0;
		// 대문자로시작(클래스)자료형 변수명
		PreparedStatement pstmt = null;
		String query = "update professor set password = ?, address = ?, phone = ?, email = ?, treasure = ? where id = ? ";
		try {

			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, professor.getPassword());
			pstmt.setString(2, professor.getAddress());
			pstmt.setString(3, professor.getPhone());
			pstmt.setString(4, professor.getEmail());
			pstmt.setString(5, professor.getTreasure());
			pstmt.setString(6, professor.getId());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);

		}

		return result;
	}

}