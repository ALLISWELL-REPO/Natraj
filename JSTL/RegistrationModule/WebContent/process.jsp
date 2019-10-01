<%@page import="com.cts.beans.RegisterDao"  %>
<jsp:useBean id="obj" class="com.cts.beans.User"/>
<jsp:setProperty property="*" name="obj"/>
<%
int status=RegisterDao.register(obj);
if(status>0){
	out.print("you are successfully registered");
}
%>