import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {
	@Override
	public void init(FilterConfig arg0) throws ServletException {		
	}	

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		String password=request.getParameter("password");
		if(password.equals("admin")){
			chain.doFilter(request, response);
		}else{
			out.print("username or password error");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}		
	}	
	@Override
	public void destroy() {		
	}
}
