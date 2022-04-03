package absence.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import absence.model.service.AbsenceService;

@WebServlet("/insertab")
public class InsertAbsenceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public InsertAbsenceServlet() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//학생 휴학신청 처리용 컨트롤러
		
		String value = request.getParameter("value");
		String studentid = request.getParameter("studentid");
		
		System.out.println(value);
		System.out.println(studentid);
		
		int result = new AbsenceService().insertAbsence(value, studentid); 
		
		PrintWriter out = response.getWriter();
		
		RequestDispatcher view = null;
		if(result >0) { //성공한다면 		

			  out.print("<script>");
			  out.print("alert('신청이 완료되었습니다.');");
			  out.print("location.href = 'selectab?studentid="+studentid+"'");
			  out.print("</script>");
			  out.close();
		}else {
			
			 out.print("<script>");
			  out.print("alert('신청에 실패하였습니다.');");
			  out.print("location.href = 'selectab?studentid="+studentid+"'");
			  out.print("</script>");
			  out.close();

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
