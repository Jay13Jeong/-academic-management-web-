package lecture.controller;
//강의계획서 전체 보기
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
 * Servlet implementation class showPlanServlet
 */
@WebServlet("/showplan.ss")
public class showPlanServlet extends HttpServlet {
	private static final long serialVersionUID = 378979800L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showPlanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Lecture> list = new LectureService().selectAllPlan();//모든 강의계획서보기
		
		RequestDispatcher view = null;
		
		view = request.getRequestDispatcher("/views/lecture/lectureplan.jsp");
		request.setAttribute("list", list);
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
