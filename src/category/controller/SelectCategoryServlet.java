package category.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import category.model.service.CategoryService;
import category.model.vo.Category;

@WebServlet("/selectca")
public class SelectCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SelectCategoryServlet() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Category> list = new CategoryService().selectCategory();
		
		RequestDispatcher view = null;
		if(list !=null) {
			view = request.getRequestDispatcher("views/categoryTest/categoryManagementView.jsp");
			request.setAttribute("list", list);
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "계열 조회에 실패하였습니다.");
			view.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
