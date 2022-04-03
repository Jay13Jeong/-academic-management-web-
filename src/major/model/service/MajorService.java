package major.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.commit;
import static common.JDBCTemp.getConnection;
import static common.JDBCTemp.rollback;

import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;

import major.model.dao.MajorDao;
import major.model.vo.Major;
import major.model.vo.Major1;
import major.model.vo.Major2;
import notice.model.vo.Notice;



public class MajorService {
	private MajorDao mdao = new MajorDao();
	
	public MajorService() {}

	

	public int getListCount() {
		 Connection conn = getConnection();
	      int listCount = mdao.getListCount(conn);
	      close(conn);
	      return listCount;
	   }

	public int insertMajor(Major major) {
		Connection conn = getConnection();
		int result = mdao.insertMajor(conn,major);
		if(result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		return result;
	}

	public Major selectMajor(String majorno) {
		Connection conn = getConnection();
		Major major = mdao.selectOne(conn, majorno);
		close(conn);
		return major;
	}

	public int deleteMajor(String majorNo) {
		Connection conn = getConnection();
		int result = mdao.deleteMajor(conn, majorNo);
		System.out.println("service "+ result);
		if (result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
			close(conn);
		
		return result;
	}

	public Major selectMajor(int majorNo) {
		Connection conn = getConnection();
		Major major = mdao.selectOne(conn, majorNo);
		close(conn);
		return major;
	}

	public int updateMajor(Major major) {
		Connection conn = getConnection();
		int result = mdao.updateNotice(conn, major);
		if (result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		System.out.println("닫기껄껄");
		return result;
	}

	public Major1 selectOneTuition(String id) {
		Connection conn = getConnection();
		System.out.println("======================"+id);
		Major1 major1 = mdao.selectOneTuition(conn, id);
		
		close(conn);
		
		return major1;
	}

	public String termCheck() {
		Connection conn  = getConnection();
		Date term = mdao.firstTermCheck(conn);
		String thisterm = null;
		
		if (term != null) {
			Date termcheck = mdao.secondCheck(conn);
			
			if (termcheck != null) {
				thisterm = "1학기";
			}else {
				thisterm = "2학기";
			}
			
		}else {
			Date termcheck = mdao.second2Check(conn);
			
			if (termcheck != null) {
				thisterm = "2학기";
			}else {
				thisterm = "1학기";
			}
		}
		close(conn);
		return thisterm;
	}

	

	

	public Major2 selectOneValueAndBene(String id) {
		Connection conn = getConnection();
		Major2 major2 = mdao.OneValueAndBene(conn, id);
		System.out.println(major2);
		close(conn);
		
		return major2;
	}

	public ArrayList<Major> selectList() {
		Connection conn = getConnection();
		ArrayList<Major> list = mdao.selectList(conn);
		close(conn);
		return list;
	}

	/*
	 * public Date paymentCheck() { Connection conn = getConnection(); //달만 뽑아오기
	 * paymentCheck int paymentCheck = mdao.paymentCheck(conn);
	 * System.out.println("payment =" +paymentCheck); Date payment = null; //number로
	 * 치환한 현재날짜에 달만 추출하여 비교 // 7월밑이면 1학기 7월 위면 2학기 로 구분 if(paymentCheck < 7) {
	 * //1학기일떄 ! //payCheck1 메서드에서 스케쥴 start year,month,day를 가져옴 // 쿼리문에서 조건에
	 * payment = mdao.paymentCheck1(conn); if(payment != null) { //값이있을때
	 * 
	 * }else {
	 * 
	 * } }else { payment = mdao.paymentCheck2(conn); } close(conn); return payment;
	 * }
	 * 
	 * 
	 * 
	 */

	
	
	
	//작성 서비스
	
	
}
