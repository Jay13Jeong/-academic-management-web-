package schedule.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import schedule.model.service.ScheduleService;
import schedule.model.vo.Schedule;


@WebServlet("/schdetail")
public class scheduleDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public scheduleDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String scheduleid = request.getParameter("scheduleid");
		Schedule schedule = new ScheduleService().selectSchedule(scheduleid);
		System.out.println("서블렛"+scheduleid);
		
		
		RequestDispatcher view = null;
		
		if(schedule != null) {
			view = request.getRequestDispatcher("views/schedule/scheduleDetailView.jsp");
			request.setAttribute("schedule", schedule);
			view.forward(request, response);
		}else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", scheduleid+ "에 대한 정보 없다");
			view.forward(request, response);
		}
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
