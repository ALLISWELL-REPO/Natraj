<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<c:set var="url" value="2" scope="request"/>
<c:if test="${url<1}">
<c:redirect url="http://javatpoint.com"/>
</c:if>
<c:if test="${url>1}">
<c:redirect url="https://www.facebook.com"/>
</c:if>
</body>
</html>