<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<title>Using JSTL functions</title>
</head>
<body>
<c:set var="string" value="Adib Khan"/>
${fn:substringAfter(string,"Adib") }

</body>
</html>