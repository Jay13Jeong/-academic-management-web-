package 날씨.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import schedule.model.vo.Schedule;
import 날씨.model.service.WeatherService;


@WebServlet("/weather")
public class WeatherApiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public WeatherApiServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String list = new WeatherService().weatherList();
		System.out.println("서블렛"+list);
		
		
	
		response.setContentType("applocation/json; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write(list);
		out.flush();
		out.close();

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}







