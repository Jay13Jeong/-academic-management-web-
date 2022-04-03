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

@WebServlet("/updateab")
public class UpdateAbsenceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UpdateAbsenceServlet() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestid = request.getParameter("requestid");
		System.out.println("requestid"+requestid);
		String ab = requestid.substring(0, 1);
		AbsenceService aservice = new AbsenceService();
		Absence a = aservice.selectOneAbsence(requestid);

		PrintWriter out = response.getWriter();
		
		RequestDispatcher view = null;
		if (a.getApproval().equals("N")) {
			int result = aservice.updateYAbsence(requestid);
			if(result > 0) { //승인성공하면 학생테이블가서 휴학여부 바꾸어주고 휴학 카운트 +1

				int re = aservice.studentAbsenceChange(a.getStudentid());
				if(re > 0){
					if(ab.equals("a")) { // 휴학신청일때
						int r = aservice.studentCountPlus(a.getStudentid());
						if(r > 0) {
							 out.print("<script>");
							  out.print("alert('승인처리가  완료되었습니다.');");
							  out.print("location.href = 'selectaball'");
							  out.print("</script>");
							  out.close();
						}else {
							 out.print("<script>");
							  out.print("alert('학생정보 변경에 실패하였습니다.');");
							  out.print("location.href = 'selectaball'");
							  out.print("</script>");
							  out.close();
						}
					}else { //복학신청일때
						 out.print("<script>");
						  out.print("alert('승인처리가  완료되었습니다.');");
						  out.print("location.href = 'selectaball'");
						  out.print("</script>");
						  out.close();
					}
				}else {
					 out.print("<script>");
					  out.print("alert('학생정보 변경에 실패하였습니다.');");
					  out.print("location.href = 'selectaball'");
					  out.print("</script>");
					  out.close();

				}
			}else {
				 out.print("<script>");
				  out.print("alert('승인에 실패하였습니다.');");
				  out.print("location.href = 'selectaball'");
				  out.print("</script>");
				  out.close();

			}
		}else {	//approval이 Y면 되돌려보낸다
			 out.print("<script>");
			  out.print("alert('이미 승인 완료된 신청입니다.');");
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
