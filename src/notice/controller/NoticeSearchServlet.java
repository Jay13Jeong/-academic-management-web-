package notice.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import notice.model.service.NoticeService;
import notice.model.vo.Notice;



/**
 * Servlet implementation class NoticeSearchServlet
 */
@WebServlet("/nsearch")
public class NoticeSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("NoticeSearchSelvet 접속 성공 !");
		/* request.setCharacterEncoding("utf-8"); */
		
		/* Notice notice = new Notice(); */
		
		String searchOption = request.getParameter("searchoption");
		String keyword = request.getParameter("search");
		
		ArrayList<Notice> list = new NoticeService().searchList(keyword,searchOption);
		RequestDispatcher view = null;
		if(list.size()>0) { //전체조회 (사이즈크기 0보다크면 성공 )
			view = request.getRequestDispatcher("views/notice/noticeSearchListView.jsp");
			request.setAttribute("list", list);
			
			view.forward(request, response);
			System.out.println("nsearch성공!");
		}else { //실패 
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "선택조회실패 !");
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
