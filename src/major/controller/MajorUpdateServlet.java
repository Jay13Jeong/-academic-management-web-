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
 * Servlet implementation class MajorUpdateServlet
 */
@WebServlet("/majorupdate.ad")
public class MajorUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MajorUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 관리자용 공지사항 수정페이지로 이동 처리용 컨트롤러
		
		int majorNo = Integer.parseInt(request.getParameter("majorno"));
		System.out.println(majorNo);
		Major major = new MajorService().selectMajor(majorNo);
		
		RequestDispatcher view = null;
		if (major != null) {
			view = request.getRequestDispatcher("views/major/majorUpdateView.jsp");
			request.setAttribute("major", major);
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", majorNo + "번 글에 대한 수정페이지 요청 실패");
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
