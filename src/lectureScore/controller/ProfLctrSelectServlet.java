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
 * Servlet implementation class ScoreSelectServlet
 */
@WebServlet("/scmain.p")
public class ProfLctrSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 427L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfLctrSelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//성적조회용 처리 

		String pid = request.getParameter("userid");
		String semester = "202001";
		
		ArrayList<LectureScore> list = new LectureScoreService().selectProfLectureList(pid, semester);
		
		RequestDispatcher view = null;
		
		if(list != null) {
			view = request.getRequestDispatcher("views/lectureScore/profscoreEdit_main.jsp");
			request.setAttribute("list", list);
			view.forward(request, response);
		}else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", pid + "교수의 성적관리 페이지 조회 실패");
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
