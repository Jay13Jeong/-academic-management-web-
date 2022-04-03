package termScore.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import termScore.model.dao.TermScoreDao;
import termScore.model.vo.TermScore;
import static common.JDBCTemp.*;

public class TermScoreService {
	TermScoreDao tdao = new TermScoreDao();
	
	public TermScoreService(){}
	
	public TermScore selectTotalScore(String sid) {
		Connection conn = getConnection();
		TermScore tscore = tdao.selectTotalScore(conn, sid);
		close(conn);
		return(tscore);
	}
	
	public ArrayList<TermScore> selectTermScore(String sid){
		Connection conn = getConnection();
		ArrayList<TermScore> list = tdao.selectTermScore(conn, sid);
		close(conn);
		return(list);
	}
//////by kyu////
	public ArrayList<TermScore> selectMain(String id) {
		Connection conn = getConnection();
		ArrayList<TermScore> list = tdao.selectMain(conn, id);
		close(conn);
		System.out.println("service"+ list);
		return list;
	}	
////
}