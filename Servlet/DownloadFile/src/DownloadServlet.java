
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DownloadServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		    response.setContentType("text/html");
		    PrintWriter out=response.getWriter();
		    String filename="home.jsp";
		    String filepath="E:\\";
		    response.setContentType("APPLICATION/OCTET_STREAM");
		    response.setHeader("Content-Dispositon","attachment;filename=\""+filename+"\"");
		    FileInputStream fis=new FileInputStream(filepath +filename);
		    int i;
		    while((i=fis.read())!=-1){
		    	out.write(i);
		    }
		    fis.close();
		    out.close();
	}
}
