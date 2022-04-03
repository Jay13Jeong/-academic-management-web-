package lectureScore.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import attendance.model.vo.Atndn;

import static common.JDBCTemp.*;
import lectureScore.model.vo.LectureScore;

public class LectureScoreDao {

	public LectureScoreDao() {
	}

	// 학생의 과목별 성적 조회
	public ArrayList<LectureScore> selectLectureScore(Connection conn, String sid, String semester) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<LectureScore> list = new ArrayList<LectureScore>();

		String query = "select receptionno, sid, lcode, lname, category, lpoint, grade, retake from LScoreView where sid= ? and semester = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, sid);
			pstmt.setString(2, semester);
			rset = pstmt.executeQuery();

			while (rset.next()) {
				LectureScore lscore = new LectureScore();

				lscore.setSid(sid);
				lscore.setLcode(rset.getString("lcode"));
				lscore.setLname(rset.getString("lname"));
				lscore.setCategory(rset.getString("category"));
				lscore.setLpoint(rset.getInt("lpoint"));
				lscore.setGrade(rset.getString("grade"));
				lscore.setRetake(rset.getString("retake").equals("Y") ? "재수강" : "-");

				list.add(lscore);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return list;
	}

	// 교수 성적 목록 출력
	public ArrayList<LectureScore> selectProfLectureList(Connection conn, String pid, String semester) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<LectureScore> list = new ArrayList<LectureScore>();

		String query = "select distinct p.id pid, semester, category, l.lcode, lname, capacity from professor p "
				+ "join lecture l on p.id=l.id join lapplication la on l.lcode=la.lcode "
				+ "where p.id = ? and semester = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, pid);
			pstmt.setString(2, semester);
			rset = pstmt.executeQuery();

			while (rset.next()) {
				LectureScore lscore = new LectureScore();

				lscore.setPid(pid);
				lscore.setSemester(rset.getString("semester"));
				lscore.setCategory(rset.getString("category"));
				lscore.setLcode(rset.getString("lcode"));
				lscore.setLname(rset.getString("lname"));
				lscore.setCapacity(rset.getInt("capacity"));

				list.add(lscore);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return list;
	}

	// 교수 성적입력페이지 이동
	public ArrayList<LectureScore> selectProfLectureScore(Connection conn, String lname, String semester) {
		ArrayList<LectureScore> list = new ArrayList<LectureScore>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select receptionno, lname, categoryname, majorname, sid, sname, retake, atndnscore, midscore, finalscore, totalscore, grade "
				+ "from LscoreView where lname = ? and semester = ? ";

		try {
			pstmt = conn.prepareStatement(query);
			System.out.println(lname);
			System.out.println(semester);
			pstmt.setString(1, lname);
			pstmt.setString(2, semester);

			rset = pstmt.executeQuery();

			while (rset.next()) {
				LectureScore lscore = new LectureScore();

				lscore.setReceptionno(rset.getString("receptionno"));
				lscore.setCategoryname(rset.getString("categoryname"));
				lscore.setMajorname(rset.getString("majorname"));
				lscore.setSid(rset.getString("sid"));
				lscore.setSname(rset.getString("sname"));
				lscore.setRetake(rset.getString("retake").equals("Y") ? "Y" : "N");
				lscore.setAtndnscore(rset.getInt("atndnscore"));
				lscore.setMidscore(rset.getInt("midscore"));
				lscore.setFinalscore(rset.getInt("finalscore"));
				lscore.setTotalscore(rset.getInt("totalscore"));
				lscore.setGrade(rset.getString("grade"));

				list.add(lscore);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}

	// 성적 업데이트

	// 성적
	public int deleteScore(Connection conn, LectureScore lscore) {
		int result = 0;
		PreparedStatement pstmt = null;

		String query = "insert into lectureScore values(atndnscore=?, midscore=?, finalscore=?, totalscore=?, grade=?)";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, lscore.getAtndnscore());
			pstmt.setInt(2, lscore.getMidscore());
			pstmt.setInt(3, lscore.getFinalscore());
			pstmt.setInt(4, (lscore.getAtndnscore() + lscore.getMidscore() + lscore.getFinalscore()));
			pstmt.setString(5, lscore.getGrade());
			pstmt.setString(6, lscore.getReceptionno());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}

	// 관리자전체조회
	public ArrayList<LectureScore> selectList(Connection conn) {
		ArrayList<LectureScore> list = new ArrayList<LectureScore>();
		Statement stmt = null;
		ResultSet rset = null;

		String query = "select semester, lcode, category, lname, sid, sname,categoryname, "
				+ "majorname, retake, grade, pid, pname from LscoreView";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);

			while (rset.next()) {
				LectureScore lscore = new LectureScore();
				lscore.setSemester(rset.getString("semester"));
				lscore.setLcode(rset.getString("lcode"));
				lscore.setCategory(rset.getString("category"));
				lscore.setLname(rset.getString("lname"));
				lscore.setSid(rset.getString("sid"));
				lscore.setSname(rset.getString("sname"));
				lscore.setCategoryname(rset.getString("categoryname"));
				lscore.setMajorname(rset.getString("majorname"));
				lscore.setRetake(rset.getString("retake"));
				lscore.setGrade(rset.getString("Grade"));
				lscore.setPid(rset.getString("pid"));
				lscore.setPname(rset.getString("pname"));

				list.add(lscore);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}

		return list;
	}

	// 학생조회
	public ArrayList<LectureScore> selectSearchUserid(Connection conn, String keyword) {
		ArrayList<LectureScore> list = new ArrayList<LectureScore>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select semester, lcode, category, lname, sid, sname,categoryname, "
				+ "majorname, retake, grade, pid, pname from LscoreView where sname like ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "%" + keyword + "%");
			rset = pstmt.executeQuery();

			while (rset.next()) {
				LectureScore lscore = new LectureScore();
				lscore.setSemester(rset.getString("semester"));
				lscore.setLcode(rset.getString("lcode"));
				lscore.setCategory(rset.getString("category"));
				lscore.setLname(rset.getString("lname"));
				lscore.setSid(rset.getString("sid"));
				lscore.setSname(rset.getString("sname"));
				lscore.setCategoryname(rset.getString("categoryname"));
				lscore.setMajorname(rset.getString("majorname"));
				lscore.setRetake(rset.getString("retake"));
				lscore.setGrade(rset.getString("Grade"));
				lscore.setPid(rset.getString("pid"));
				lscore.setPname(rset.getString("pname"));

				list.add(lscore);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return list;
	}
	
	
	//강의명조회 
	public ArrayList<LectureScore> selectSearchLname(Connection conn, String keyword) {
		ArrayList<LectureScore> list = new ArrayList<LectureScore>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select semester, lcode, category, lname, sid, sname,categoryname, "
				+ "majorname, retake, grade, pid, pname from LscoreView where lname like ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "%" + keyword + "%");
			rset = pstmt.executeQuery();

			while (rset.next()) {
				LectureScore lscore = new LectureScore();
				lscore.setSemester(rset.getString("semester"));
				lscore.setLcode(rset.getString("lcode"));
				lscore.setCategory(rset.getString("category"));
				lscore.setLname(rset.getString("lname"));
				lscore.setSid(rset.getString("sid"));
				lscore.setSname(rset.getString("sname"));
				lscore.setCategoryname(rset.getString("categoryname"));
				lscore.setMajorname(rset.getString("majorname"));
				lscore.setRetake(rset.getString("retake"));
				lscore.setGrade(rset.getString("Grade"));
				lscore.setPid(rset.getString("pid"));
				lscore.setPname(rset.getString("pname"));

				list.add(lscore);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return list;
	}

	//성적업데이트
	public int updateScore(Connection conn, LectureScore lscore) {
		int result = 0;
		PreparedStatement pstmt = null;
		System.out.println("쿼리문시작");
		
		String query = "update lecturescore set atndnscore = ?, midscore = ?, finalscore = ?, "
				+ "totalscore = round((?)/3,0), grade = ? " 
				+ "where receptionno = ?";
		
		  try { 
			  pstmt = conn.prepareStatement(query); 
			  pstmt.setInt(1, lscore.getAtndnscore());
			  pstmt.setInt(2, lscore.getMidscore());
			  pstmt.setInt(3, lscore.getFinalscore());
			  pstmt.setInt(4,lscore.getAtndnscore() + lscore.getMidscore() + lscore.getFinalscore());
			  pstmt.setString(5, lscore.getGrade());
			  pstmt.setString(6, lscore.getReceptionno());
		 
			  result = pstmt.executeUpdate();
			  

		   } catch (Exception e) { 
			   e.printStackTrace(); 
		   } finally { 
			   close(pstmt); 
		   }
		  return result;
		  
	}
}
