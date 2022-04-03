package scholarship.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import scholarship.model.service.ScholarshipService;
import scholarship.model.vo.Scholarship;

@WebServlet("/updatess")
public class UpdateScholarshipServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UpdateScholarshipServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Scholarship ss = new Scholarship();
		String ssname = request.getParameter("ssname");
		String originname = request.getParameter("originname");

		ss.setSsname(ssname);
		ss.setBenefitcon(request.getParameter("benefitcon"));
		ss.setValue(Integer.parseInt(request.getParameter("value")));

		int result = new ScholarshipService().updateScholarship(ss, originname);
		
		PrintWriter out = response.getWriter();
		RequestDispatcher view = null;
		if(result > 0) {
			out.print("<script>");
			out.print("alert('수정에 성공하였습니다.');");
			out.print("location.href = 'selectss'");
			out.print("</script>");
			out.close();
		}else {
			out.print("<script>");
			out.print("alert('수정에 실패하였습니다.');");
			out.print("location.href = 'selectss'");
			out.print("</script>");
			out.close();
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
