package termScore.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import termScore.model.service.TermScoreService;
import termScore.model.vo.TermScore;

/**
 * Servlet implementation class TermScoreSelectServlet
 */
@WebServlet("/tesselect")
public class TermScoreSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TermScoreSelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//학생의 전체성적 조회처리 
		
		
		String sid = request.getParameter("userid");
		response.setContentType("text/html; charset=utf-8");
		//3
		ArrayList<TermScore> list = new TermScoreService().selectTermScore(sid);
		RequestDispatcher view = null;
		
		if(list != null) {
			view = request.getRequestDispatcher("views/termScore/termScoreView.jsp");
			request.setAttribute("tlist",  list);
			view.forward(request, response);
		}else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", sid + "학기성적 조회 실패!");
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
