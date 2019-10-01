<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<title>Using JSTL functions</title>
</head>
<body>
<c:set var="String" value="welcome to cognizant"/>
<c:if test="${fn:contains(String,'cognizant')}">
<p>Found cognizant String</p>
</c:if>
<c:if test="${fn:contains(String,'COGNIZANT')}">
<p>found COGNIZANT String</p>
</c:if>

</body>
</html>