package attendance.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import attendance.model.service.AtndnService;
import attendance.model.vo.Atndn;

/**
 * Servlet implementation class MyLctrServlet
 */
@WebServlet("/mylctrSeme")
public class MyLctrSemester extends HttpServlet {
	private static final long serialVersionUID = 417543L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyLctrSemester() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sid = request.getParameter("userid");
		String semester = request.getParameter("semester");

		ArrayList<Atndn> list = new AtndnService().selectMyLctrSemstr(sid, semester);
		RequestDispatcher view = null;
		
		if(list.size() > 0) {
			view = request.getRequestDispatcher("/views/attendance/myLctrPage.jsp");
			request.setAttribute("list", list);
			view.forward(request, response);
		}else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "나의 강의목록 조회 실패");
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
