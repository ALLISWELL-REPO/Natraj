<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<head>
<title>Using JSTL functions</title>
</head>
<body>
<c:set var="str1" value="welcome to cognizant technology solutions      "/>
<p>String-1 length is:${fn:length(str1)}</p>

<c:set var="str2" value="${fn:trim(str1)}"/>
<p>String-2 length is:${fn:length(str2)}</p>
 <p>Final Value of String is:${str2}</p>
</body>
</html>