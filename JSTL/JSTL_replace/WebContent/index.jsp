<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<title>Using JSTL Functions</title>
</head>
<body>
<c:set var="author" value="Adib Khan"/>
<c:set var="string" value="Hum Aapke Hain Kaun"/>
${fn:replace(author,"Adib","Addu")}<br>
${fn:replace(string,"Kaun","Lover")}

</body>
</html>