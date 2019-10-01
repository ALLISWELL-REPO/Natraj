package com.cts;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class PrintDate extends TagSupport{
	public int doStartTag() throws JspException{
		JspWriter out=pageContext.getOut();
		try{
			out.print(java.util.Calendar.getInstance().getTime());
		}catch(Exception e){
			System.out.println(e);
		}
		return SKIP_BODY;		
	}
}
