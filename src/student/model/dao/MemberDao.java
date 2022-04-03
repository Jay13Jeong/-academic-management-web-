package student.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import student.model.vo.Member;
import student.model.vo.Student;

public class MemberDao {
	public MemberDao() {
	}

	public int insert(Connection conn, Member member) {
		int result = 0;
		PreparedStatement pstmt = null;

		String query = "insert into member values (?, ?, ?, ?, ?, default, ?, ?, ?, ?,sysdate,default,default,?,?,?)";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getSsn());
			pstmt.setString(4, member.getAddress());
			pstmt.setString(5, member.getPhone());
			pstmt.setString(6, member.getEmail());
			pstmt.setString(7, member.getTreasure());
			pstmt.setDate(8, member.getAdminhiredate());
			pstmt.setString(9, member.getPassword());
			pstmt.setString(10, member.getSsname());
			pstmt.setString(11, member.getCategoryname());
			pstmt.setString(12, member.getMajorno());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	// 한명선택
	public Member selectOne(Connection conn, String id) {
		Member member = null;
		Statement stmt = null;
		ResultSet rset = null;

		String query = "select * " + "from ("
				+ "select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,entrancedate,absencewhether,absencecount,ssname,password,null adminhiredate from student "
				+ "union "
				+ "select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,null,null,null,null,password,null from professor "
				+ "union "
				+ "select id,name,ssn,address,phone,gender,email,treasure,null,null,null,null,null,null,password,adminhiredate from administrator "
				+ ") " + "where id = ? and treasure = ?";

		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);

			if (rset.next()) {
				member = new Member();

				member.setId("id");
				member.setName(rset.getString("name"));
				member.setSsn(rset.getString("ssn"));
				member.setAddress(rset.getString("address"));
				member.setPhone(rset.getString("phone"));
				member.setGender(rset.getString("gender"));
				member.setEmail(rset.getString("email"));
				member.setTreasure(rset.getString("treasure"));
				member.setAdminhiredate(rset.getDate("adminhiredate"));
				member.setPassword(rset.getString("password"));
				member.setEntrancedate(rset.getDate("entrancedate"));
				member.setAbsencewhether(rset.getString("absencewhether"));
				member.setAbsencecount(rset.getInt("absencecount"));
				member.setSsname(rset.getString("ssname"));
				member.setCategoryname(rset.getString("categoryname"));
				member.setMajorno(rset.getString("majorno"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
System.out.println("member" + member);
		return member;
	}

	// 전체조회
	public ArrayList<Member> selectList(Connection conn) {
		ArrayList<Member> list = new ArrayList<Member>();
		Statement stmt = null;
		ResultSet rset = null;

		String query = "select * " + "from ("
				+ "select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,entrancedate,absencewhether,absencecount,ssname,password,null adminhiredate from student "
				+ "union "
				+ "select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,null,null,null,null,password,null from professor "
				+ "union "
				+ "select id,name,ssn,address,phone,gender,email,treasure,null,null,null,null,null,null,password,adminhiredate from administrator "
				+ ") " ;

		try {
			stmt = conn.createStatement();

			rset = stmt.executeQuery(query);

			while (rset.next()) {
				Member member = new Member();

				member.setId("id");
				member.setName(rset.getString("name"));
				member.setSsn(rset.getString("ssn"));
				member.setAddress(rset.getString("address"));
				member.setPhone(rset.getString("phone"));
				member.setGender(rset.getString("gender"));
				member.setEmail(rset.getString("email"));
				member.setTreasure(rset.getString("treasure"));
				member.setCategoryname(rset.getString("categoryname"));
				member.setMajorno(rset.getString("majorno"));
				member.setEntrancedate(rset.getDate("entrancedate"));
				member.setAbsencewhether(rset.getString("absencewhether"));
				member.setAbsencecount(rset.getInt("absencecount"));
				member.setSsname(rset.getString("ssname"));
				member.setCategoryname(rset.getString("categoryname"));
				member.setMajorno(rset.getString("majorno"));

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

	// 정보수정
	public int updateMember(Connection conn, Member member) {
		int result = 0;
		PreparedStatement pstmt = null;

		String query0 = "update member set  = ? where id = ?";
		String query = " (select id from (select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,entrancedate,absencewhether,absencecount,ssname,password,null adminhiredate " 
				         + "from student "  
				         + "union select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,null,null,null,null,password,null from professor " 
						+ "union select id,name,ssn,address,phone,gender,email,treasure,null,null,null,null,null,null,password,adminhiredate from administrator " 
						+ ") " 
					    + "where id = ?)";
				
		try {
			pstmt = conn.prepareStatement(query0 + query);
			pstmt.setString(1, member.getId());
	

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	// 회원탈퇴
	public int deleteStudent(Connection conn, String id) {
		int result = 0;
		PreparedStatement pstmt = null;

		
		String query0 = "delete from student where id = ";
		
		String query = "(select id from (select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,entrancedate,absencewhether,absencecount,ssname,password,null adminhiredate "
				        + "from student " 
						+ "union select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,null,null,null,null,password,null from professor " 
						+ "union select id,name,ssn,address,phone,gender,email,treasure,null,null,null,null,null,null,password,adminhiredate from administrator "
						+ ") "
						+ "where id = ?)";

		

		try {
			
			pstmt = conn.prepareStatement(query0 + query);
			pstmt.setString(1, id);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}
	
	//비밀번호 찾기
	public Member FindPasswordStudent(Connection conn, String id, String treasure) {
		Student student = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select * " + "from ("
				+ "select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,entrancedate,absencewhether,absencecount,ssname,password,null adminhiredate from student "
				+ "union "
				+ "select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,null,null,null,null,password,null from professor "
				+ "union "
				+ "select id,name,ssn,address,phone,gender,email,treasure,null,null,null,null,null,null,password,adminhiredate from administrator "
				+ ") " + "where id = ? and treasure = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, treasure);

			rset = pstmt.executeQuery();

			if (rset.next()) {
				student = new Student();

				student.setId(rset.getString("id"));
			

			}else {
				student = new Student();

				student.setId("notanswer");
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return student;
	}

	

	// 아이디 찾기

	public Member FindIdMember(Connection conn, String name, String treasure) {
		Member member = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select * " + "from ("
				+ "select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,entrancedate,absencewhether,absencecount,ssname,password,null adminhiredate from student "
				+ "union "
				+ "select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,null,null,null,null,password,null from professor "
				+ "union "
				+ "select id,name,ssn,address,phone,gender,email,treasure,null,null,null,null,null,null,password,adminhiredate from administrator "
				+ ") " + "where name = ? and treasure = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, treasure);

			rset = pstmt.executeQuery();

			if (rset.next()) {
				member = new Member();

				member.setId(rset.getString("id"));
			

			}else {
				member = new Member();

				member.setId("notanswer");
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return member;
	}

	public int deleteAdmin(Connection conn, String id) {
		int result = 0;
		PreparedStatement pstmt = null;

		
		String query0 = "delete from administrator where id = ";
		
		String query = "(select id from (select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,entrancedate,absencewhether,absencecount,ssname,password,null adminhiredate "
				+ "		from student " 
						+ "union select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,null,null,null,null,password,null from professor " 
						+ "union select id,name,ssn,address,phone,gender,email,treasure,null,null,null,null,null,null,password,adminhiredate from administrator "
						+ ") "
						+ "where id = ?)";

		

		try {
			
			pstmt = conn.prepareStatement(query0 + query);
			pstmt.setString(1, id);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public int deleteProfessor(Connection conn, String id) {
		int result = 0;
		PreparedStatement pstmt = null;

		
		String query0 = "delete from professor where id = ";
		
		String query = "(select id from (select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,entrancedate,absencewhether,absencecount,ssname,password,null adminhiredate "
				+ "		from student " 
						+ "union select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,null,null,null,null,password,null from professor " 
						+ "union select id,name,ssn,address,phone,gender,email,treasure,null,null,null,null,null,null,password,adminhiredate from administrator "
						+ ") "
						+ "where id = ?)";

		

		try {
			
			pstmt = conn.prepareStatement(query0 + query);
			pstmt.setString(1, id);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}
//////////////////////
	public int insert(Connection conn, Student student) {
	      int result = 0;
	      PreparedStatement pstmt = null;

	      String query = "insert into member values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	      try {
	         pstmt = conn.prepareStatement(query);
	         pstmt.setString(1, student.getId());
	         pstmt.setString(2, student.getPassword());
	         pstmt.setString(3, student.getName());
	         pstmt.setString(4, student.getSsn());
	         pstmt.setString(5, student.getAddress());
	         pstmt.setString(6, student.getPhone());
	         pstmt.setString(7, student.getCategoryname());
	         pstmt.setString(8, student.getGender());
	         pstmt.setString(9, student.getEmail());
	         pstmt.setString(10, student.getTreasure());
	         
	      
	         
	     	
		


	         result = pstmt.executeUpdate();

	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         close(pstmt);
	      }

	      return result;
	   }



	   	//정보수정
	   public int update(Connection conn, Student student) {
	      int result = 0;
	      PreparedStatement pstmt = null;

	      String query = "update student set id = ? where majorno = ?";

	      try {
	         pstmt = conn.prepareStatement(query);
	         pstmt.setString(1, student.getId());
	         pstmt.setString(2, student.getMajorno());

	         result = pstmt.executeUpdate();

	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         close(pstmt);
	      }

	      return result;
	   }

	   public int delete(Connection conn, String studentid) {
	      int result = 0;
	      PreparedStatement pstmt = null;

	      String query = "delete from student where id = ?";

	      try {
	         pstmt = conn.prepareStatement(query);
	         pstmt.setString(1, studentid);

	         result = pstmt.executeUpdate();

	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         close(pstmt);
	      }

	      return result;
	   }



	public int insertStudent(Connection conn, Member member) {
		int result = 0;
	    PreparedStatement pstmt = null;

	    String query = "insert into student values (?,?,?,?,?,?,?,?,?,?,?,DEFAULT,DEFAULT,?,?)";

	    try {
	       pstmt = conn.prepareStatement(query);
	       pstmt.setString(1, member.getId());
	       pstmt.setString(2, member.getName());
	       pstmt.setString(3, member.getSsn());
	       pstmt.setString(4, member.getAddress());
	       pstmt.setString(5, member.getPhone());
	       pstmt.setString(6, member.getGender());
	       pstmt.setString(7, member.getEmail());
	       pstmt.setString(8, member.getTreasure());
	       pstmt.setString(9, member.getCategoryname());
	       pstmt.setString(10, member.getMajorno());
	       pstmt.setDate(11, member.getEntrancedate());
	       pstmt.setString(12, member.getSsname());
	       pstmt.setString(13, member.getPassword());
		
	       result = pstmt.executeUpdate();

	    } catch (Exception e) {
	       e.printStackTrace();
	    } finally {
	       close(pstmt);
	    }
	    return result;
	}


	public int insertProfessor(Connection conn, Member member) {
		int result = 0;
	    PreparedStatement pstmt = null;

	    String query = "insert into professor values (?,?,?,?,?,?,?,?,?,?,?)";

	    try {
	       pstmt = conn.prepareStatement(query);
	       pstmt.setString(1, member.getId());
	       pstmt.setString(2, member.getName());
	       pstmt.setString(3, member.getSsn());
	       pstmt.setString(4, member.getAddress());
	       pstmt.setString(5, member.getPhone());
	       pstmt.setString(6, member.getGender());
	       pstmt.setString(7, member.getEmail());
	       pstmt.setString(8, member.getTreasure());
	       pstmt.setString(9, member.getCategoryname());
	       pstmt.setString(10, member.getMajorno());
	       pstmt.setString(11, member.getPassword());
		
	       result = pstmt.executeUpdate();

	    } catch (Exception e) {
	       e.printStackTrace();
	    } finally {
	       close(pstmt);
	    }

	    return result;
	}


	public int insertAdmin(Connection conn, Member member) {
		int result = 0;
	    PreparedStatement pstmt = null;
	    String query = "insert into administrator values (?,?,?,?,?,?,?,?,?,?)";

	    try {
	       pstmt = conn.prepareStatement(query);
	       pstmt.setString(1, member.getId());
	       pstmt.setString(2, member.getName());
	       pstmt.setString(3, member.getSsn());
	       pstmt.setString(4, member.getAddress());
	       pstmt.setString(5, member.getPhone());
	       pstmt.setString(6, member.getGender());
	       pstmt.setString(7, member.getEmail());
	       pstmt.setString(8, member.getTreasure());
	       pstmt.setDate(9, member.getAdminhiredate());
	       pstmt.setString(10, member.getPassword());
		
	       result = pstmt.executeUpdate();

	    } catch (Exception e) {
	       e.printStackTrace();
	    } finally {
	       close(pstmt);
	    }

	    return result;
	}
	/////////////////////

		public int FindPasswordMember(Connection conn, Member member) {
			int result = 0;
			PreparedStatement pstmt = null;

			String query = "select * from member where id = ? and treasure = ?";
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, member.getId());
				pstmt.setString(2, member.getTreasure());

				result = pstmt.executeUpdate();

			} catch (Exception e) {
				e.printStackTrace();
			} finally {

				close(pstmt);
			}

			return result;

		}

	/////////////////////




		// 회원탈퇴
		public int deleteMember(Connection conn, String id) {
			int result = 0;
			PreparedStatement pstmt = null;

			String query = "delete * " + "from ("
					+ "select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,entrancedate,absencewhether,absencecount,ssname,password,null adminhiredate from student "
					+ "union "
					+ "select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,null,null,null,null,password,null from professor "
					+ "union "
					+ "select id,name,ssn,address,phone,gender,email,treasure,null,null,null,null,null,null,password,adminhiredate from administrator "
					+ ") ";

			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, id);

				result = pstmt.executeUpdate();

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(pstmt);
			}

			return result;
		}

		public Member loginCheck(Connection conn, String id, String password) {
			Member member = null;
			PreparedStatement pstmt = null;
			ResultSet rset = null;

			String query = "select * " + "from ("
					+ "select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,entrancedate,absencewhether,absencecount,ssname,password,null adminhiredate from student "
					+ "union "
					+ "select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,null,null,null,null,password,null from professor "
					+ "union "
					+ "select id,name,ssn,address,phone,gender,email,treasure,null,null,null,null,null,null,password,adminhiredate from administrator "
					+ ") " + "where id = ? and password = ?";

			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, id);
				pstmt.setString(2, password);

				rset = pstmt.executeQuery();

				if (rset.next()) {
					member = new Member();

					member.setId(id);
					member.setName(rset.getString("name"));
					member.setSsn(rset.getString("ssn"));
					member.setAddress(rset.getString("address"));
					member.setPhone(rset.getString("phone"));
					member.setGender(rset.getString("gender"));
					member.setEmail(rset.getString("email"));
					member.setTreasure(rset.getString("treasure"));
					member.setAdminhiredate(rset.getDate("adminhiredate"));
					member.setPassword(rset.getString("password"));
					member.setEntrancedate(rset.getDate("entrancedate"));
					member.setAbsencewhether(rset.getString("absencewhether"));
					member.setAbsencecount(rset.getInt("absencecount"));
					member.setSsname(rset.getString("ssname"));
					member.setCategoryname(rset.getString("categoryname"));
					member.setMajorno(rset.getString("majorno"));

				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(rset);
				close(pstmt);
			}
			return member;
		}

	//정보추가
		public int insertMember(Connection conn, Member member) {
			int result = 0;
			PreparedStatement pstmt = null;

			String query = "insert into student values (?, ?, ?, ?, ?, default, ?, ?, ?, ?,sysdate,default,default,?,?,?)";

			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, member.getId());
				pstmt.setString(2, member.getName());
				pstmt.setString(3, member.getSsn());
				pstmt.setString(4, member.getAddress());
				pstmt.setString(5, member.getPhone());
				pstmt.setString(6, member.getEmail());
				pstmt.setString(7, member.getTreasure());
				pstmt.setDate(8, member.getAdminhiredate());
				pstmt.setString(9, member.getPassword());
				pstmt.setString(10, member.getSsname());
				pstmt.setString(11, member.getCategoryname());
				pstmt.setString(12, member.getMajorno());

				result = pstmt.executeUpdate();

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(pstmt);
			}

			return result;
		}

		
		//비밀번호 찾기
		public Member FindPasswordMember(Connection conn, String id, String treasure) {
			Member member = null;
			PreparedStatement pstmt = null;
			ResultSet rset = null;

			String query = "select * " + "from ("
					+ "select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,entrancedate,absencewhether,absencecount,ssname,password,null adminhiredate from student "
					+ "union "
					+ "select id,name,ssn,address,phone,gender,email,treasure,categoryname,majorno,null,null,null,null,password,null from professor "
					+ "union "
					+ "select id,name,ssn,address,phone,gender,email,treasure,null,null,null,null,null,null,password,adminhiredate from administrator "
					+ ") " + "where id = ? and treasure = ?";
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, id);
				pstmt.setString(2, treasure);

				rset = pstmt.executeQuery();

				if (rset.next()) {
					member = new Member();

					member.setId(rset.getString("id"));
				

				}else {
					member = new Member();

					member.setId("notanswer");
				
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(rset);
				close(pstmt);
			}

			return member;
		}

	
		
	
}
