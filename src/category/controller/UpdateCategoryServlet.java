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

@WebServlet("/updateca")
public class UpdateCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UpdateCategoryServlet() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String newname = request.getParameter("newname");
		String catename = request.getParameter("catename");
		System.out.println("newname : "+ newname + " ,  catename : " + catename);
		
		int result = new CategoryService().updateCategory(catename, newname);
		PrintWriter out = response.getWriter();
		
		RequestDispatcher view = null;
		if(result >0) {
			 out.print("<script>");
			  out.print("alert('수정이 완료되었습니다.');");
			  out.print("location.href = 'selectca'");
			  out.print("</script>");
			  out.close();
		}else {
			 out.print("<script>");
			  out.print("alert('수정에 실패해였습니다.');");
			  out.print("location.href = 'selectca'");
			  out.print("</script>");
			  out.close();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
