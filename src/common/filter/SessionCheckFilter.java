package common.filter;
 
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import student.model.vo.Member;

/**
 * Servlet Filter implementation class SessionCheckFilter
 */
@WebFilter("*.ss")
public class SessionCheckFilter implements Filter, java.io.Serializable{
	private final static long serialVersionUID = 354999433;
	/**
	 * Default constructor.
	 */
	public SessionCheckFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("SessionCheckfilter doFilter() run.....");
		// 로그인 상태를 확인함
		// 로그인 하지 않았다면 error.jsp 내보냄
		// 로그인 한 상태면 요청한 서블릿으로 넘어감

		HttpServletRequest hrequest = (HttpServletRequest)request;
		Member loginMember = (Member)hrequest.getSession(false).getAttribute("loginMember");
		// 세션객체를 꺼내서 그 안에 저장된 getAttribute 를 가져옴
		if (loginMember == null) {
			RequestDispatcher view = hrequest.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "필터 : 로그인해야 이용할 수 있습니다.");
			view.forward(hrequest, response);

		} else {
			// 요청한 서블리으로 넘ㄱㄱ로그인하면 얘가 실행
			chain.doFilter(request, response);

		}

		

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
