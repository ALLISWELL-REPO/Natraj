<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<title>SETBUNDLE Format Tag</title>
</head>
<body>
<fmt:setBundle basename="com.cts.Main" var="lang"/>
<fmt:message key="vegetable.Potato" bundle="${lang}"/><br/>
<fmt:message key="vegetable.Tomato" bundle="${lang}"/><br/>
<fmt:message key="vegetable.Carrot" bundle="${lang}"/><br/>
</body>
</html>