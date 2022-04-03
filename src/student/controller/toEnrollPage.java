package student.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lecture.model.service.LectureService;
import lecture.model.vo.Major;
/**
 * Servlet implementation class toEnrollPage
 */
@WebServlet("/toenroll")
public class toEnrollPage extends HttpServlet {
	private static final long serialVersionUID = 3333222L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public toEnrollPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String who = request.getParameter("who");
		request.setAttribute("who", who);
		
		ArrayList<Major> list = new LectureService().selectCategories();
		request.setAttribute("list", list);
		
		RequestDispatcher view = request.getRequestDispatcher("/views/student/enrollPage.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
