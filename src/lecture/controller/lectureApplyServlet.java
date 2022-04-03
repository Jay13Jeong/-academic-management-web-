package lecture.controller;
//수강신청
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lecture.model.service.LectureService;
import lecture.model.vo.ApplyReception;
import lecture.model.vo.Lecture;

/**
 * Servlet implementation class lectureApplyServlet
 */
@WebServlet("/lapply")
public class lectureApplyServlet extends HttpServlet {
	private static final long serialVersionUID = 3433454344L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public lectureApplyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Lecture> list = new LectureService().selectOpenedLectures();//개설된강좌목록불러오기
		request.setAttribute("list", list);
		
		
		
		String lname = request.getParameter("lname");
		String name = request.getParameter("who");
		
		//receptionno 만들기
		DateFormat yyyy = new SimpleDateFormat ("yyyy");
		DateFormat mm = new SimpleDateFormat ("MM");
		
		java.util.Date today = Calendar.getInstance().getTime();
		
		String year = (yyyy.format(today)).substring(2,4); 
		String month;
		if(Integer.parseInt(mm.format(today)) <  6) {
			month = "01";
		}else {
			month = "02";
		}
		Random ran = new Random();
		String serial = "" + (ran.nextInt(998) + 1);
		
		String receptionno = "r" + year + month + serial;
				
//		java.util.Date time = new java.util.Date();		
//		String time1 = format1.format(time);
		
		ApplyReception ar = new ApplyReception();
		ar.setId(name);
		ar.setLcode(request.getParameter("lcode"));
		ar.setLpersonnel(request.getParameter("lpersonnel"));
		ar.setReceptionno(receptionno);
		ar.setRoom(request.getParameter("room"));
		ar.setSemester(yyyy.format(today) + month);
		
		int r = new LectureService().applyLecture(lname,name,ar);//수강신청버튼
		request.setAttribute("resultForSession", lname);//신청여부 구분하기
		
		RequestDispatcher view = null;
		if(r > 0) {
			view = request.getRequestDispatcher("/views/lecture/applylecture.jsp");
			request.setAttribute("result", "ok");
			view.forward(request, response);
		}else if(r == -1){
			view = request.getRequestDispatcher("/views/lecture/applylecture.jsp");
			request.setAttribute("result", "already");
			view.forward(request, response);
		}else {
			view = request.getRequestDispatcher("/views/lecture/applylecture.jsp");
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
