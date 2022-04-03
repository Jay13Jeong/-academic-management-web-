package major.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import major.model.service.MajorService;
import major.model.vo.Major;


/**
 * Servlet implementation class MajorAdminListServlet
 */
@WebServlet("/mlist.ad")
public class MajorAdminListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MajorAdminListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//관리자용 전공조회 서블릿 접속
					System.out.println("관리자용 전공조회 서블릿 접속");

		
	   
					
				
					
					
					
					
					MajorService mservice = new MajorService();
					
					
					int listCount = mservice.getListCount();
					
					
					ArrayList<Major> list = mservice.selectList();
					
					RequestDispatcher view = null;
					if(list.size() >0) {
						view = request.getRequestDispatcher("views/major/majorListViewAdmin.jsp");
						
						request.setAttribute("list", list);
						
						request.setAttribute("listCount",listCount);
						System.out.println("관리자 전공조회 페이징처리 완료 !");
						view.forward(request, response);
						System.out.println("jsp로내보셈 성공 !");
					}else {
						view = request.getRequestDispatcher("views/common/error.jsp");
						request.setAttribute("message",   "페이지에 대한 목록 조회 실패 !");
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
