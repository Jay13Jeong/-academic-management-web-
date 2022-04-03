package student.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.model.service.AdminService;
import student.model.service.ProfessorService;
import student.model.service.StudentService;
import student.model.vo.Admin;
import student.model.vo.Professor;
import student.model.vo.Student;

/**
 * Servlet implementation class FindPasswordServlet
 */
@WebServlet("/findpwd")
public class FindPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FindPasswordServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 비밀번호 찾기 컨트롤러

		// 2.전송온 값 꺼내서, 변수 또는 객체에 기록 저장 처리함
		String id = request.getParameter("id");
		String firstword = id.substring(0, 1);
		System.out.println("firstword" + firstword);
		String treasure = request.getParameter("treasure");

		if(firstword.equals("P")){
			ProfessorService pservice = new ProfessorService();
			Professor professor = pservice.selectOne(id, treasure);
			if(professor != null) {
				
				RequestDispatcher view = request.getRequestDispatcher("views/student/afterfindPasswordP.jsp");
				request.setAttribute("professor", professor);
				view.forward(request, response);
				
				
				
				
			}else {
				response.sendRedirect("views/common/error.jsp");
			}
		
		}else if(firstword.equals("A")) {
			AdminService aservice = new AdminService();
			Admin admin =  aservice.selectOne(id, treasure);
			if(admin != null) {
				//새비밀번호를 입력할수 있는 창으로 이동하기
				RequestDispatcher view = request.getRequestDispatcher("views/student/afterfindPasswordA.jsp");
				request.setAttribute("admin", admin);
				view.forward(request, response);
				
				
			}else {
				response.sendRedirect("views/common/error.jsp");
			}
			
			
			
		}else {
			StudentService sservice = new StudentService();
			Student student = sservice.selectOne(id, treasure);
			if(student != null) {
				//새비밀번호를 입력할수 있는 창으로 이동하기
				RequestDispatcher view = request.getRequestDispatcher("views/student/afterfindPasswordS.jsp");
				request.setAttribute("student", student);
				view.forward(request, response);
				
				
				
			}else {
				response.sendRedirect("views/common/error.jsp");
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		/*
		 * // 3.서비스 객체 생성하고, 서비스 메소드를 이용해서 객체 전달하고처리 결과받기
		 * 
		 * MemberService service = new MemberService(); 
		 * Member student = service.FindPasswordStudent(id, treasure);
		 * 
		 * // 4.받은 결과에 따라 성공/실패 뷰 선택해서 내보내기 // if 문으로 결과처리 if
		 * (student.getId().equals("notanswer")) { student = null; } if (student !=
		 * null) {
		 * 
		 * response.sendRedirect("views/student/afterfindPassword.jsp");
		 * 
		 * } else { response.sendRedirect("views/common/error.jsp");
		 * 
		 * }
		 */
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
