<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<title>Using JSTL Functions</title>
</head>
<body>
<c:set var="string1" value="It is First String"/>
<c:set var="string2" value="It is <xyz>Second String.</xyz>"/>
<p>index-1:${fn:indexOf(string1,"First")}</p>
<p>index-2:${fn:indexOf(string2,"Second")}</p>
</body>
</html>