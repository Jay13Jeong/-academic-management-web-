package absence.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import absence.model.service.AbsenceService;
import absence.model.vo.Absence;

@WebServlet("/selectabSearch")
public class SelectAdminSearchSerlvet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SelectAdminSearchSerlvet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("studentid");
		
		ArrayList<Absence> list = new AbsenceService().selectPrivateAbsence(id);
		
		PrintWriter out = response.getWriter(); 
		
		if(list != null) {
			RequestDispatcher view = request.getRequestDispatcher("views/absence/absenceManagementView.jsp");
			request.setAttribute("list", list);
			view.forward(request, response);
			
		}else {
			 out.print("<script>");
			  out.print("alert('입력하신 학번으로 신청된 내역이 없습니다.');");
			  out.print("location.href = 'selectaball'");
			  out.print("</script>");
			  out.close();

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
