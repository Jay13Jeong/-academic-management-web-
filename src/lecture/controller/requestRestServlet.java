package lecture.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
 * Servlet implementation class requestRestServlet
 */
@WebServlet("/requestr")
public class requestRestServlet extends HttpServlet {
	private static final long serialVersionUID = 311212212L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public requestRestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date d1 = Date.valueOf(request.getParameter("dayoff"));
		Date d2 = Date.valueOf(request.getParameter("rday"));
		
		Rest r = new Rest();
		r.setDayoff(d1);
		r.setRday(d2);
		r.setId(request.getParameter("userid"));
		r.setLcode(request.getParameter("lcode"));
		r.setReason(request.getParameter("reason"));
		r.setReceptionno(request.getParameter("receptionno"));
		r.setRoom(request.getParameter("room"));
		r.setRtime(request.getParameter("rtime"));
		r.setSubid(request.getParameter("subid"));
		r.setWay(request.getParameter("way"));
		
		int result = new LectureService().insertRest(r);
		
		ArrayList<Rest> list = new LectureService().selectRest();//휴보강신청목록을 관리자에게
		ArrayList<Lecture> list2 = new LectureService().selectAllPlan();//전체강의목록불러오기
		ArrayList<Lecture> list3 = new LectureService().selectMyLectures(request.getParameter("userid"));
		request.setAttribute("list", list);
		request.setAttribute("list2", list2);
		request.setAttribute("list3", list3);
		
		RequestDispatcher view = null;
		
		if(result > 0) {
			view = request.getRequestDispatcher("/views/lecture/rest.jsp");
			request.setAttribute("result", "ok");
			view.forward(request, response);
		}else {
			view = request.getRequestDispatcher("/views/lecture/rest.jsp");
			request.setAttribute("result", "no");
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
