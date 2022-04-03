package common.filter;
 
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import common.wrapper.CryptoPasswordWrapper;

/**
 * Servlet Filter implementation class CryptoPasswordFilter
 */
@WebFilter("*.cp")
public class CryptoPasswordFilter implements Filter, java.io.Serializable{
	private final static long serialVersionUID = 354425433;
    /**
     * Default constructor. 
     */
    public CryptoPasswordFilter() {
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
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("CryptoPasswordFilter 의 do Filter() run......");

		//필터는 request에 저장된 데이터 값의 변경을 할 수 없다. 
		//전송값에 가공처리를 해야한다면 래퍼클래스 (wrapper)클래스를 사용함
		//필터 쪽에서 래퍼로 가공할 값을 보내고 래퍼는 가공처리한 결과값을 다시 필터로 리턴하면 필터가 받아서 서블릿으로 넘김
		//뷰 ---> 필터 --> 래퍼 --> 필터 --> 서블릿 

		HttpServletRequest hrequest = (HttpServletRequest)request;
		//필터가 래퍼를 실행함
		System.out.println(hrequest);
	
		CryptoPasswordWrapper cpwrapper = new CryptoPasswordWrapper(hrequest);
		System.out.println(cpwrapper);
		
		//wrapper 처리한 결과를 필터가 받아서 서블릿으로 넘김
		//wrapper는 왜필요? 
		// pass the request along the filter chain
		//chain.doFilter(request, response);
		chain.doFilter(cpwrapper, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
