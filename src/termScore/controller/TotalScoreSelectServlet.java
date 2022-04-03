package termScore.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import termScore.model.service.TermScoreService;
import termScore.model.vo.TermScore;

/**
 * Servlet implementation class TermScoreSelectServlet
 */
@WebServlet("/tosselect")
public class TotalScoreSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TotalScoreSelectServlet() {
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
		TermScore tscore = new TermScoreService().selectTotalScore(sid);
		RequestDispatcher view = null;
		if(tscore != null) {
			view = request.getRequestDispatcher("views/termScore/totalScoreView.jsp");
			request.setAttribute("tscore",  tscore);
			view.forward(request, response);
		}else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", sid + "전체성적 조회 실패!");
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
