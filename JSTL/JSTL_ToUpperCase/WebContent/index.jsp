<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<title>Using JSTL Functions</title>
</head>
<body>
<c:set var="site" value="www.facebook.com"/>
<c:set var="author" value="Adib Khan"/>
Hi,This is ${fn:toUpperCase(site)} developed by ${fn:toUpperCase(author)}<br>

</body>
</html>