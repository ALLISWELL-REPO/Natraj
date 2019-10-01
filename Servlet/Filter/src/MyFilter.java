import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter{

	@Override
	public void init(FilterConfig arg0) throws ServletException {		
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		out.print("filter is invoked Before");
		chain.doFilter(request, response);//send request to the next filter
		out.print("filter is invoked after");		
	}	
	@Override
	public void destroy() {		
	}	
}
