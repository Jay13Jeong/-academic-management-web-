package schedule.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import javax.servlet.http.HttpServletResponse;

import schedule.model.service.ScheduleService;
import schedule.model.vo.Schedule;


@WebServlet("/smonth")
public class ScheduleListMonthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ScheduleListMonthServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Schedule> list = new ScheduleService().selectMonth();
	
		JSONObject sendJSON = new JSONObject();
		JSONArray jarr = new JSONArray();
		
		for(Schedule schedule : list) {
			JSONObject job = new JSONObject();
			
			job.put("scheduleid", schedule.getScheduleid());
			job.put("schstartdate", schedule.getSchstartdate());
			job.put("schname", schedule.getSchname());
			
			jarr.add(job);
		}
		System.out.println("servlet"+ jarr);
		sendJSON.put("list", jarr);
		
		response.setContentType("applocation/json; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write(sendJSON.toJSONString());
		out.flush();
		out.close();
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
