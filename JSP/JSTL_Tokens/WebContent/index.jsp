<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Core Tag Example</title>
</head>
<body>
<c:forTokens items="ASAD,ADIB,SHADAB,SHAHANAWAZ" delims="," var="name">
<c:out value="${name}"/><p>
</c:forTokens>
</body>
</html>