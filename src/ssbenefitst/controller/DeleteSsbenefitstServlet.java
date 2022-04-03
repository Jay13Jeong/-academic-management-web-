package ssbenefitst.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ssbenefitst.model.service.SsbenefitstService;
import ssbenefitst.model.vo.Ssbenefitst;

@WebServlet("/deletebenest")
public class DeleteSsbenefitstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteSsbenefitstServlet() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int benefitterm = Integer.parseInt(request.getParameter("benefitterm"));
		String studentid = request.getParameter("studentid");
		
		int result = new SsbenefitstService().deleteSsbenefitst(benefitterm, studentid);
		
		PrintWriter out = response.getWriter();
		if(result > 0 ) {
			out.print("<script>");
			out.print("alert('장학금 수혜학생정보 삭제에 성공하였습니다.');");
			out.print("location.href = 'selectbeneall'");
			out.print("</script>");
			out.close();
		}else {
			out.print("<script>");
			out.print("alert('장학금 수혜학생정보 삭제에 실패하였습니다.');");
			out.print("location.href = 'selectbeneall'");
			out.print("</script>");
			out.close();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
