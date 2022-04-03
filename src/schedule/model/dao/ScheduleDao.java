package schedule.model.dao;

import static common.JDBCTemp.close;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import schedule.model.vo.Schedule;


public class ScheduleDao {

	public ScheduleDao() {}
	

	public ArrayList<Schedule> selectList1(Connection conn) {
		ArrayList<Schedule> list1 =  new ArrayList<Schedule>();
	
		
		Statement stmt = null;
		ResultSet rset = null;
		
		
		
		String query = "select * from schedule where (schstartyear = to_char(sysdate, 'YYYY')) and (schstartmonth = 1) order by 4, 5, 6";
	
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
		
		while(rset.next()) {
			Schedule schedule = new Schedule();
			
			schedule.setSchname(rset.getString("schname"));
			schedule.setSchstartyear(rset.getInt("schstartyear"));
			schedule.setSchstartmonth(rset.getInt("schstartmonth"));
			schedule.setSchstartdate(rset.getInt("schstartdate"));
			schedule.setSchendyear(rset.getInt("schendyear"));
			schedule.setSchendmonth(rset.getInt("schendmonth"));
			schedule.setSchenddate(rset.getInt("schenddate"));
			
			list1.add(schedule);
	
			
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		close(rset);
		close(stmt);
	}
		
	System.out.println(list1);
		
	return list1;
	
	}

	public ArrayList<Schedule> selectList2(Connection conn) {
		ArrayList<Schedule> list2=  new ArrayList<Schedule>();
	
		
		Statement stmt = null;
		ResultSet rset = null;
		
		
		
		String query = "select * from schedule where (schstartyear = to_char(sysdate, 'YYYY')) and (schstartmonth = 2) order by 4, 5, 6";
	
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
		
		while(rset.next()) {
			Schedule schedule = new Schedule();
			
			schedule.setSchname(rset.getString("schname"));
			schedule.setSchstartyear(rset.getInt("schstartyear"));
			schedule.setSchstartmonth(rset.getInt("schstartmonth"));
			schedule.setSchstartdate(rset.getInt("schstartdate"));
			schedule.setSchendyear(rset.getInt("schendyear"));
			schedule.setSchendmonth(rset.getInt("schendmonth"));
			schedule.setSchenddate(rset.getInt("schenddate"));
			
			list2.add(schedule);
	
			
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		close(rset);
		close(stmt);
	}
		
	System.out.println(list2);
		
	return list2;
	
	
	}

	public ArrayList<Schedule> selectList3(Connection conn) {
ArrayList<Schedule> list3 =  new ArrayList<Schedule>();
	
		
		Statement stmt = null;
		ResultSet rset = null;
		
		
		
		String query = "select * from schedule where (schstartyear = to_char(sysdate, 'YYYY')) and (schstartmonth = 3) order by 4, 5, 6";
	
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
		
		while(rset.next()) {
			Schedule schedule = new Schedule();
			
			schedule.setSchname(rset.getString("schname"));
			schedule.setSchstartyear(rset.getInt("schstartyear"));
			schedule.setSchstartmonth(rset.getInt("schstartmonth"));
			schedule.setSchstartdate(rset.getInt("schstartdate"));
			schedule.setSchendyear(rset.getInt("schendyear"));
			schedule.setSchendmonth(rset.getInt("schendmonth"));
			schedule.setSchenddate(rset.getInt("schenddate"));
			
			list3.add(schedule);
	
			
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		close(rset);
		close(stmt);
	}
		
	System.out.println(list3);
		
	return list3;
	
	}

	public ArrayList<Schedule> selectList4(Connection conn) {
ArrayList<Schedule> list4 =  new ArrayList<Schedule>();
	
		
		Statement stmt = null;
		ResultSet rset = null;
		
		
		
		String query = "select * from schedule where (schstartyear = to_char(sysdate, 'YYYY')) and (schstartmonth = 4) order by 4, 5, 6";
	
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
		
		while(rset.next()) {
			Schedule schedule = new Schedule();
			
			schedule.setSchname(rset.getString("schname"));
			schedule.setSchstartyear(rset.getInt("schstartyear"));
			schedule.setSchstartmonth(rset.getInt("schstartmonth"));
			schedule.setSchstartdate(rset.getInt("schstartdate"));
			schedule.setSchendyear(rset.getInt("schendyear"));
			schedule.setSchendmonth(rset.getInt("schendmonth"));
			schedule.setSchenddate(rset.getInt("schenddate"));
			
			list4.add(schedule);
	
			
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		close(rset);
		close(stmt);
	}
		
	System.out.println(list4);
		
	return list4;
	
	}

	public ArrayList<Schedule> selectList5(Connection conn) {
ArrayList<Schedule> list5 =  new ArrayList<Schedule>();
	
		
		Statement stmt = null;
		ResultSet rset = null;
		
		
		
		String query = "select * from schedule where (schstartyear = to_char(sysdate, 'YYYY')) and (schstartmonth = 5) order by 4, 5, 6";
	
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
		
		while(rset.next()) {
			Schedule schedule = new Schedule();
			
			schedule.setSchname(rset.getString("schname"));
			schedule.setSchstartyear(rset.getInt("schstartyear"));
			schedule.setSchstartmonth(rset.getInt("schstartmonth"));
			schedule.setSchstartdate(rset.getInt("schstartdate"));
			schedule.setSchendyear(rset.getInt("schendyear"));
			schedule.setSchendmonth(rset.getInt("schendmonth"));
			schedule.setSchenddate(rset.getInt("schenddate"));
			
			list5.add(schedule);
	
			
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		close(rset);
		close(stmt);
	}
		
	System.out.println(list5);
		
	return list5;
	
	}

	public ArrayList<Schedule> selectList6(Connection conn) {
ArrayList<Schedule> list6 =  new ArrayList<Schedule>();
	
		
		Statement stmt = null;
		ResultSet rset = null;
		
		
		
		String query = "select * from schedule where (schstartyear = to_char(sysdate, 'YYYY')) and (schstartmonth = 6) order by 4, 5, 6";
	
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
		
		while(rset.next()) {
			Schedule schedule = new Schedule();
			
			schedule.setSchname(rset.getString("schname"));
			schedule.setSchstartyear(rset.getInt("schstartyear"));
			schedule.setSchstartmonth(rset.getInt("schstartmonth"));
			schedule.setSchstartdate(rset.getInt("schstartdate"));
			schedule.setSchendyear(rset.getInt("schendyear"));
			schedule.setSchendmonth(rset.getInt("schendmonth"));
			schedule.setSchenddate(rset.getInt("schenddate"));
			
			list6.add(schedule);
	
			
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		close(rset);
		close(stmt);
	}
		
	System.out.println(list6);
		
	return list6;
	
	}

	public ArrayList<Schedule> selectList7(Connection conn) {
ArrayList<Schedule> list7 =  new ArrayList<Schedule>();
	
		
		Statement stmt = null;
		ResultSet rset = null;
		
		
		
		String query = "select * from schedule where (schstartyear = to_char(sysdate, 'YYYY')) and (schstartmonth = 7) order by 4, 5, 6";
	
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
		
		while(rset.next()) {
			Schedule schedule = new Schedule();
			
			schedule.setSchname(rset.getString("schname"));
			schedule.setSchstartyear(rset.getInt("schstartyear"));
			schedule.setSchstartmonth(rset.getInt("schstartmonth"));
			schedule.setSchstartdate(rset.getInt("schstartdate"));
			schedule.setSchendyear(rset.getInt("schendyear"));
			schedule.setSchendmonth(rset.getInt("schendmonth"));
			schedule.setSchenddate(rset.getInt("schenddate"));
			
			list7.add(schedule);
	
			
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		close(rset);
		close(stmt);
	}
		
	System.out.println(list7);
		
	return list7;
	
	}
	public ArrayList<Schedule> selectList8(Connection conn) {
ArrayList<Schedule> list8 =  new ArrayList<Schedule>();
	
		
		Statement stmt = null;
		ResultSet rset = null;
		
		
		
		String query = "select * from schedule where (schstartyear = to_char(sysdate, 'YYYY')) and (schstartmonth = 8) order by 4, 5, 6";
	
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
		
		while(rset.next()) {
			Schedule schedule = new Schedule();
			
			schedule.setSchname(rset.getString("schname"));
			schedule.setSchstartyear(rset.getInt("schstartyear"));
			schedule.setSchstartmonth(rset.getInt("schstartmonth"));
			schedule.setSchstartdate(rset.getInt("schstartdate"));
			schedule.setSchendyear(rset.getInt("schendyear"));
			schedule.setSchendmonth(rset.getInt("schendmonth"));
			schedule.setSchenddate(rset.getInt("schenddate"));
			
			list8.add(schedule);
	
			
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		close(rset);
		close(stmt);
	}
		
	System.out.println(list8);
		
	return list8;
	
	}

	public ArrayList<Schedule> selectList9(Connection conn) {
ArrayList<Schedule> list9 =  new ArrayList<Schedule>();
	
		
		Statement stmt = null;
		ResultSet rset = null;
		
		
		
		String query = "select * from schedule where (schstartyear = to_char(sysdate, 'YYYY')) and (schstartmonth = 9) order by 4, 5, 6";
	
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
		
		while(rset.next()) {
			Schedule schedule = new Schedule();
			
			schedule.setSchname(rset.getString("schname"));
			schedule.setSchstartyear(rset.getInt("schstartyear"));
			schedule.setSchstartmonth(rset.getInt("schstartmonth"));
			schedule.setSchstartdate(rset.getInt("schstartdate"));
			schedule.setSchendyear(rset.getInt("schendyear"));
			schedule.setSchendmonth(rset.getInt("schendmonth"));
			schedule.setSchenddate(rset.getInt("schenddate"));
			
			list9.add(schedule);
	
			
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		close(rset);
		close(stmt);
	}
		
	System.out.println(list9);
		
	return list9;
	
	}

	public ArrayList<Schedule> selectList10(Connection conn) {
ArrayList<Schedule> list10 =  new ArrayList<Schedule>();
	
		
		Statement stmt = null;
		ResultSet rset = null;
		
		
		
		String query = "select * from schedule where (schstartyear = to_char(sysdate, 'YYYY')) and (schstartmonth = 10) order by 4, 5, 6";
	
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
		
		while(rset.next()) {
			Schedule schedule = new Schedule();
			
			schedule.setSchname(rset.getString("schname"));
			schedule.setSchstartyear(rset.getInt("schstartyear"));
			schedule.setSchstartmonth(rset.getInt("schstartmonth"));
			schedule.setSchstartdate(rset.getInt("schstartdate"));
			schedule.setSchendyear(rset.getInt("schendyear"));
			schedule.setSchendmonth(rset.getInt("schendmonth"));
			schedule.setSchenddate(rset.getInt("schenddate"));
			
			list10.add(schedule);
	
			
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		close(rset);
		close(stmt);
	}
		
	System.out.println(list10);
		
	return list10;
	
	}

	public ArrayList<Schedule> selectList11(Connection conn) {
ArrayList<Schedule> list11 =  new ArrayList<Schedule>();
	
		
		Statement stmt = null;
		ResultSet rset = null;
		
		
		
		String query = "select * from schedule where (schstartyear = to_char(sysdate, 'YYYY')) and (schstartmonth = 11) order by 4, 5, 6";
	
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
		
		while(rset.next()) {
			Schedule schedule = new Schedule();
			
			schedule.setSchname(rset.getString("schname"));
			schedule.setSchstartyear(rset.getInt("schstartyear"));
			schedule.setSchstartmonth(rset.getInt("schstartmonth"));
			schedule.setSchstartdate(rset.getInt("schstartdate"));
			schedule.setSchendyear(rset.getInt("schendyear"));
			schedule.setSchendmonth(rset.getInt("schendmonth"));
			schedule.setSchenddate(rset.getInt("schenddate"));
			
			list11.add(schedule);
	
			
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		close(rset);
		close(stmt);
	}
		
	System.out.println(list11);
		
	return list11;
	
	}

	public ArrayList<Schedule> selectList12(Connection conn) {
ArrayList<Schedule> list12 =  new ArrayList<Schedule>();
	
		
		Statement stmt = null;
		ResultSet rset = null;
		
		
		
		String query = "select * from schedule where (schstartyear = to_char(sysdate, 'YYYY')) and (schstartmonth = 12) order by 4, 5, 6";
	
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
		
		while(rset.next()) {
			Schedule schedule = new Schedule();
			
			schedule.setSchname(rset.getString("schname"));
			schedule.setSchstartyear(rset.getInt("schstartyear"));
			schedule.setSchstartmonth(rset.getInt("schstartmonth"));
			schedule.setSchstartdate(rset.getInt("schstartdate"));
			schedule.setSchendyear(rset.getInt("schendyear"));
			schedule.setSchendmonth(rset.getInt("schendmonth"));
			schedule.setSchenddate(rset.getInt("schenddate"));
			
			list12.add(schedule);
	
			
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		close(rset);
		close(stmt);
	}
		
	System.out.println(list12);
		
	return list12;
	
	}

	public ArrayList<Schedule> selectList13(Connection conn) {
ArrayList<Schedule> list13 =  new ArrayList<Schedule>();
	
		
		Statement stmt = null;
		ResultSet rset = null;
		
		
		
		String query = "select * from schedule where (schstartyear = to_char(sysdate, 'YYYY')+1) and (schstartmonth = 1) order by 4, 5, 6";
	
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
		
		while(rset.next()) {
			Schedule schedule = new Schedule();
			
			schedule.setSchname(rset.getString("schname"));
			schedule.setSchstartyear(rset.getInt("schstartyear"));
			schedule.setSchstartmonth(rset.getInt("schstartmonth"));
			schedule.setSchstartdate(rset.getInt("schstartdate"));
			schedule.setSchendyear(rset.getInt("schendyear"));
			schedule.setSchendmonth(rset.getInt("schendmonth"));
			schedule.setSchenddate(rset.getInt("schenddate"));
			
			list13.add(schedule);
	
			
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		close(rset);
		close(stmt);
	}
		
	System.out.println(list13);
		
	return list13;
	
	}
	public ArrayList<Schedule> selectList14(Connection conn) {
ArrayList<Schedule> list14 =  new ArrayList<Schedule>();
	
		
		Statement stmt = null;
		ResultSet rset = null;
		
		
		
		String query = "select * from schedule where (schstartyear = to_char(sysdate, 'YYYY')+1) and (schstartmonth = 2) order by 4, 5, 6";
	
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
		
		while(rset.next()) {
			Schedule schedule = new Schedule();
			
			schedule.setSchname(rset.getString("schname"));
			schedule.setSchstartyear(rset.getInt("schstartyear"));
			schedule.setSchstartmonth(rset.getInt("schstartmonth"));
			schedule.setSchstartdate(rset.getInt("schstartdate"));
			schedule.setSchendyear(rset.getInt("schendyear"));
			schedule.setSchendmonth(rset.getInt("schendmonth"));
			schedule.setSchenddate(rset.getInt("schenddate"));
			
			list14.add(schedule);
	
			
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		close(rset);
		close(stmt);
	}
		
	System.out.println(list14);
		
	return list14;
	
	}


	public int getListCount(Connection conn) {
		int listCount = 0;
		Statement stmt =null;
		ResultSet rset =null;
		
		String query ="select count(*) from schedule";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				listCount = rset.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return listCount;
	}
	


	public ArrayList<Schedule> selectList(Connection conn, int currentPage, int limit) {
		ArrayList<Schedule> list = new ArrayList<Schedule>();
		PreparedStatement pstmt = null;
	    ResultSet rset = null;
	    
	    
	 
	    String query ="select * from "
	      		+ "(select rownum rnum,SCHEDULEID, ADNO, SCHNAME, SCHSTARTYEAR, SCHSTARTMONTH, SCHSTARTDATE, SCHENDYEAR, SCHENDMONTH, SCHENDDATE "
	      		+ "from (select * from schedule order by scheduleid desc)) "
	      		+ "where rnum >= ? and rnum <= ? ";
	    
	    	int startRow = ( (currentPage - 1) * limit ) + 1;
		      //1페이지면 1~10, 2페이지면 11~20
		      int endRow = startRow + limit - 1;
	    try {
	    	 pstmt = conn.prepareStatement(query);
	         pstmt.setInt(1, startRow);
	         pstmt.setInt(2, endRow);
	         
	         rset = pstmt.executeQuery();
	         
	         while(rset.next()) {
	        	Schedule schedule = new Schedule();
	        	
	        	schedule.setScheduleid(rset.getString("scheduleid"));
	        	schedule.setSchname(rset.getString("schname"));
				schedule.setSchstartyear(rset.getInt("schstartyear"));
				schedule.setSchstartmonth(rset.getInt("schstartmonth"));
				schedule.setSchstartdate(rset.getInt("schstartdate"));
				schedule.setSchendyear(rset.getInt("schendyear"));
				schedule.setSchendmonth(rset.getInt("schendmonth"));
				schedule.setSchenddate(rset.getInt("schenddate"));
				
				list.add(schedule);
	        	 
	        	 
	         }
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
	    return list;
	}


	public int newSchedule(Connection conn, Schedule schedule) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "insert into schedule values(concat('s',(select max(substr(scheduleid,2))+1 from schedule)) , ?, ?, ?, ? ,? ,?, ?, ?)"; 
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, schedule.getAdno());
			pstmt.setString(2, schedule.getSchname());
			pstmt.setInt(3, schedule.getSchstartyear());
			pstmt.setInt(4, schedule.getSchstartmonth());
			pstmt.setInt(5, schedule.getSchstartdate());
			pstmt.setInt(6, schedule.getSchendyear());
			pstmt.setInt(7, schedule.getSchendmonth());
			pstmt.setInt(8, schedule.getSchenddate());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
			close(pstmt);
		}
		System.out.println(result+"dao");
		return result;
	}


	public Schedule selectOne(Connection conn, String scheduleid) {
		Schedule schedule = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		System.out.println(scheduleid);
		String query = "select * from schedule where scheduleid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, scheduleid);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				schedule = new Schedule();
				
				schedule.setScheduleid(scheduleid);
				schedule.setSchname(rset.getString("schname"));
				schedule.setSchstartyear(rset.getInt("schstartyear"));
				schedule.setSchstartmonth(rset.getInt("schstartmonth"));
				schedule.setSchstartdate(rset.getInt("schstartdate"));
				schedule.setSchendyear(rset.getInt("schendyear"));
				schedule.setSchendmonth(rset.getInt("schendmonth"));
				schedule.setSchenddate(rset.getInt("schenddate"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return schedule;
	}


	public int updateSchedule(Connection conn, Schedule schedule) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update schedule set adno = ?, schname = ?, schstartyear = ?, schstartmonth = ?, schstartdate = ?, schendyear = ?, schendmonth = ?, schenddate =? where scheduleid =?";
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, schedule.getScheduleid());
			pstmt.setString(1, schedule.getAdno());
			pstmt.setString(2, schedule.getSchname());
			pstmt.setInt(3, schedule.getSchstartyear());
			pstmt.setInt(4, schedule.getSchstartmonth());
			pstmt.setInt(5, schedule.getSchstartdate());
			pstmt.setInt(6, schedule.getSchendyear());
			pstmt.setInt(7, schedule.getSchendmonth());
			pstmt.setInt(8, schedule.getSchenddate());
			pstmt.setString(9, schedule.getScheduleid());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}


	public int deleteSchedule(Connection conn, String scheduleid) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "delete from schedule where scheduleid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, scheduleid);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		
		return result;
	}


	public ArrayList<Schedule> selectMonth(Connection conn) {
		ArrayList<Schedule> list = new ArrayList<Schedule>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query ="select scheduleid, schstartdate, schname from schedule where (schstartyear = to_char(sysdate, 'YYYY')) and (schstartmonth = to_char(sysdate, 'mm')) order by 2";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			
			while(rset.next()) {
				Schedule schedule = new Schedule();
				
				schedule.setScheduleid(rset.getString("scheduleid"));
				schedule.setSchstartdate(rset.getInt("schstartdate"));
				schedule.setSchname(rset.getString("schname"));
				
				list.add(schedule);
				
			}
			
			
		} catch (Exception e) {
		  e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
			
		}
		System.out.println("dao"+list);
		return list;
	}
	
	

}



//SCHEDULEID
//ADNO
//SCHNAME
//SCHSTARTYEAR
//SCHSTARTMONTH
//SCHSTARTDATE
//SCHENDYEAR
//SCHENDMONTH
//SCHENDDATE
















