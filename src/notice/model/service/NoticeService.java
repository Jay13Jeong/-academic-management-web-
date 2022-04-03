package notice.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.commit;
import static common.JDBCTemp.getConnection;
import static common.JDBCTemp.rollback;

import java.sql.Connection;
import java.util.ArrayList;


import notice.model.dao.NoticeDao;
import notice.model.vo.Notice;

public class NoticeService {
	// 의존성 주입(DI : Dependancy Injection)
	private NoticeDao ndao = new NoticeDao();

	public NoticeService() {
	}

	public ArrayList<Notice> selectAll() {
		Connection conn = getConnection();
		ArrayList<Notice> list = ndao.selectAll(conn);
		close(conn);
		return list;
	}

	public Notice selectNotice(int noticeNo) {
		Connection conn = getConnection();
		Notice notice = ndao.selectOne(conn, noticeNo);
		close(conn);
		return notice;
	}

	public int insertNotice(Notice notice) {
		Connection conn = getConnection();
		int result = ndao.insertNotice(conn, notice);
		if (result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		return result;
	}

	public int updateNotice(Notice notice) {
		Connection conn = getConnection();
		int result = ndao.updateNotice(conn, notice);
		if (result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		return result;
	}

	public int deleteNotice(int noticeNo) {
		Connection conn = getConnection();
		int result = ndao.deleteNotice(conn, noticeNo);
		if (result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		return result;
	}


	public int getListCount() {
      Connection conn = getConnection();
      int listCount = ndao.getListCount(conn);
      close(conn);
      return listCount;
   }

	public ArrayList<Notice> selectList(int currentPage, int limit) {
      Connection conn = getConnection();
      ArrayList<Notice> list = ndao.selectList(conn, currentPage, limit);
      close(conn);
      return list;
   }

	public void addReadCount(int noticeno) {
		Connection conn = getConnection();
	      int result = ndao.addReadCount(conn, noticeno);
	      if( result > 0) 
	         commit(conn);
	      else 
	         rollback(conn);
	      close(conn);
	   }

	

	public ArrayList<Notice> searchList(String keyword, String searchOption) {
		Connection conn = getConnection();
		ArrayList<Notice> list = ndao.searchList(conn,keyword,searchOption);
		close(conn);
		return list;
	}

	public ArrayList<Notice> selectNewTop5() {
		Connection conn = getConnection();
		ArrayList<Notice> list = ndao.selectNewTop5(conn);
		close(conn);
		return list;
	}
	

	
	

}
