package major.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import major.model.service.MajorService;
import major.model.vo.Major;



/**
 * Servlet implementation class MajorDetailSerlvet
 */
@WebServlet("/mdetail")
public class MajorDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MajorDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 전공 상세보기 처리용 컨트롤러 
		String majorno = request.getParameter("majorno");
		
		
		
		
		
		
		Major major = new MajorService().selectMajor(majorno);
		
		
		RequestDispatcher view = null;
		if(major != null) {
			view = request.getRequestDispatcher("views/major/majorDetailView.jsp");
			System.out.println("성공");
			request.setAttribute("major", major);
			view.forward(request, response);
		}else {
			view= request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", majorno +"번 글에 대한 상세보기 요청 실패!");
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
