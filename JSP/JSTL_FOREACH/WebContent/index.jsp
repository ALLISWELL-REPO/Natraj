<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Core tag Example</title>
</head>
<body>
<c:forEach var="j" begin="1" end="5">
Item<c:out value="${j}"/><p>
</c:forEach>
</body>
</html>