package lecture.controller;
//휴보강 철회 버튼
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
import lecture.model.vo.Rest;

/**
 * Servlet implementation class modifyRestServlet
 */
@WebServlet("/delrest")
public class deleteRestServlet extends HttpServlet {
	private static final long serialVersionUID = 32322312L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteRestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String no = request.getParameter("what");
		System.out.println(no);
		int r = new LectureService().delRest(no);
		
		ArrayList<Rest> list = new LectureService().selectRest();//휴보강신청목록을 관리자에게
		ArrayList<Lecture> list2 = new LectureService().selectAllPlan();//전체강의목록불러오기
		ArrayList<Lecture> list3 = new LectureService().selectMyLectures(request.getParameter("userid"));
		request.setAttribute("list", list);
		request.setAttribute("list2", list2);
		request.setAttribute("list3", list3);
		
		RequestDispatcher view = null;
		
		if(r > 0) {
			view = request.getRequestDispatcher("/views/lecture/rest.jsp");
			request.setAttribute("result", "good");
			view.forward(request, response);
		}else {
			view = request.getRequestDispatcher("/views/lecture/rest.jsp");
			request.setAttribute("result", "bad");
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
