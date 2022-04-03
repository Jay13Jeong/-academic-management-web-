package lecture.controller;
//수강과목추가버튼누르면.jsp
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lecture.model.service.LectureService;
import lecture.model.vo.Lecture;

/**
 * Servlet implementation class lectureAddServlet
 */
@WebServlet("/addlecture")
public class lectureAddServlet extends HttpServlet {
	private static final long serialVersionUID = 312132312123L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public lectureAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		int roommax = Integer.parseInt(request.getParameter("roommax"));//정원
		String lecture = request.getParameter("lecture");//강의
		
		String result = new LectureService().createRoom(lecture,roommax);//강의개설버튼
		
		ArrayList<Lecture> list = new LectureService().selectAllPlan();//과목선택리스트불러오기
		ArrayList<Lecture> list2 = new LectureService().selectOpenedLectures();//개설된 강의목록 불러오기
		request.setAttribute("list", list);
		request.setAttribute("list2", list2);
		
		RequestDispatcher view = null;
		if(result.equals(lecture)) {
			view = request.getRequestDispatcher("/views/lecture/addlecture.jsp");
			request.setAttribute("result", "ok");
			view.forward(request, response);
		}else if(result.equals("already")){
			view = request.getRequestDispatcher("/views/lecture/addlecture.jsp");
			request.setAttribute("result", "already");
			view.forward(request, response);
		}else{
			view = request.getRequestDispatcher("/views/lecture/addlecture.jsp");
			request.setAttribute("result", "no");
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
