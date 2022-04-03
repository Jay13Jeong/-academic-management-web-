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
 * Servlet implementation class GradeUpdateServlet
 */
@WebServlet("/grupdate")
public class GradeUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 424L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GradeUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher view = null;
		
		view = request.getRequestDispatcher("views/lectureScore/profscoreEdit_m_l_grade.jsp");
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
