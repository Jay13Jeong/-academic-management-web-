package major.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import major.model.service.MajorService;

import major.model.vo.Major1;
import major.model.vo.Major2;

/**
 * Servlet implementation class MajorStudentListServlet
 */
@WebServlet("/s.t.list")
public class MajorStudentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MajorStudentListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("학생 등록/장학 서블릿 접속");
	
		// 학생 pk ID 
		String id = request.getParameter("who");
		
		Major1 major1 = new MajorService().selectOneTuition(id);
		/* Date payment = new MajorService().paymentCheck(); */
		String thisterm = new MajorService().termCheck();
		Major2 major2 = new MajorService().selectOneValueAndBene(id);
		
		System.out.println(major2);
		System.out.println(major1);
		
		System.out.println(thisterm);
		RequestDispatcher view = null;
		if(major1 != null) {
			view = request.getRequestDispatcher("views/major/majortuition.jsp");
			
			request.setAttribute("major2", major2);
			request.setAttribute("major1", major1);
			request.setAttribute("thisterm", thisterm);
			view.forward(request,response);
		}else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "등록금 고지서 조회실패 !");
			view.forward(request,response);
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
