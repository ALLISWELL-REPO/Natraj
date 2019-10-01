package com.cts;

import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTagHandler extends TagSupport {
	
	public int doStartTag() throws JspException{
		JspWriter out=pageContext.getOut();//returns the instance of jspwriter
		try{
			out.print(Calendar.getInstance().getTime());//printing the date and time using jspWriter
		}catch(Exception e){
			System.out.println(e);
		}
		return SKIP_BODY;//willnot evaluate the body content of the tag		
	}
}
