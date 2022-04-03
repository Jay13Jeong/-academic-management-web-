package notice.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import notice.model.vo.Notice;
import static common.JDBCTemp.*;

public class NoticeDao {
	public NoticeDao() {
	}

	public ArrayList<Notice> selectAll(Connection conn) {
		ArrayList<Notice> list = new ArrayList<Notice>();
		Statement stmt = null;
		ResultSet rset = null;

		/*
		 * 번호</th> <th>제목</th> <th>작성자</th> <th>작성날짜</th> <th>글내용</th> <th>파일첨부</th>
		 * <th>조회수
		 */
		String query = "select * from notice order by noticeno,noticedate asc ";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);

			while (rset.next()) {
				Notice notice = new Notice();

				notice.setNoticeNo(rset.getInt("noticeno"));
				notice.setNoticeTitle(rset.getString("noticetitle"));
				notice.setNoticeWriter(rset.getString("noticewriter"));
				notice.setNoticeDate(rset.getDate("noticedate"));
				notice.setNoticeContent(rset.getString("noticecontent").replace("\n", " "));
				notice.setOriginalFile(rset.getString("originalfile"));
				notice.setNoticeReadCount(rset.getInt("noticereadcount"));
				list.add(notice);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rset);
		}
		return list;
	}

	public Notice selectOne(Connection conn, int noticeNo) {
		Notice notice = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select * from notice where noticeno=?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, noticeNo);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				notice = new Notice();
				notice.setNoticeNo(noticeNo);
				notice.setNoticeNo(rset.getInt("NOTICENO"));
				notice.setNoticeTitle(rset.getString("NOTICETITLE"));
				notice.setNoticeWriter(rset.getString("NOTICEWRITER"));
				notice.setNoticeDate(rset.getDate("NOTICEDATE"));
				notice.setNoticeContent(rset.getString("NOTICECONTENT"));
				notice.setOriginalFile(rset.getString("ORIGINALFILE"));
				notice.setRenameFile(rset.getString("RENAMEFILE"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		return notice;
	}

	public int insertNotice(Connection conn, Notice notice) {
		int result = 0;
		PreparedStatement pstmt = null;

		String query = "insert into notice values((select max(noticeno)+1 from notice),'A004',?,?,sysdate,?,?,?,?)";

		try {
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, notice.getNoticeTitle());
			pstmt.setString(2, notice.getNoticeWriter());
			pstmt.setString(3, notice.getNoticeContent());
			pstmt.setString(4, notice.getOriginalFile());
			pstmt.setString(5, notice.getRenameFile());
			pstmt.setInt(6, notice.getNoticeReadCount());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public int updateNotice(Connection conn, Notice notice) {
		int result = 0;
		PreparedStatement pstmt = null;

		String query = "update notice set noticetitle = ? , noticecontent=? , noticedate = sysdate , originalfile=?, renamefile= ?  where noticeno = ? ";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, notice.getNoticeTitle());
			pstmt.setString(2, notice.getNoticeContent());
			pstmt.setString(3, notice.getOriginalFile());
			pstmt.setString(4, notice.getRenameFile());
			pstmt.setInt(5, notice.getNoticeNo());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}

	public int deleteNotice(Connection conn, int noticeNo) {
		int result = 0;
		PreparedStatement pstmt = null;

		String query = "delete from notice where noticeno=?";

		try {
			pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, noticeNo);

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;

	}

	/*
	 * public ArrayList<Notice> selectTop5(Connection conn) { ArrayList<Notice> list
	 * = new ArrayList<Notice>(); System.out.println("도착"); Statement stmt = null;
	 * ResultSet rset = null; String query = "" + "select *" +
	 * "from (SELECT ROWNUM RNUM, " + "        NOTICENO , " +
	 * "        NOTICETITLE, " + "        NOTICEREADCOUNT" +
	 * "    FROM (SELECT * FROM NOTICE ORDER BY NOTICEREADCOUNT DESC)" + "    )" +
	 * "where RNUM >=1 AND RNUM <=5";
	 * 
	 * System.out.println("dao성공!"); try { stmt = conn.createStatement(); rset =
	 * stmt.executeQuery(query);
	 * 
	 * while (rset.next()) { Notice notice = new Notice();
	 * 
	 * notice.setNoticeNo(rset.getInt("NOTICENO"));
	 * notice.setNoticeTitle(rset.getString("NOTICETITLE"));
	 * notice.setNoticeReadCount(rset.getInt("NOTICEREADCOUNT"));
	 * 
	 * list.add(notice); } } catch (Exception e) { e.printStackTrace(); } finally {
	 * close(stmt); close(rset); close(conn); } return list; }
	 */
	public int getListCount(Connection conn) {
		int listCount = 0;
		Statement stmt = null;
		ResultSet rset = null;

		String query = "SELECT COUNT(*) FROM Notice";

		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);

			if (rset.next()) {
				listCount = rset.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}

		return listCount;
	}

	public ArrayList<Notice> selectList(Connection conn, int currentPage, int limit) {
		ArrayList<Notice> list = new ArrayList<Notice>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "SELECT * FROM (SELECT ROWNUM RNUM, noticeno, noticetitle, noticewriter, noticedate, noticecontent, originalfile, "
				+ "                        renamefile, noticereadcount "
				+ "                        FROM (SELECT * FROM notice ORDER BY noticeno desc)) "
				+ "WHERE RNUM >= ? AND RNUM <= ?";

		int startRow = (currentPage - 1) * limit + 1;
		int endRow = startRow + limit - 1;

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);

			rset = pstmt.executeQuery();

			while (rset.next()) {
				Notice notice = new Notice();

				notice.setNoticeNo(rset.getInt("noticeno"));
				notice.setNoticeTitle(rset.getString("noticetitle"));
				notice.setNoticeWriter(rset.getString("noticewriter"));
				notice.setNoticeDate(rset.getDate("noticedate"));
				notice.setNoticeContent(rset.getString("noticecontent"));
				notice.setOriginalFile(rset.getString("originalfile"));
				notice.setRenameFile(rset.getString("renamefile"));
				notice.setNoticeReadCount(rset.getInt("noticereadcount"));

				list.add(notice);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return list;
	}

	public int addReadCount(Connection conn, int noticeno) {
		int result = 0;
		PreparedStatement pstmt = null;

		String query = "update notice set noticereadcount = noticereadcount + 1 where noticeno = ?";
		System.out.println("조회수증가");
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, noticeno);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;

	}

	public ArrayList<Notice> searchList(Connection conn, String keyword, String searchOption) {
		ArrayList<Notice> list = new ArrayList<Notice>();
		System.out.println("searchList dao접속성공!");
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = null;
		if(searchOption.equals("no")){
			
			 query = "select * from notice where noticeno like  ? ORDER BY noticedate desc";
		
		}else if(searchOption.equals("writer")){
		
			 query = "select * from notice where noticewriter like  ? ORDER BY noticedate desc";
		
		}else{
		
			 query = "select * from notice where noticecontent like  ? ORDER BY noticedate desc";
		}

		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, "%"+keyword+"%");
			rset = pstmt.executeQuery();
			while (rset.next()) {
				Notice notice = new Notice();
				
				notice.setNoticeNo(rset.getInt("NOTICENO"));
				notice.setNoticeTitle(rset.getString("NOTICETITLE"));
				notice.setNoticeWriter(rset.getString("NOTICEWRITER"));
				notice.setNoticeDate(rset.getDate("NOTICEDATE"));
				notice.setNoticeContent(rset.getString("NOTICECONTENT"));
				notice.setOriginalFile(rset.getString("ORIGINALFILE"));
				notice.setRenameFile(rset.getString("RENAMEFILE"));
				
				list.add(notice);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		return list;
	}

	public ArrayList<Notice> selectNewTop5(Connection conn) {
		ArrayList<Notice> list = new ArrayList<Notice>();
		
		Statement stmt = null;
		ResultSet rset = null;
		
		String query="SELECT * FROM (SELECT ROWNUM RNUM, NOTICENO, NOTICETITLE, NOTICEDATE FROM (SELECT * FROM NOTICE ORDER BY NOTICEDATE DESC)) WHERE RNUM >= 1 AND RNUM <= 5";  
				
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			while(rset.next()) {
				
				Notice notice = new Notice();
				
				notice.setNoticeNo(rset.getInt("NOTICENO"));
				notice.setNoticeTitle(rset.getString("NOTICETITLE"));
				notice.setNoticeDate(rset.getDate("NOTICEDATE"));
				
				
				list.add(notice);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(stmt);
			close(rset);
		}
		System.out.println("멘인의 탑 5dao"+ list);
		return list;
	}	

	

	
}
