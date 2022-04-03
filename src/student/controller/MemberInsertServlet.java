package student.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lecture.model.service.LectureService;
import lecture.model.vo.Major;
import student.model.service.MemberService;
import student.model.vo.Member;

/**
 * Servlet implementation class MemberInsertServlet
 */
@WebServlet("/minsert.cp")
public class MemberInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 3556656445L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 회원가입 컨트롤러
		String code = "beet1216";//회원가입 인증번호
		
		Member member = new Member();
		
		if(request.getParameter("major") != null) {

			String[] index = ((String)(request.getParameter("major"))).split(",");
			
			for(String s : index) {
				System.out.println(s);
			}
			String majorno = index[0];
			String categoryname = index[1];
			
			member.setMajorno(majorno);
			member.setCategoryname(categoryname);
		}
		
		if(request.getParameter("adminhiredate") != null) {
			Date d1 = Date.valueOf(request.getParameter("adminhiredate"));
			member.setAdminhiredate(d1);
		}
		if(request.getParameter("entrancedate") != null) {
			Date d2 = Date.valueOf(request.getParameter("entrancedate"));
			member.setEntrancedate(d2);
		}
		if(request.getParameter("userid") != null) {
			member.setId(request.getParameter("userid"));
		}
		if(request.getParameter("username") != null) {
			member.setName(request.getParameter("username"));
		}
		if(request.getParameter("userssn") != null) {
			member.setSsn(request.getParameter("userssn"));
		}
		if(request.getParameter("useraddress") != null) {
			member.setAddress(request.getParameter("useraddress"));
		}
		if(request.getParameter("phone") != null) {
			member.setPhone(request.getParameter("phone"));
		}
		if(request.getParameter("email") != null) {
			member.setEmail(request.getParameter("email"));
		}
		if(request.getParameter("treasure") != null) {
			member.setTreasure(request.getParameter("treasure"));
		}
		if(request.getParameter("userpwd") != null) {
			member.setPassword(request.getParameter("userpwd"));
		}
		if(request.getParameter("absencecount") != null) {
			member.setAbsencecount(Integer.parseInt(request.getParameter("absencecount")));
		}
		if(request.getParameter("absencewhether") != null) {
			member.setAbsencewhether(request.getParameter("absencewhether"));
		}
		if(request.getParameter("gender") != null) {
			member.setGender(request.getParameter("gender"));
		}
		
		request.setAttribute("saved", member);
		
		int result = 0;
	
		String who = request.getParameter("who");
		
		if(request.getParameter("code") == null || !(request.getParameter("code").equals(code))) {
			System.out.println("인증 시도 text : " + request.getParameter("code"));
			ArrayList<Major> list = new LectureService().selectCategories();
			request.setAttribute("list", list);
			
			RequestDispatcher view = request.getRequestDispatcher("views/student/enrollPage.jsp");
			request.setAttribute("who", who);
			request.setAttribute("result", "no");
			view.forward(request, response);
		}
			
		if((who.equals("professor") && (request.getParameter("userid").substring(0,1)).equals("P")) ||
			(who.equals("admin") && (request.getParameter("userid").substring(0,1)).equals("A")) ||
			who.equals("student")) {

			result = new MemberService().insertMember(member,who);
			
		}	
		

		if(result > 0) {  
			RequestDispatcher view = request.getRequestDispatcher("index.jsp");
	
			view.forward(request, response);
			System.out.println("doget성공");
		}else {  
			ArrayList<Major> list = new LectureService().selectCategories();
			request.setAttribute("list", list);
			
			RequestDispatcher view = request.getRequestDispatcher("views/student/enrollPage.jsp");
			request.setAttribute("who", who);
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
