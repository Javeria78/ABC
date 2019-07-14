package filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class RegisterFilter
 */
@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, urlPatterns = { "/RegisterFilter" }, servletNames = { "Register" })
public class RegisterFilter implements Filter
{

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{

		String pwd=request.getParameter("pwd");
		String cpwd=request.getParameter("cpwd");
		if(pwd.equals(cpwd))
		{
		chain.doFilter(request, response);
	}
		else
		{
			((HttpServletResponse) response).sendRedirect("/MVC2/registerFailed");
		}
}
	
}
