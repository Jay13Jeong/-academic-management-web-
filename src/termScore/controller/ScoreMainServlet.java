package termScore.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import termScore.model.service.TermScoreService;
import termScore.model.vo.TermScore;


@WebServlet("/stusco")
public class ScoreMainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ScoreMainServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		System.out.println("서블릿 아이디"+id);
		ArrayList<TermScore> list = new TermScoreService().selectMain(id);
		
		JSONObject sendJSON = new JSONObject();
		JSONArray jarr = new JSONArray();
		
		for(TermScore score : list) {
			JSONObject job = new JSONObject();
			
			job.put("ID", score.getSid());
			job.put("SEMESTER", score.getSemester());
			job.put("TERMGETPOINT", score.getTermgetpoint());
			
			jarr.add(job);
			
		
		}
		System.out.println("서브릿"+ jarr);
		sendJSON.put("list", jarr);
		
		response.setContentType("applocation/json; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write(sendJSON.toJSONString());
		out.flush();
		out.close();
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
