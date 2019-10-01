<h1>First JSP</h1>
<%
Cookie ck=new Cookie("name","adib");
response.addCookie(ck);
%>
<a href="process.jsp">click</a>