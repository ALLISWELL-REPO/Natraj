<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Core Tag Example</title>
</head>
<body>
<c:url value="/index.jsp" var="completeURL">
<c:param name="trackingId" value="786"/>
<c:param name="user" value="ADIB"/>
</c:url>
${completeURL}
</body>
</html>