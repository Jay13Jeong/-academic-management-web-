package ssbenefitst.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import schedule.model.vo.Schedule;
import scholarship.model.service.ScholarshipService;
import scholarship.model.vo.Scholarship;
import ssbenefitst.model.service.SsbenefitstService;
import ssbenefitst.model.vo.Ssbenefitst;

/**
 * Servlet implementation class SelectAllBENEServlet
 */
@WebServlet("/selectbeneall")
public class SelectAllBENEServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectAllBENEServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int currentPage = 1;
		if(request.getParameter("page") !=null) {
			currentPage = Integer.parseInt(request.getParameter("page"));
		}
		int limit = 10;
		
		int listCount = new SsbenefitstService().getListCount();
		ArrayList<Ssbenefitst> list = new SsbenefitstService().selectSsbenefitst(currentPage, limit);
		ArrayList<Scholarship> sslist = new ScholarshipService().selectScholarship();

		if (request.getAttribute("ssst") != null) {
			Ssbenefitst stst = (Ssbenefitst)request.getAttribute("ssst");
		}
		 
	   int maxPage = (int)((double)listCount / limit + 0.9);
	   int startPage = (((int)((double)currentPage / limit + 0.9)) -1)* limit +1;
	   int endPage = startPage + limit -1;
		
	   if(maxPage < endPage) {
			endPage = maxPage;
	   }

		RequestDispatcher view = null;
		if(list != null) {
			view = request.getRequestDispatcher("views/ssbenefitst/ssbenefitstManagementView.jsp");
			request.setAttribute("list", list);
			request.setAttribute("sslist", sslist);
			if (request.getAttribute("ssst") != null) {
				Ssbenefitst stst = (Ssbenefitst)request.getAttribute("ssst");
			}
			request.setAttribute("currentPage", currentPage);
			request.setAttribute("maxPage", maxPage);
			request.setAttribute("startPage", startPage);
			request.setAttribute("endPage", endPage);
			request.setAttribute("listCount", listCount);
			
			view.forward(request, response);
		}else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "장학금수혜학생 조회에 실패하였습니다.");
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
