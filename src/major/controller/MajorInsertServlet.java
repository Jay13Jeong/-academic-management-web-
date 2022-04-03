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
 * Servlet implementation class MajorInsertServlet
 */
@WebServlet("/minsert.ad")
public class MajorInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MajorInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* request.setCharacterEncoding("utf-8"); */
		Major major = new Major();
		
		major.setMajorno(request.getParameter("no"));
		major.setMajorname(request.getParameter("name"));
		major.setCapacity((Integer.parseInt(request.getParameter("capacity"))));
		major.setTuition((Integer.parseInt(request.getParameter("tuition"))));
		major.setCategoryname(request.getParameter("category"));

		
		
		
	
		
		//3. 서비스 객체 생성하고, 서비스 메소드를 이용해서 객체 전달하고
		//처리 결과받기
		int result = new MajorService().insertMajor(major);
		
		//4. 받은 결과에 따라 성공/실패 뷰 선택해서 내보내기
		if(result > 0) {
			response.sendRedirect("mlist.ad");
		}else {
			//response.sendRedirect("/test1/views/common/error.jsp");
			
			RequestDispatcher view = request
					.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "회원 가입 실패!");
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
