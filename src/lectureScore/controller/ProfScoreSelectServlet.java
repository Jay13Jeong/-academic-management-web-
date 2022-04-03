package lectureScore.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lectureScore.model.service.LectureScoreService;
import lectureScore.model.vo.LectureScore;

/**
 * Servlet implementation class ProfScoreUpdateServlet
 */
@WebServlet("/scselect.p")
public class ProfScoreSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfScoreSelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String lname = request.getParameter("lname");
		System.out.println(lname);
		String semester = "202001";
		
		ArrayList<LectureScore> list = new LectureScoreService().selectProfLectureScore(lname, semester);
		
		RequestDispatcher view = null;
		if(list != null) { //조회가 성공하면 
			view = request.getRequestDispatcher("views/lectureScore/profscoreEdit_m_lecture.jsp");
			request.setAttribute("list", list);
			view.forward(request, response);
		}else {
			view =request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", lname + "성적관리페이지로 이동실패");
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
