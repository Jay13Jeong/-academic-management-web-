package lecture.controller;
//메뉴에서 수강신청 페이지로!!
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lecture.model.service.LectureService;
import lecture.model.vo.Lecture;

/**
 * Servlet implementation class toPlanServlet
 */
@WebServlet("/toapply")
public class toApplyServlet extends HttpServlet {
	private static final long serialVersionUID = 36564578765L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public toApplyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Lecture> list = new LectureService().selectOpenedLectures();//개설된 강좌목록 불러오기
		
		RequestDispatcher view = request.getRequestDispatcher("/views/lecture/applylecture.jsp");
		request.setAttribute("list", list);
		request.setAttribute("result", "null값제거용_루삥뽕");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
