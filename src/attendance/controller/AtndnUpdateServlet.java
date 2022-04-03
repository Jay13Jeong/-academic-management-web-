package attendance.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import attendance.model.service.AtndnService;
import attendance.model.vo.Atndn;


/**
 * Servlet implementation class AtndnUpdateServlet
 */
@WebServlet("/atnupdate")
public class AtndnUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 414L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AtndnUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pid = request.getParameter("userid");
		String semester = "202001";
		String lcode = request.getParameter("lcode");
		
		ArrayList<Atndn> list = new AtndnService().selectProfAtndnList(pid, semester, lcode);
		
		if(list != null) {
			request.setAttribute("list", list);
		}
		
		
		int whoCount = 0;
		String week = request.getParameter("selectweek");
		
		ArrayList<Atndn> list2 = new ArrayList<Atndn>();
		while(request.getParameter("who" + ++whoCount) != null ) {
	
			Atndn atndn = new Atndn();
			atndn.setLcode(request.getParameter("lcode"));
			atndn.setSid(request.getParameter("who" + whoCount));
			atndn.setWeek1(week);
			atndn.setThisweek(request.getParameter("selectfour" + whoCount));
			
			list2.add(atndn);
		}

		
		int result = new AtndnService().updateWeekAll(list2);
		
		RequestDispatcher view = null;
		
		if(result > 0) {
			/*
			 * view = request.getRequestDispatcher("views/attendance/atndnEdit.jsp");
			 * request.setAttribute("result", "yes"); view.forward(request, response);
			 */
			response.sendRedirect("/beet/views/attendance/atndnEdit.jsp");
		}else {
			view = request.getRequestDispatcher("views/attendance/atndnEdit.jsp");
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
