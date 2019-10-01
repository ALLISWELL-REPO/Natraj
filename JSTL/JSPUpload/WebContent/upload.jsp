<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%
MultipartRequest m=new MultipartRequest(request,"D:/");
out.print("Successfully uploaded");
%>