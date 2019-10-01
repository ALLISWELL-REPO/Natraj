<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<title>Using JStl functions</title>
</head>
<body>
<c:set var="string1" value="hi Adib Khan"/>
<c:set var="string2" value="Welcome to cognizant technology solutions"/>
Length of the String-1 is:${fn:length(string1) }<br>
Length of the String-2 is:${fn:length(string2) }


</body>
</html>