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
 * Servlet implementation class SearchKeywordServlet
 */
@WebServlet("/adsearch")
public class SearchKeywordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchKeywordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8"); 
		
		String action = request.getParameter("action");
		String keyword =request.getParameter("keyword");
		System.out.println(action);
		System.out.println(keyword);
		LectureScoreService lservice = new LectureScoreService();
		ArrayList<LectureScore> list = null;
		
		switch(action) {
		case "sname" 	:  list = lservice.selectSearchUserid(keyword); break;
		case "lname" 	:  list = lservice.selectSearchLname(keyword); break;
		}
		
		RequestDispatcher view = null;
		if(list.size() > 0 ) {
			view = request.getRequestDispatcher("views/lectureScore/adminSearchView.jsp");
			request.setAttribute("list", list);
			view.forward(request, response);
		}else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", action + "검색에 대한" + keyword + "결과가 존재하지 않습니다");
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
