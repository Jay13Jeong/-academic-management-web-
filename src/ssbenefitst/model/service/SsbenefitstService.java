package ssbenefitst.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.commit;
import static common.JDBCTemp.getConnection;
import static common.JDBCTemp.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import ssbenefitst.model.dao.SsbenefitstDao;
import ssbenefitst.model.vo.Ssbenefitst;



public class SsbenefitstService {
	private SsbenefitstDao ssstdao = new SsbenefitstDao();
	
	public SsbenefitstService() {};
	
	public ArrayList<Ssbenefitst> selectSsbenefitst(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<Ssbenefitst> list = ssstdao.selectSsbenefitst(conn, currentPage, limit);
		close(conn);
		return list;
	};
	
	public Ssbenefitst selectOneSsbenefitst(int benefitterm, String studentid) {
		Connection conn = getConnection();
		Ssbenefitst ssbenefitst = ssstdao.selectOneSsbenefitst(conn, benefitterm, studentid);
		close(conn);
		return ssbenefitst;
	};
	
	public ArrayList<Ssbenefitst> selectPrivateSsst(String studentid) {
		Connection conn = getConnection();
		ArrayList<Ssbenefitst> list = ssstdao.selectPrivateSsst(conn, studentid);
		close(conn);
		return list;
	}
	
	public int insertSsbenefitst(Ssbenefitst ssst) {
		Connection conn = getConnection();
		int result = ssstdao.insertSsbenefitst(conn, ssst);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	};
	
	public int updateSsbenefitst(Ssbenefitst newssst, Ssbenefitst originssst) {
		Connection conn = getConnection();
		int result = ssstdao.updateSsbenefitst(conn, newssst, originssst);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	};
	
	public int deleteSsbenefitst(int benefitterm, String studentid) {
		Connection conn = getConnection();
		int result = ssstdao.deleteSsbenefitst(conn, benefitterm, studentid);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	};
	
	public ArrayList<String> selectRank(int term, int startrank, int endrank) {
		Connection conn = getConnection();
		ArrayList<String> studentlist = ssstdao.selectRank(conn, term, startrank, endrank);
		close(conn);
		return studentlist; 
	};
	
	public int termPlus(int term){
		Connection conn = getConnection();
		int plusterm = ssstdao.termPlus(conn, term);
		close(conn);
		return plusterm;
	};
	
	public int insertScoreRank(int plusterm, ArrayList<String> studentlist, String ssname) {
		Connection conn = getConnection();
		int result = 0;
		for (int i = 0 ; i < studentlist.size() ; i++) {
			System.out.println(plusterm +"//" + studentlist.get(i) +"//"+ ssname);
			
			result = ssstdao.insertScoreRank(conn, plusterm, studentlist.get(i), ssname);

			if (result > 0) {
				commit(conn);
			}else {
				rollback(conn);
			}
		}
		close(conn);
		return result;
	}

	public int getListCount() {
		Connection conn = getConnection();
		int listCount = ssstdao.getListCount(conn);
		close(conn);
		return listCount;
	}

	
}
