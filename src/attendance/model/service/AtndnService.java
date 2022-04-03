package attendance.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.commit;
import static common.JDBCTemp.getConnection;
import static common.JDBCTemp.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import attendance.model.dao.AtndnDao;
import attendance.model.vo.Atndn;


public class AtndnService {
	private AtndnDao adao = new AtndnDao(); 
	public AtndnService() {}
	
	public ArrayList<Atndn> selectMyLctr(String sid) {
		Connection conn = getConnection();
		 ArrayList<Atndn>  list = adao.selectMyLctr(conn, sid);
		close(conn);
		return list;
	}
	
	/*
	 * public ArrayList<Atndn> AtndnList(String id) { Connection conn =
	 * getConnection(); ArrayList<Atndn> list = adao.AtndnList(conn, id);
	 * close(conn); return list; }
	 */
	
	public ArrayList<Atndn> selectLctrAtndn(String sid){
		Connection conn = getConnection();
		 ArrayList<Atndn>  list = adao.selectLctrAtndn(conn, sid);
		close(conn);
		return list;
	}


 //성적이랑 합침 
	public ArrayList<Atndn> selectProfAtndnList(String pid, String semester, String lcode) {
		Connection conn = getConnection();
		 ArrayList<Atndn>  list = adao.selectProfAtndnList(conn, pid, semester, lcode);
		close(conn);
		return list;
	}

	public int updateAtndn(Atndn atndn) {
		Connection conn = getConnection();
		int result = adao.updateAtndn(conn, atndn);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int updateWeekAll(ArrayList<Atndn> list2) {
		//출결 여러개 업데이트
		Connection conn = getConnection();
		int r = adao.updateWeekAll(conn,list2);
		if(r > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return r;
	}

	public ArrayList<Atndn> selectMyLctrSemstr(String sid, String semester) {
		Connection conn = getConnection();
		 ArrayList<Atndn>  list = adao.selectMyLctrSemstr(conn, sid, semester);
		close(conn);
		return list;
	}

	
	//과목하나조회
	public Atndn selectOneAtndn(String sid, String lcode) {
		Connection conn = getConnection();
		Atndn atndn = adao.selectOneAtndn(conn, sid, lcode);
		close(conn);
		return atndn;
	}

}
