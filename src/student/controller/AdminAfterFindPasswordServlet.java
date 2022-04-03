package student.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.model.service.AdminService;

/**
 * Servlet implementation class AdminAfterFindPasswordServlet
 */
@WebServlet("/adminfindpwd.cp")
public class AdminAfterFindPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminAfterFindPasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cryptoPwd = request.getParameter("userpwd");
		String id = request.getParameter("id");
		System.out.println(cryptoPwd+":"+id);
		//서비스 객체를 생성
		int result = new AdminService().updateadminpassword (cryptoPwd, id);
		if(result > 0) {
			response.sendRedirect("index.jsp");
		}else {
			//상대경로로만 할 수 있고 메세지도 출력해주는 메소드 사용
			RequestDispatcher view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "비밀번호 변경실패");
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
