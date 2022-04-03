package student.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.model.service.AdminService;
import student.model.service.MemberService;
import student.model.service.ProfessorService;
import student.model.service.StudentService;
import student.model.vo.Admin;
import student.model.vo.Member;
import student.model.vo.Professor;
import student.model.vo.Student;

/**
 * Servlet implementation class MemberUpdateServlet
 */
@WebServlet("/mupdate.cp")
public class MemberUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MemberUpdateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String firstword = id.substring(0, 1);

		String password = request.getParameter("userpwd");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String treasure = request.getParameter("treasure");
		System.out.println("sdf" + id + password + phone + email + treasure);
		
		if (firstword.equals("A")) { // 관리자
			Admin admin = new Admin();
			admin.setId(id);
			admin.setPassword(password);
			admin.setAddress(address);
			admin.setPhone(phone);
			admin.setEmail(email);
			admin.setTreasure(treasure);
			System.out.println("admin" + admin);
			int result = new AdminService().updateAdmin(admin);

			if (result > 0) {
				RequestDispatcher view = request.getRequestDispatcher("views/student/memberUpdatePage.jsp");
				request.setAttribute("message", "정보수정성공");
				view.forward(request, response);
			} else {
				RequestDispatcher view = request.getRequestDispatcher("views/common/error.jsp");
				request.setAttribute("message", "정보수정실패");
				view.forward(request, response);
			}

		}
		
		if (firstword.equals("P")) { // 교수
			Professor professor = new Professor();
			professor.setId(id);
			professor.setPassword(password);
			professor.setAddress(address);
			professor.setPhone(phone);
			professor.setEmail(email);
			professor.setTreasure(treasure);
			System.out.println("professor" + professor);
			int result = new ProfessorService().updateProfessor(professor);

			if (result > 0) {
				RequestDispatcher view = request.getRequestDispatcher("views/student/memberUpdatePage.jsp");
				request.setAttribute("message", "정보수정성공");
				view.forward(request, response);
			} else {
				RequestDispatcher view = request.getRequestDispatcher("views/common/error.jsp");
				request.setAttribute("message", "정보수정실패");
				view.forward(request, response);
			}

		}
		
		if (!firstword.equals("P") && !firstword.equals("A")) { // 학생
			Student student = new Student();
			student.setId(id);
			student.setPassword(password);
			student.setAddress(address);
			student.setPhone(phone);
			student.setEmail(email);
			student.setTreasure(treasure);

			int result = new StudentService().updateStudent(student);
			System.out.println("student" + result);
			if (result > 0) {
				RequestDispatcher view = request.getRequestDispatcher("views/student/memberUpdatePage.jsp");
				request.setAttribute("message", "정보수정성공");
				view.forward(request, response);
			} else {
				RequestDispatcher view = request.getRequestDispatcher("views/common/error.jsp");
				request.setAttribute("message", "정보수정실패");
				view.forward(request, response);
			}
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
