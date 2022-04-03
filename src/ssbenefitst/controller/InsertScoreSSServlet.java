package ssbenefitst.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ssbenefitst.model.service.SsbenefitstService;

@WebServlet("/insertscoress")
public class InsertScoreSSServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertScoreSSServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int term = Integer.parseInt(request.getParameter("term1"));
		int startrank = Integer.parseInt(request.getParameter("startrank"));
		int endrank = Integer.parseInt(request.getParameter("endrank"));
		String ssname = request.getParameter("ssname1");
		
		System.out.println("term : " + term);
		System.out.println("startrank : " + startrank);
		System.out.println("endrank : " + endrank);
		System.out.println("ssname : " + ssname);
		
		SsbenefitstService stservice = new SsbenefitstService();
		ArrayList<String> studentlist = stservice.selectRank(term, startrank, endrank);
		int plusterm = stservice.termPlus(term);
		System.out.println(studentlist);
		System.out.println("plusterm : " + plusterm);
		
		int result = stservice.insertScoreRank(plusterm, studentlist, ssname);
		PrintWriter out = response.getWriter();	
		RequestDispatcher view = null;
		if (result > 0) {
			out.print("<script>");
			out.print("alert('성적장학금 수혜학생 입력이 완료되었습니다.');");
			out.print("location.href = 'selectbeneall'");
			out.print("</script>");
			out.close();
		}else {
			out.print("<script>");
			out.print("alert('성적장학금 수혜학생 입력에 실패하였습니다.');");
			out.print("location.href = 'selectbeneall'");
			out.print("</script>");
			out.close();
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
