<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<title>Using JSTL functions</title>
</head>
<body>
<c:set var="String" value="welcome to cognizant"/>
<c:if test="${fn:containsIgnoreCase(String,'cognizant')}">
<p>Found cognizant String 
</c:if>
<c:if test="${fn:containsIgnoreCase(String, 'COGNIZANT')}">  
   <p>Found COGNIZANT string<p>  
</c:if>  
</body>
</html>