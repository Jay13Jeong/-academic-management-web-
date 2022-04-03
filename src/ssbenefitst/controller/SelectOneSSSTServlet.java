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

/**
 * Servlet implementation class SelectOneSSSTServlet
 */
@WebServlet("/selectonessst")
public class SelectOneSSSTServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectOneSSSTServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studentid = request.getParameter("studentid");
		int benefitterm = Integer.parseInt(request.getParameter("benefitterm"));
		Ssbenefitst ssst = new SsbenefitstService().selectOneSsbenefitst(benefitterm, studentid);
		int currentPage = Integer.parseInt(request.getParameter("page"));
		
		PrintWriter out = response.getWriter();
		RequestDispatcher view = null;
		if(ssst.getStudentid() != null) {
			view = request.getRequestDispatcher("selectbeneall?page="+currentPage);
			request.setAttribute("ssst", ssst);
			view.forward(request, response);
		}else {
			out.print("<script>");
			out.print("alert('입력하신 값과 일치하는 결과가 없습니다.');");
			out.print("location.href = 'selectbeneall?page="+currentPage+"'");
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
