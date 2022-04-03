package category.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import category.model.service.CategoryService;

@WebServlet("/deleteca")
public class DeleteCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteCategoryServlet() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String catename = request.getParameter("catename");
		
		int result = new CategoryService().deleteCategory(catename);
		
		PrintWriter out = response.getWriter();
		RequestDispatcher view = null;
		if(result >0) {
			 out.print("<script>");
			  out.print("alert('삭제가 완료되었습니다.');");
			  out.print("location.href = 'selectca'");
			  out.print("</script>");
			  out.close();
		}else {
			 out.print("<script>");
			  out.print("alert('삭제에 실패하였습니다.');");
			  out.print("location.href = 'selectca'");
			  out.print("</script>");
			  out.close();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
