package termScore.controller;

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
import termScore.model.service.TermScoreService;
import termScore.model.vo.TermScore;

/**
 * Servlet implementation class MyScoreServlet
 */
@WebServlet("/myScore")
public class MyScoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyScoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//전체성적조회
		String sid = request.getParameter("userid");
		TermScore tscore = new TermScoreService().selectTotalScore(sid);
		
		//학기별성적조회
		ArrayList<TermScore> tlist = new TermScoreService().selectTermScore(sid);
		
		//과목별성적조회
		String semester = request.getParameter("semester");
		
		ArrayList<LectureScore> list = new LectureScoreService().selectLectureScore(sid, semester);
		
		RequestDispatcher view = null;
		System.out.println(list);
		System.out.println(tlist);
		System.out.println(tscore);
		if(list != null && tlist != null && tscore != null) {
			view = request.getRequestDispatcher("views/termScore/myScore.jsp");
			
			request.setAttribute("list", list); 
			request.setAttribute("tlist",tlist);
			request.setAttribute("tscore", tscore);
			view.forward(request, response);
		}else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", sid + "성적 조회 실패!");
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
