<%@page import="java.io.FileInputStream"%>
<%
String filename="home.jsp";
String filepath="E:\\";
response.setContentType("APPLICATION/OCTET-STREAM");
response.setHeader("Content-Disposition","attachment;filename=\""+filename+"\"");
FileInputStream fis=new FileInputStream(filepath+filename);

int i;
while((i=fis.read())!=-1){
	out.write(i);
}
fis.close();
%>