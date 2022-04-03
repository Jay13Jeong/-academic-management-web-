package schedule.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import schedule.model.service.ScheduleService;
import schedule.model.vo.Schedule;


@WebServlet("/schlist")
public class ScheduleListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ScheduleListServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Schedule> list1 = new ScheduleService().select1();
		ArrayList<Schedule> list2 = new ScheduleService().select2();
		ArrayList<Schedule> list3 = new ScheduleService().select3();
		ArrayList<Schedule> list4 = new ScheduleService().select4();
		ArrayList<Schedule> list5 = new ScheduleService().select5();
		ArrayList<Schedule> list6 = new ScheduleService().select6();
		ArrayList<Schedule> list7 = new ScheduleService().select7();
		ArrayList<Schedule> list8 = new ScheduleService().select8();
		ArrayList<Schedule> list9 = new ScheduleService().select9();
		ArrayList<Schedule> list10 = new ScheduleService().select10();
		ArrayList<Schedule> list11 = new ScheduleService().select11();
		ArrayList<Schedule> list12 = new ScheduleService().select12();
		ArrayList<Schedule> list13 = new ScheduleService().select13();
		
		

		RequestDispatcher view = null;
	
	
		
		view = request.getRequestDispatcher("views/schedule/scheduleListView.jsp");
		
		request.setAttribute("list1", list1);
		request.setAttribute("list2", list2);
		request.setAttribute("list3", list3);
		request.setAttribute("list4", list4);
		request.setAttribute("list5", list5);
		request.setAttribute("list6", list6);
		request.setAttribute("list7", list7);
		request.setAttribute("list8", list8);
		request.setAttribute("list9", list9);
		request.setAttribute("list10", list10);
		request.setAttribute("list11", list11);
		request.setAttribute("list12", list12);
		request.setAttribute("list13", list13);
		
		view.forward(request, response);
		
		
		
		
	
		
		}


		
		
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
