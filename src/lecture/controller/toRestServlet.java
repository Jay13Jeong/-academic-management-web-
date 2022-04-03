package lecture.controller;
//메뉴에서 
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lecture.model.service.LectureService;
import lecture.model.vo.Lecture;
import lecture.model.vo.Rest;
import student.model.vo.Member;

/**
 * Servlet implementation class toRestServlet
 */
@WebServlet("/torest")
public class toRestServlet extends HttpServlet {
	private static final long serialVersionUID = 33454545L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public toRestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Rest> list = new LectureService().selectRest();//휴보강신청목록을 관리자에게
		ArrayList<Lecture> list2 = new LectureService().selectAllPlan();//전체강의목록불러오기
		String id = request.getParameter("who");
		ArrayList<Lecture> list3 = new LectureService().selectMyLectures(id);
		
		RequestDispatcher view = request.getRequestDispatcher("/views/lecture/rest.jsp");
		request.setAttribute("list", list);
		request.setAttribute("list2", list2);
		request.setAttribute("list3", list3);
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
