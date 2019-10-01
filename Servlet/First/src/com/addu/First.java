package com.addu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class First implements Servlet {
	ServletConfig config=null;
	
	@Override
	public void init(ServletConfig config) {
		this.config=config;
		System.out.println("Servlet is initailized");
		}
	@Override
	public void service(ServletRequest request,ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("<b>hello simple servlet</b>");
		out.print("</body></html>");		
	}
	@Override
	public void destroy() {
		System.out.println("servlet is destroyed");		
	}

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public String getServletInfo() {
		return "copyright 2007-2010";
	}	
}
