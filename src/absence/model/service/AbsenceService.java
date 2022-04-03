package absence.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.commit;
import static common.JDBCTemp.getConnection;
import static common.JDBCTemp.rollback;

import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;

import absence.model.dao.AbsenceDao;
import absence.model.vo.Absence;

public class AbsenceService {
	private AbsenceDao adao = new AbsenceDao();
	
	public AbsenceService() {};
	
	public ArrayList<Absence> selectAbsence() {
		Connection conn = getConnection();
		ArrayList<Absence> list = adao.selectAbsence(conn);
		close(conn);
		return list;
	};
	
	public Absence selectOneAbsence(String requestid) {
		Connection conn = getConnection();
		Absence absence = adao.selectOneAbsence(conn, requestid);
		close(conn);
		return absence;
	};
	
	public ArrayList<Absence> selectPrivateAbsence(String studentid) {
		Connection conn = getConnection();
		ArrayList<Absence> list = adao.selectPrivateAbsence(conn, studentid);
		close(conn);
		return list;
	};
	
	public ArrayList<Absence> selectApprovalAbsence(String able) {
		Connection conn = getConnection();
		ArrayList<Absence> list = adao.selectApprovalAbsence(conn, able);
		close(conn);
		return list;
	};
	
	public int insertAbsence(String value, String studentid) {
		Connection conn = getConnection();
		int result = adao.insertAbsence(conn, value, studentid);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	};
	
	public int updateYAbsence(String requestid) {
		Connection conn = getConnection();
		int result = adao.updateYAbsence(conn, requestid);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	};
	
	public int updateNAbsence(String requestid) {
		Connection conn = getConnection();
		int result = adao.updateNAbsence(conn, requestid);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	};
	
	public int deleteAbsence(String requestid) {
		Connection conn = getConnection();
		int result = adao.deleteAbsence(conn, requestid);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public ArrayList<Absence> selectABA(String value) {
		Connection conn = getConnection();
		ArrayList<Absence> list = adao.selectABA(conn, value);
		close(conn);
		return list;
	};
	
	public float canceldateChk(String requestid) {
		Connection conn = getConnection();
		float date = adao.canceldateChk(conn, requestid);
		close(conn);
		return date;
	}
	
	public String selectApprovalChk(String requestid) {
		Connection conn = getConnection();
		String approval = adao.selectApprovalChk(conn, requestid);
		close(conn);
		return approval;
	}
	
	public int studentAbsenceChange(String id) {
		Connection conn = getConnection();
		int result = adao.studentAbsenceChange(conn, id);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	public int studentCountPlus(String id) {
		Connection conn = getConnection();
		int result = adao. studentCountPlus(conn, id);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	public int studentCountMinus(String id) {
		Connection conn = getConnection();
		int result = adao. studentCountMinus(conn, id);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
}
