package lectureScore.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lecture.model.service.LectureService;
import lectureScore.model.vo.LectureScore;

/**
 * Servlet implementation class TestArray
 */
@WebServlet("/testarray")
public class TestArray extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestArray() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		int len =  request.getParameterValues("category").length;
		System.out.println(len);
		LectureScore lscore= new LectureScore();
		
		
		lscore.setCategory(String.join(",", request.getParameterValues("category")));
		lscore.setReceptionno(String.join(",",request.getParameterValues("receptionno")));
		lscore.setLcode(String.join(",",request.getParameterValues("lcode")));
		lscore.setLname(String.join(",",request.getParameterValues("lname")));
		lscore.setCategory(String.join(",",request.getParameterValues("category")));
		lscore.setAtndnscore(Integer.parseInt(String.join(",",request.getParameterValues("atndnscore"))));
		lscore.setMidscore(Integer.parseInt(String.join(",",request.getParameterValues("midscore"))));
		lscore.setFinalscore(Integer.parseInt(String.join(",",request.getParameterValues("finalscore"))));
		lscore.setTotalscore(Integer.parseInt(String.join(",",request.getParameterValues("totalscore"))));
		lscore.setGrade(String.join(",",request.getParameterValues("grade")));
		
		//int result = new LectureService().updateScore();
		
		//if(result > 0) {
		///	response.sendRedirect(arg0);
		//}
		
				
				
				
				
				
				
		/*
		 * atndn.setSid(String.join(",", request.getParameterValues("sid")));
		 * atndn.setSname(String.join(",", request.getParameterValues("sname")));
		 * atndn.setMajorname(String.join(",",
		 * request.getParameterValues("majorname"))); atndn.setWeek1(String.join(",",
		 * request.getParameterValues("week1"))); atndn.setWeek2(String.join(",",
		 * request.getParameterValues("week2"))); atndn.setWeek3(String.join(",",
		 * request.getParameterValues("week3"))); atndn.setWeek4(String.join(",",
		 * request.getParameterValues("week4"))); atndn.setWeek5(String.join(",",
		 * request.getParameterValues("week5"))); atndn.setWeek6(String.join(",",
		 * request.getParameterValues("week6"))); atndn.setWeek7(String.join(",",
		 * request.getParameterValues("week7"))); atndn.setWeek8(String.join(",",
		 * request.getParameterValues("week8"))); atndn.setWeek9(String.join(",",
		 * request.getParameterValues("week9"))); atndn.setWeek10(String.join(",",
		 * request.getParameterValues("week10"))); atndn.setWeek11(String.join(",",
		 * request.getParameterValues("week11"))); atndn.setWeek12(String.join(",",
		 * request.getParameterValues("week12"))); atndn.setWeek13(String.join(",",
		 * request.getParameterValues("week13"))); atndn.setWeek14(String.join(",",
		 * request.getParameterValues("week14"))); atndn.setWeek15(String.join(",",
		 * request.getParameterValues("week15"))); atndn.setWeek16(String.join(",",
		 * request.getParameterValues("week16")));
		 */	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
