package lecture.controller;
//학생시간표조회하기
import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lecture.model.service.LectureService;
import lecture.model.vo.TimeTable;

/**
 * Servlet implementation class selectTimeTableServlet
 */
@WebServlet("/showTimeTable")
public class selectTimeTableServlet extends HttpServlet {
	private static final long serialVersionUID = 3547758L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectTimeTableServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String studentid = request.getParameter("who");
		TimeTable list9 = new LectureService().selecTimeTable(studentid,"9");
		TimeTable list10 = new LectureService().selecTimeTable(studentid,"10");
		TimeTable list11 = new LectureService().selecTimeTable(studentid,"11");
		TimeTable list12 = new LectureService().selecTimeTable(studentid,"12");
		TimeTable list13 = new LectureService().selecTimeTable(studentid,"13");
		TimeTable list14 = new LectureService().selecTimeTable(studentid,"14");
		TimeTable list15 = new LectureService().selecTimeTable(studentid,"15");
		
		HashMap map = new HashMap();
		map.put("list9", list9);
		map.put("list10", list10);
		map.put("list11", list11);
		map.put("list12", list12);
		map.put("list13", list13);
		map.put("list14", list14);
		map.put("list15", list15);
		RequestDispatcher view = null;
		view = request.getRequestDispatcher("/views/lecture/selecttime.jsp");
		if(list9 != null)request.setAttribute("list", map);
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
