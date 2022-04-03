package attendance.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import attendance.model.service.AtndnService;
import attendance.model.vo.Atndn;

/**
 * Servlet implementation class LctrAtndnServlet
 */
@WebServlet("/atnlist")
public class AtndnSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 41321332L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AtndnSelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String sid = request.getParameter("userid");
		ArrayList<Atndn> list = new AtndnService().selectLctrAtndn(sid);
		RequestDispatcher view = null;

		if(list.size() > 0) {
			view = request.getRequestDispatcher("/views/attendance/lctrAtndnView.jsp");
			request.setAttribute("list", list);
			view.forward(request, response);
			
		}else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "나의 강의목록 조회 실패");
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
