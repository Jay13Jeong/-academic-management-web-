package student.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.model.service.StudentService;

@WebServlet("/studentfindpwd.cp")
public class StudentAfterFindPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 435345345L;

    public StudentAfterFindPasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cryptoPwd = request.getParameter("userpwd");
		String id = request.getParameter("id");
		System.out.println(cryptoPwd+":"+id);
		int result = new StudentService().updatestudentpassword(cryptoPwd, id);
		if(result > 0) {
			response.sendRedirect("index.jsp");
		}else {
			RequestDispatcher view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "비밀번호 변경실패");
			view.forward(request, response);
		}
	}

}
