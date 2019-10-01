<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h3>Parsed Date:</h3>
<c:set var="date" value="15-08-1947"/>
<fmt:parseDate value="${date}" var="parsedDate" pattern="dd-MM-yyyy"/>
<p><c:out value="${parsedDate }"/></p>

</body>
</html>