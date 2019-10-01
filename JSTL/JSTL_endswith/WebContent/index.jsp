<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<title>Using JSTL functions</title>
</head>
<body>
<c:set var="String" value="welcome to cognizant technology solutions"/>
<c:if test="${fn:endsWith(String,'solutions')}">
<p>String ends with solutions</p>
</c:if>
<c:if test="${fn:endsWith(String,'technology')}">
<p>String ends with technology</p>
</c:if>


</body>
</html>