package scholarship.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import scholarship.model.service.ScholarshipService;
import scholarship.model.vo.Scholarship;

@WebServlet("/selectss")
public class SelectScholarshipServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SelectScholarshipServlet() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Scholarship> list = new ScholarshipService().selectScholarship();
		
		RequestDispatcher view = null;
		if(list != null) {
			view = request.getRequestDispatcher("views/scholarship/scholarshipManagementView.jsp");
			if((Scholarship)request.getAttribute("ss") != null) {
				request.setAttribute("ss", (Scholarship)request.getAttribute("ss"));
			}
			request.setAttribute("list", list);
			view.forward(request, response);
		}else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "장학금 조회에 실패하였습니다");
			view.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
