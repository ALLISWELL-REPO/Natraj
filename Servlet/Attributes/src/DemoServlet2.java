

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DemoServlet2() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			ServletContext context = getServletContext();
			String n = (String) context.getAttribute("company");
			out.println("welcome to " + n);
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
