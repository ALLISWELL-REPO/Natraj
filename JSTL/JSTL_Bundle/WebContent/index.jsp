<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<title>Format Bundle Tag</title>
</head>
<body>
<fmt:bundle basename="com.cts.Simple" prefix="colour.">
<fmt:message key="Violet"/><br/>
<fmt:message key="Indigo"/><br/>
<fmt:message key="Blue"/><br/>
</fmt:bundle>

</body>
</html>