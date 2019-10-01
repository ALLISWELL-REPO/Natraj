<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<title>Using JSTL functions</title>
</head>
<body>
<c:set var="string1" value="it is first company."/>
<c:set var="string2" value="it is<cts>second String.</cts>"></c:set>
<p>with escapeXMl() function:</p>
<p>string-1:${fn:escapeXml(string1)}</p>
<p>string-2:${fn:escapeXml(string2)}</p>

<p>Without escpeXml() functions:</p>
<p>string-1:${string1}</p>
<p>string-2:${string2}</p>
</body>
</html>