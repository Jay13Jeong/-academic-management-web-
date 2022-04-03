package lecture.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import lecture.model.vo.ApplyReception;
import lecture.model.vo.Lecture;
import lecture.model.vo.Major;
import lecture.model.vo.Rest;
import lecture.model.vo.TimeTable;
import oracle.net.aso.l;
import student.model.vo.Member;

public class LectureDao {
	
	private String tc = "zz";//강의생성테이블접두사
	
	public LectureDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Lecture loginCheck(Connection conn, String userid, String userpwd) {
		Lecture member = null;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from member where userid = ? and userpwd = ? and login_ok = 'Y'";
		 try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			pstmt.setString(2, userpwd);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				member = new Lecture();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return member;
	}

	public int insertLecture(Connection conn, Lecture member) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "insert into member values (?, ?, ?, ?, ?, ?, ?, ?, ?,sysdate,sysdate, default)";
		
		try {
			pstmt = conn.prepareStatement(query);

			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		
		return result;
	}

	public Lecture selectLecture(Connection conn, String userid) {
		
		Lecture member = null;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from member where userid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				Lecture m = new Lecture();
	
				
				member = m;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
	
		return member;
	}

	public void deleteLecture(Connection conn, String lecture) {
		//개설된 강의 내리기버튼
		String result = "";
		Statement stmt = null;
		String query = "DROP TABLE " + tc + lecture + " CASCADE CONSTRAINTS";
		try {
			stmt = conn.createStatement();
			stmt.execute(query);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(stmt);
		}
	}
	
	public int updateLecture(Connection conn, Lecture member) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		String query = "update member set userpwd = ?, age = ?, "
				+ " phone = ?, username = ?, gender = ?, email = ?, hobby = ?, etc = ?, lastmodified = sysdate "
				+ "where userid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);

			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}

	public ArrayList<Lecture> selectList(Connection conn) {
		ArrayList<Lecture> list = new ArrayList<Lecture>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * from member";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			while(rset.next()) {
				Lecture m = new Lecture();

				
				list.add(m);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}

	public int updateLoginOK(Connection conn, String userid, String loginok) {
		int result = 0;
		PreparedStatement pstmt = null;
		String query = "update member set login_ok = ? where userid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, loginok);
			pstmt.setString(2, userid);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	
	}

	public ArrayList<Lecture> selectSearchUserid(Connection conn, String keyword) {
		ArrayList<Lecture> list = new ArrayList<Lecture>();
		PreparedStatement stmt = null;
		ResultSet rset = null;
		
		String query = "select * from member where userid like ?";
		
		try {
			stmt = conn.prepareStatement(query);
			stmt.setString(1, "%" + keyword + "%" );
			rset = stmt.executeQuery();
			while(rset.next()) {
				Lecture m = new Lecture();

			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}

	public ArrayList<Lecture> selectSearchGender(Connection conn, String keyword) {
		ArrayList<Lecture> list = new ArrayList<Lecture>();
		PreparedStatement stmt = null;
		ResultSet rset = null;
		
		String query = "select * from member where gender like ?";
		
		try {
			stmt = conn.prepareStatement(query);
			stmt.setString(1, "%" + keyword + "%");
			rset = stmt.executeQuery();
			while(rset.next()) {
				Lecture m = new Lecture();
	
				
				list.add(m);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}

	public ArrayList<Lecture> selectSearchAge(Connection conn, String keyword) {
		ArrayList<Lecture> list = new ArrayList<Lecture>();
		PreparedStatement stmt = null;
		ResultSet rset = null;
		String query = "select * from member where age between ? and ?";
		
		try {
			stmt = conn.prepareStatement(query);
			stmt.setInt(1, Integer.parseInt(keyword));
			stmt.setInt(2, Integer.parseInt(keyword) + 9);
			rset = stmt.executeQuery();
			while(rset.next()) {
				Lecture m = new Lecture();
	
				
				list.add(m);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}

	public ArrayList<Lecture> selectSearchEnroll(Connection conn, Date begin, Date end) {
		ArrayList<Lecture> list = new ArrayList<Lecture>();
		PreparedStatement stmt = null;
		ResultSet rset = null;
		
		String query = "select * from member where enroll_date between ? and ?";
		
		try {
			stmt = conn.prepareStatement(query);
			stmt.setDate(1, begin);
			stmt.setDate(2, end);
			rset = stmt.executeQuery();
			while(rset.next()) {

			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}

	public ArrayList<Lecture> selectSearchLoginok(Connection conn, String keyword) {
		ArrayList<Lecture> list = new ArrayList<Lecture>();
		PreparedStatement stmt = null;
		ResultSet rset = null;
		
		String query = "select * from member where login_ok = ?";
		
		try {
			stmt = conn.prepareStatement(query);
			stmt.setString(1, keyword);
			rset = stmt.executeQuery();
			while(rset.next()) {

			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}

	public int selectCheckId(Connection conn, String userid) {
		int idcount = 0;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "select count(userid) from member where userid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				idcount = rset.getInt(1);
				System.out.println("idcnt : " + idcount);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return idcount;
	}


	public ArrayList<Lecture> selectAllPlan(Connection conn) {
		//강의계획서 조회
		ArrayList<Lecture> list = new ArrayList<Lecture>();
		Statement stmt = null;
		ResultSet rset = null;
		String query = "select * from lplan join professor using (id) join lecture using (lcode)";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Lecture l = new Lecture();
				l.setCapacity(rset.getInt("capacity"));
				l.setCategory(rset.getString("category"));
				l.setLcode(rset.getString("lcode"));
				l.setLname(rset.getString("lname"));
				l.setLtime(rset.getString("ltime"));
				l.setProfessorid(rset.getString("id"));
				l.setName(rset.getString("name"));
				l.setRoom(rset.getString("room"));
				l.setContent(rset.getString("content"));
				l.setLclock(rset.getString("lclock"));
				
				list.add(l);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}


	public TimeTable selecTimeTable(Connection conn, String studentid, String clock) {
		//시간표조회
		TimeTable t = new TimeTable();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "select lname,ltime,lclock from  lapplication join lecture using (lcode) where lapplication.id = ? and lclock = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, studentid);
			pstmt.setString(2, clock);
			rset = pstmt.executeQuery();
				
			if(rset.next()) {
				t.setDay(rset.getString("ltime"));
				t.setName(rset.getString("lname"));
				t.setTime(rset.getString("lclock"));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return t;
	}


	public void createRoom(Connection conn, String lecture,int roommax) {
		//수강신청개설1
		String max = "" + roommax;
		Statement stmt = null;
		String query = "create table " + tc + lecture + " ( name varchar2(500) default " + max + " )";
		
		try {
			stmt = conn.createStatement();
			stmt.execute(query);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(stmt);
		}
	}


	public void setRoommax(Connection conn, String lecture) {
		//수강신청개설2
		int r = 0;
		Statement stmt = null;
		String query = "insert into " + tc + lecture + " values (default)";
		
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(query);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(stmt);
		}
	}


	public String selectRoom(Connection conn, String lecture) {
		//수강신청개설 중복체크 (디비에서가져와 자바로 처리하기)
		String r = "";
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "SELECT table_name FROM all_tables where table_name like ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "%" + lecture);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				r = rset.getString("table_name");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		if(r.length() > 1) {
			return r.substring(2,r.length());
		}
		return r;
	}


	public ArrayList<Lecture> selectOpenedLectures(Connection conn) {
		//열린강의조회 (디비로 처리해서 가져오기)
		ArrayList<Lecture> list = new ArrayList<Lecture>();
		Statement stmt = null;
		ResultSet rset = null;
		String query = "select * from lplan join professor using (id) join lecture using (lcode)right join " + 
				"(SELECT SUBSTR(table_name,3,length(table_name)) lname FROM all_tables where owner = 'BEETPROJECT1' and table_name like 'ZZ%') " + 
				"a using (lname) right join " + 
				"(select SUBSTR(table_name,3,length(table_name)) lname, data_default from SYS.all_tab_columns where owner = 'BEETPROJECT1' and table_name like 'ZZ%') " + 
				"using ( lname )";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Lecture l = new Lecture();
				l.setCapacity((rset.getInt("data_default")));
				l.setCategory(rset.getString("category"));
				l.setLcode(rset.getString("lcode"));
				l.setLname(rset.getString("lname"));
				l.setLtime(rset.getString("ltime"));
				l.setProfessorid(rset.getString("id"));
				l.setName(rset.getString("name"));
				l.setRoom(rset.getString("room"));
				l.setLclock(rset.getString("lclock"));
				
				list.add(l);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}


	public int applyLecture(Connection conn, String lname,String name) {
		// 수강신청버튼구현 4중 쿼리
		int r = 0;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "select data_default from SYS.all_tab_columns where owner = 'BEETPROJECT1' and table_name like ?";
		String query2 = "select count(*) c from " + tc + lname;
		String query3 = "insert into " + tc + lname + " values ('" + name + "')";
		String chk = "select * from " + tc + lname;
		
		int n1 = 0;
		int n2 = 0;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "%" + lname);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				n1 = rset.getInt("data_default");
				close(pstmt);
			}
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query2);
			if(rset.next()) {
				n2 = rset.getInt("c");
				close(stmt);
			}
			if(n1 > n2) {
				Statement stmtChk = conn.createStatement();
				rset = stmtChk.executeQuery(chk);
				while(rset.next()) {
					if(rset.getString("name").equals(name)) {
						close(stmtChk);
						return -1;
					}
				}
				Statement stmt2 = conn.createStatement();
				r = stmt2.executeUpdate(query3);
				close(stmt2);
			}else {
				close(rset);
				return 0;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}


	public ArrayList<Rest> selectRest(Connection conn) {
		ArrayList<Rest> list = new ArrayList<Rest>();
		Statement stmt = null;
		ResultSet rset = null;
		String query = "select * from reception join professor using (id) join (select name subname,id sub from professor) on (subid = sub)";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Rest r = new Rest();
				r.setDayoff(rset.getDate("dayoff"));
				r.setId(rset.getString("name"));
				r.setLcode(rset.getString("lcode"));
				r.setRday(rset.getDate("rday"));
				r.setReason(rset.getString("reason"));
				r.setReceptionno(rset.getString("receptionno"));
				r.setRoom(rset.getString("room"));
				r.setRtime(rset.getString("rtime"));
				r.setSubid(rset.getString("subname"));
				r.setWay(rset.getString("way"));
				
				list.add(r);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}


	public ArrayList<Member> selectAllUsers(Connection conn) {
		ArrayList<Member> list = new ArrayList<Member>();
	      Statement stmt = null;
	      ResultSet rset = null;

	      String query = "select * " + 
	      		"from (" + 
	    		"select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,entrancedate,absencewhether,absencecount,ssname,password,null from student " + 
	    		"union " + 
	    		"select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,null,null,null,null,password,null from professor " + 
	    		"union " + 
	    		"select id,name,ssn,address,phone,gender,email,null,null,null,null,null,null,null,password,adminhiredate from administrator " + 
	    		") ";

	      try {
	         stmt = conn.createStatement();

	         rset = stmt.executeQuery(query);

	         while (rset.next()) {
	            Member member = new Member();
	            
	            member.setId(rset.getString("id"));
	            member.setName(rset.getString("name"));
	            member.setGender(rset.getString("gender"));
	            member.setPhone(rset.getString("phone"));
	            member.setEmail(rset.getString("email"));
	            member.setAddress(rset.getString("address"));
	            member.setTreasure(rset.getString("treasure"));
	            member.setSsn(rset.getString("ssn"));
	            member.setAbsencecount(rset.getInt("absencecount"));
	            member.setAbsencewhether(rset.getString("absencewhether"));
	            member.setCategoryname(rset.getString("categoryname"));
	            member.setEntrancedate(rset.getDate("entrancedate"));
	            member.setMajorno(rset.getString("majorno"));
	            member.setSsname(rset.getString("ssname"));

	            list.add(member);
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         close(rset);
	         close(stmt);
	      }

	      return list;
	}


	public ArrayList<Lecture> selectMyLectures(Connection conn, String id) {
		//해당교수의 과목 조회
		ArrayList<Lecture> list = new ArrayList<Lecture>();
		Statement stmt = null;
		ResultSet rset = null;
		String query = "select * from lecture where id = '" + id + "'";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Lecture l = new Lecture();
				l.setCategory(rset.getString("category"));
				l.setLcode(rset.getString("lcode"));
				l.setLname(rset.getString("lname"));
				l.setLtime(rset.getString("ltime"));
				l.setProfessorid(rset.getString("id"));
				l.setRoom(rset.getString("room"));
				l.setLclock(rset.getString("lclock"));
				
				list.add(l);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}


	public int insertRest(Connection conn, Rest r) {
		//휴보강신청 INSERT
				int rst = 0;
				
				String n1 = r.getReceptionno();
				String n2 =  r.getId();
				String n3 =  r.getReason();
				String n4 =  r.getWay();
				Date n5 =  r.getDayoff();
				Date n6 =  r.getRday();
				String n7 =  r.getRtime();
				String n8 =  r.getLcode();
				String n9 =  r.getRoom();
				String n10 =  r.getSubid();
				
				Statement stmt = null;
				String query =  "insert into reception VALUES ('" + n1 + "','" + n2 + "','" + n3 + "','" + n4 + "','" + n5 + "','" + n6 + "','" + n7 + "','" + n8 + "','" + n9 + "','" + n10 + "')";
				try {
					stmt = conn.createStatement();
					rst = stmt.executeUpdate(query);
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					close(stmt);
				}
				return rst;
	}


	public int delRest(Connection conn, String no) {
		//휴보강철회  delete
		int rst = 0;
		PreparedStatement pstmt = null;
		String query = "delete from reception where receptionno = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, no);
			
			rst = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return rst;
	}


	public ArrayList<Major> selectCategories(Connection conn) {
		//카테고리 목록 조회 구분명 또는 계열 이라는거
		ArrayList<Major> list = new ArrayList<Major>();
		Statement stmt = null;
		ResultSet rset = null;
		String query = "select * from major";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Major m = new Major();
				m.setCapacity(rset.getInt("capacity"));
				m.setCategoryname(rset.getString("categoryname"));
				m.setMajorname(rset.getString("majorname"));
				m.setMajorno(rset.getString("majorno"));
				m.setTuition(rset.getInt("tuition"));
				
				list.add(m);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}


	public int preapplyLecture(Connection conn, ApplyReception ar) {
		// 수강신청버튼 lapply테이블에 추가
		int rst = 0;
		PreparedStatement pstmt = null;
		String query = "insert into lapplication values (?,?,?,?,?,?,default)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, ar.getReceptionno());
			pstmt.setString(2, ar.getLcode());
			pstmt.setString(3, ar.getId());
			pstmt.setString(4, ar.getSemester());
			pstmt.setString(5, ar.getLpersonnel());
			pstmt.setString(6, ar.getRoom());
			
			rst = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return rst;
	}

}
