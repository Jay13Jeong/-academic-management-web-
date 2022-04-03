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

@WebServlet("/deleteab")
public class DeleteAbsenceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteAbsenceServlet() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestid = request.getParameter("requestid");
		String ab = requestid.substring(0, 1);
		
		System.out.println("requestid : " + requestid);
		
		AbsenceService aservice = new AbsenceService();
		Absence a = aservice.selectOneAbsence(requestid);
		
		 PrintWriter out  = response.getWriter();
		RequestDispatcher view = null;
		
		float date = aservice.canceldateChk(requestid);
		if(date > 0) {
			String approval = aservice.selectApprovalChk(requestid);
			if(approval.equals("Y")){//승인완료, 학생테이블가서 바꿔줘야함
				int result = aservice.deleteAbsence(requestid);
				if(result > 0) { // 휴학 취소되면 학생테이블 가서 변경
					int re = aservice.studentAbsenceChange(a.getStudentid());
					if(re > 0) {
						if(ab.equals("a")) {
							int r = aservice.studentCountMinus(a.getStudentid());
							if(r > 0) {
								
								 out.print("<script>");
								  out.print("alert('휴학신청취소가 완료되었습니다.');");
								  out.print("location.href = 'selectab?studentid="+a.getStudentid()+"'");
								  out.print("</script>");
								  out.close();

							}else {
								 out.print("<script>");
								  out.print("alert('학생정보 변경에 실패하였습니다.');");
								  out.print("location.href = 'selectab?studentid="+a.getStudentid()+"'");
								  out.print("</script>");
								  out.close();
							}
						}else {
							 out.print("<script>");
							  out.print("alert('복학신청취소가 완료되었습니다.');");
							  out.print("location.href = 'selectab?studentid="+a.getStudentid()+"'");
							  out.print("</script>");
							  out.close();
						}
					}else {
						 out.print("<script>");
						  out.print("alert('학생정보 변경에 실패하였습니다.');");
						  out.print("location.href = 'selectab?studentid="+a.getStudentid()+"'");
						  out.print("</script>");
						  out.close();
					}
				}else {
					 out.print("<script>");
					  out.print("alert('휴학신청취소에 실패하였습니다.');");
					  out.print("location.href = 'selectab?studentid="+a.getStudentid()+"'");
					  out.print("</script>");
					  out.close();

				}
			}else{ // 승인안된상황 
				int result = aservice.deleteAbsence(requestid);
				if(result > 0){
					 out.print("<script>");
					  out.print("alert('신청취소가 완료되었습니다.');");
					  out.print("location.href = 'selectab?studentid="+a.getStudentid()+"'");
					  out.print("</script>");
					  out.close();
				}else {
					 out.print("<script>");
					  out.print("alert('휴학신청취소에 실패하였습니다.');");
					  out.print("location.href = 'selectab?studentid="+a.getStudentid()+"'");
					  out.print("</script>");
					  out.close();
				}
			}
		}else {//취소날짜가 지났음
			 out.print("<script>");
			  out.print("alert('취소가능한 날짜가 지났습니다');");
			  out.print("location.href = 'selectab?studentid="+a.getStudentid()+"'");
			  out.print("</script>");
			  out.close();

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
