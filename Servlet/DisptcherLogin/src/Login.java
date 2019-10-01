
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String n = request.getParameter("userName");
		String p = request.getParameter("userPass");

		if (p.equals("Servlet")) {
			RequestDispatcher rd = request.getRequestDispatcher("servlet2");
			rd.forward(request, response);
		} else {
			out.print("Sorry UserName and PassWord Error");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
	}
}
