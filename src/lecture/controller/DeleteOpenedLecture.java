package lecture.controller;

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

/**
 * Servlet implementation class DeleteOpenedLecture
 */
@WebServlet("/ldel")
public class DeleteOpenedLecture extends HttpServlet {
	private static final long serialVersionUID = 311246578567L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteOpenedLecture() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String lname = request.getParameter("lname");
		String r = new LectureService().deleteLecture(lname);
		
		ArrayList<Lecture> list = new LectureService().selectAllPlan();//전체강의목록불러오기
		ArrayList<Lecture> list2 = new LectureService().selectOpenedLectures();//개설된 강의목록 불러오기
		request.setAttribute("list", list);
		request.setAttribute("list2", list2);
		
		RequestDispatcher view = null;
		
		if(r.equals(lname)) {
			view = request.getRequestDispatcher("/views/lecture/addlecture.jsp");
			request.setAttribute("result", "good");
			view.forward(request, response);
		}else{
			view = request.getRequestDispatcher("/views/lecture/addlecture.jsp");
			request.setAttribute("result", "bad");
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
