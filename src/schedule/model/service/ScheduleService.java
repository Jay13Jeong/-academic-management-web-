package schedule.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.commit;
import static common.JDBCTemp.getConnection;
import static common.JDBCTemp.rollback;

import java.sql.Connection;
import java.util.ArrayList;


import schedule.model.dao.ScheduleDao;
import schedule.model.vo.Schedule;

public class ScheduleService {

	private ScheduleDao sdao = new ScheduleDao();
		
	public ScheduleService() {}
	


	public ArrayList<Schedule> select1() {
		Connection conn = getConnection();

		ArrayList<Schedule> list1 = sdao.selectList1(conn);

		
		close(conn);
		return list1;
	}

	public ArrayList<Schedule> select2() {
		Connection conn = getConnection();

		ArrayList<Schedule> list2 = sdao.selectList2(conn);

		
		close(conn);
		return list2;
	}

	public ArrayList<Schedule> select3() {
		Connection conn = getConnection();

		ArrayList<Schedule> list3 = sdao.selectList3(conn);

		
		close(conn);
		return list3;
	}

	public ArrayList<Schedule> select4() {
		Connection conn = getConnection();

		ArrayList<Schedule> list4 = sdao.selectList4(conn);

		
		close(conn);
		return list4;
	}

	public ArrayList<Schedule> select5() {
		Connection conn = getConnection();

		ArrayList<Schedule> list5 = sdao.selectList5(conn);

		
		close(conn);
		return list5;
	}

	public ArrayList<Schedule> select6() {
		Connection conn = getConnection();

		ArrayList<Schedule> list6 = sdao.selectList6(conn);

		
		close(conn);
		return list6;
	}

	public ArrayList<Schedule> select7() {
		Connection conn = getConnection();

		ArrayList<Schedule> list7 = sdao.selectList7(conn);

		
		close(conn);
		return list7;
	}

	public ArrayList<Schedule> select8() {
		Connection conn = getConnection();

		ArrayList<Schedule> list8 = sdao.selectList8(conn);

		
		close(conn);
		return list8;
	}

	public ArrayList<Schedule> select9() {
		Connection conn = getConnection();

		ArrayList<Schedule> list9 = sdao.selectList9(conn);

		
		close(conn);
		return list9;
	}

	public ArrayList<Schedule> select10() {
		Connection conn = getConnection();

		ArrayList<Schedule> list10 = sdao.selectList10(conn);

		
		close(conn);
		return list10;
	}

	public ArrayList<Schedule> select11() {
		Connection conn = getConnection();

		ArrayList<Schedule> list11 = sdao.selectList11(conn);

		
		close(conn);
		return list11;
	}

	public ArrayList<Schedule> select12() {
		Connection conn = getConnection();

		ArrayList<Schedule> list12 = sdao.selectList12(conn);

		
		close(conn);
		return list12;
	}

	public ArrayList<Schedule> select13() {
		Connection conn = getConnection();

		ArrayList<Schedule> list13 = sdao.selectList13(conn);

		
		close(conn);
		return list13;
	}

	public ArrayList<Schedule> select14() {
		Connection conn = getConnection();

		ArrayList<Schedule> list14 = sdao.selectList14(conn);

		
		close(conn);
		return list14;
	}



	public int getListCount() {
		Connection conn = getConnection();
		int listCount = sdao.getListCount(conn);
		close(conn);
		return listCount;
	}



	public ArrayList<Schedule> selectList(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<Schedule> list = sdao.selectList(conn, currentPage, limit);
		close(conn);
		return list;
	}



	public int newSchedule(Schedule schedule) {
		Connection conn = getConnection();
		int result = sdao.newSchedule(conn, schedule);
		if(result > 0) 
			commit(conn);
		else 
			rollback(conn);
		close(conn);
		System.out.println(result+"service");
		return result;
		
	}



	public Schedule selectSchedule(String scheduleid) {
		Connection conn = getConnection();
		Schedule schedule = sdao.selectOne(conn, scheduleid);
		
		close(conn);
		return schedule;
		
	}



	public int updateSchedule(Schedule schedule) {
		Connection conn = getConnection();
		int result = sdao.updateSchedule(conn, schedule);
		if(result > 0) 
			commit(conn);
		else
			rollback(conn);
		
		close(conn);
		return result;
			
		}



	public int deleteSchedule(String scheduleid) {
		Connection conn = getConnection();
		int result = sdao.deleteSchedule(conn, scheduleid);
		if(result > 0)
			commit(conn);
		else
			rollback(conn);
		
		close(conn);
		return result;
			
		
	}



	public ArrayList<Schedule> selectMonth() {
		Connection conn = getConnection();
		ArrayList<Schedule> list = sdao.selectMonth(conn);
		close(conn);
		System.out.println("service"+ list);
		return list;
	}

		
		
	






}





















