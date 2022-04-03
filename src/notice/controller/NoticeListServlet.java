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
 * Servlet implementation class NoticeListServlet
 */
@WebServlet("/nlist")
public class NoticeListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 공지사항 목록보기+ 페이징 처리용 컨트롤러
		System.out.println("asd");
		
				int currentPage = 1; 
			
				if(request.getParameter("page") !=null) {
					currentPage = Integer.parseInt(request.getParameter("page"));
				}
				
				
				int limit = 10;
				
				NoticeService nservice = new NoticeService();
				
				
				int listCount = nservice.getListCount();
				
				
				ArrayList<Notice> list = nservice.selectList(currentPage, limit);
				
				//뷰에 출력될 총 페이지 수 계산 : 게시글이 1개이면 1페이지임
				//10페이지 기준
				int maxPage = (int)((double)listCount / limit +0.9);
				//현재 페이지가 속한 그룹의 시작 페이지 수 지정
				//예 : currentPage 가 35 이면 페이지 그룹이 10일때 시작페이지는 31이됨
				int startPage =(((int)((double)currentPage /limit +0.9))-1)* limit +1;
				int endPage = startPage + limit -1;
				
				if(maxPage< endPage) {
					endPage = maxPage;
				}
				System.out.println(currentPage);
				System.out.println(listCount);
				System.out.println(list);
				System.out.println(maxPage);
				System.out.println(startPage);
				System.out.println(endPage);
				RequestDispatcher view = null;
				if(list.size() >0) {
					view = request.getRequestDispatcher("views/notice/NoticeListView.jsp");
					
					request.setAttribute("list", list);
					request.setAttribute("currentPage", currentPage);
					request.setAttribute("maxPage", maxPage);
					request.setAttribute("startPage",startPage);
					request.setAttribute("endPage", endPage);
					request.setAttribute("listCount",listCount);
					System.out.println("출력성공!");
					view.forward(request, response);
				}else {
					view = request.getRequestDispatcher("views/common/error.jsp");
					request.setAttribute("message", currentPage +  "페이지에 대한 목록 조회 실패 !");
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
