package ssbenefitst.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ssbenefitst.model.service.SsbenefitstService;
import ssbenefitst.model.vo.Ssbenefitst;

@WebServlet("/updatebenest")
public class UpdateSsbenefitstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UpdateSsbenefitstServlet() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Ssbenefitst newssst, Ssbenefitst originssst  객체 2개 보내야함
		//홈페이지에서 구현하지 않음
		Ssbenefitst originssst = new Ssbenefitst();
		Ssbenefitst newssst = new Ssbenefitst();
		
		originssst.setBenefitterm(Integer.parseInt(request.getParameter("originterm")));
		originssst.setStudentid(request.getParameter("originid"));
		
		newssst.setBenefitterm(Integer.parseInt(request.getParameter("benefitterm")));
		newssst.setStudentid(request.getParameter("studentid"));
		newssst.setSsname(request.getParameter("ssname"));
		
		int result = new SsbenefitstService().updateSsbenefitst(newssst, originssst);
		
		if(result > 0) {
			response.sendRedirect("views/ssbenefitst/ssbenefitstManagementView.jsp");
		}else {
			RequestDispatcher view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "장학금수혜학생정보 업데이트에 실패하였습니다.");
			view.forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
