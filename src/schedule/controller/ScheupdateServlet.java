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


@WebServlet("/upsch")
public class ScheupdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ScheupdateServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
				
		request.setCharacterEncoding("utf-8");
		RequestDispatcher view = null;
		
		System.out.println(request);
		
		Schedule schedule = new Schedule();
		
		schedule.setScheduleid(request.getParameter("scheduleid"));
		schedule.setAdno(request.getParameter("adno"));
		schedule.setSchname(request.getParameter("schname"));
		schedule.setSchstartyear(Integer.parseInt(request.getParameter("schstartyear")));
		schedule.setSchstartmonth(Integer.parseInt(request.getParameter("schstartmonth")));
		schedule.setSchstartdate(Integer.parseInt(request.getParameter("schstartdate")));
		schedule.setSchendyear(Integer.parseInt(request.getParameter("schendyear")));
		schedule.setSchendmonth(Integer.parseInt(request.getParameter("schendmonth")));
		schedule.setSchenddate(Integer.parseInt(request.getParameter("schenddate")));

		
		
		int result = new ScheduleService().updateSchedule(schedule);
		
		if(result > 0) {
			response.sendRedirect("adsch?page=1");
		}else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "학사일정 수정 실패");
			view.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
