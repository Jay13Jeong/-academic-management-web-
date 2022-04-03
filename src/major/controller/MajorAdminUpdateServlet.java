package major.controller;


import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import major.model.service.MajorService;
import major.model.vo.Major;



/**
 * Servlet implementation class MajorAdminUpdateServlet
 */
@WebServlet("/majorupdate.ad1")
public class MajorAdminUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MajorAdminUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = null;
       
		Major major = new Major();
        
		major.setMajorno(request.getParameter("majorno"));
        major.setMajorname(request.getParameter("majorname"));
        major.setCapacity(Integer.parseInt((request.getParameter("capacity"))));
        major.setTuition(Integer.parseInt((request.getParameter("tuition"))));
        major.setCategoryname(request.getParameter("categoryname"));
      
        int result = new MajorService().updateMajor(major);
        
        //8. 받은 결과로 성공/실패 페이지 내보내기
        if(result > 0) { //성공하면 목록으로 갈것다
           //서블릿이 서블릿 호출할때 문법
           response.sendRedirect("mlist.ad");
           System.out.println("보냄 !!!!!!!!!");
           
        }else {
           view = request.getRequestDispatcher("views/common/error.jsp");
           request.setAttribute("message", major.getMajorno() + "번 수정 실패");
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
