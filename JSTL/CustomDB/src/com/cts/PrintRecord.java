package com.cts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class PrintRecord extends TagSupport {
	private String id;
	private String table;

	public void setId(String id) {
		this.id = id;
	}

	public void setTable(String table) {
		this.table = table;
	}

	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
			PreparedStatement ps = con.prepareStatement("select * from Student");
			ps.setInt(1, Integer.parseInt(id));
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				ResultSetMetaData rsmd = rs.getMetaData();
				int totalcols = rsmd.getColumnCount();
				// column name
				out.write("<table border='1'>");
				out.write("<tr>");
				if (rs.next()) {
					// column value
					for (int i = 1; i <= totalcols; i++) {
						out.write("<td>" + rs.getString(i) + "</td>");
					}
					out.write("</tr>");
				} else {
					out.write("Table or Id doesn't exist");
				}
				out.write("</table>");
				con.close();
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return SKIP_BODY;
	}
}
