package schedule.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import schedule.model.service.ScheduleService;


@WebServlet("/schdel")
public class scheduleDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public scheduleDeleteServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String scheduleid = request.getParameter("scheduleid");
		
		int result = new ScheduleService().deleteSchedule(scheduleid);
		RequestDispatcher view = null;
		
		if(result > 0) {
			
			response.sendRedirect("adsch?page=1");
		}else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "학사일정 삭제 실패");
			view.forward(request, response);
		
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
