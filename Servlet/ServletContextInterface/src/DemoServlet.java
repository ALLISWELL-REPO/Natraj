 

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DemoServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		//creating servlet object
		ServletContext context=getServletContext();
		
		//getting the value of initialization parameter and printing it.
		String driverName=context.getInitParameter("dname");
		pw.println("driver name is= "+driverName);
		pw.close();
	}

}
