package scholarship.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import scholarship.model.service.ScholarshipService;
import scholarship.model.vo.Scholarship;

@WebServlet("/selectoness")
public class SelectOneSSServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SelectOneSSServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ssname = request.getParameter("ssname");
		Scholarship ss = new ScholarshipService().selectOneScholarship(ssname);
		
		RequestDispatcher view = null;
		if(ss != null) {
			view = request.getRequestDispatcher("selectss");
			request.setAttribute("ss", ss);
			view.forward(request, response);
		}else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "장학금 조회에 실패하였습니다");
			view.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
