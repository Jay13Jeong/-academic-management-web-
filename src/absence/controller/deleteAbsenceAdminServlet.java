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
import absence.model.vo.Absence;

@WebServlet("/deleteabad")
public class deleteAbsenceAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public deleteAbsenceAdminServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestid = request.getParameter("requestid");
		AbsenceService aservice = new AbsenceService();
		Absence a = aservice.selectOneAbsence(requestid);
		String ab = requestid.substring(0, 1);

		PrintWriter out = response.getWriter();
		
		RequestDispatcher view = null;

		if (a.getApproval().equals("Y")) {// 승인완료, 학생테이블가서 바꿔줘야함
			int result = aservice.deleteAbsence(requestid);
			if (result > 0) { // 휴학 취소되면 학생테이블 가서 변경
				int re = aservice.studentAbsenceChange(a.getStudentid());
				if (re > 0) {
					if (ab.equals("a")) {
						int r = aservice.studentCountMinus(a.getStudentid());
						if (r > 0) {
							
							 out.print("<script>");
							  out.print("alert('삭제가 완료되었습니다.');");
							  out.print("location.href = 'selectaball'");
							  out.print("</script>");
							  out.close();
						} else {
							
							 out.print("<script>");
							  out.print("alert('학생정보 변경에 실패하였습니다.');");
							  out.print("location.href = 'selectaball'");
							  out.print("</script>");
							  out.close();
						}
					} else {
						 out.print("<script>");
						  out.print("alert('삭제가 완료되었습니다.');");
						  out.print("location.href = 'selectaball'");
						  out.print("</script>");
						  out.close();
					}
				} else {
					 out.print("<script>");
					  out.print("alert('학생정보 변경에 실패하였습니다.');");
					  out.print("location.href = 'selectaball'");
					  out.print("</script>");
					  out.close();
				}
			} else {
				 out.print("<script>");
				  out.print("alert('학생정보 변경에 실패하였습니다.');");
				  out.print("location.href = 'selectaball'");
				  out.print("</script>");
				  out.close();
			}
		}else {//승인이 안됬으면 그냥 삭제만 진행
			int result = aservice.deleteAbsence(requestid);
			if (result > 0) {
				 out.print("<script>");
				  out.print("alert('삭제가 완료되었습니다.');");
				  out.print("location.href = 'selectaball'");
				  out.print("</script>");
				  out.close();
			} else {
				 out.print("<script>");
				  out.print("alert('신청정보 삭제에 실패하였습니다.');");
				  out.print("location.href = 'selectaball'");
				  out.print("</script>");
				  out.close();
			}
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
