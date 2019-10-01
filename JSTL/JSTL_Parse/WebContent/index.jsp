<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<html>
<head>
<title>Parse tag</title>
</head>
<body>
<h2>Books info:</h2>

<c:import var="bookInfo" url="novels.xml"/>
<x:parse xml="${bookInfo}" var="output"/>
<p>First Book Title:<c:out value="$output/books/book[1]/name"/></p>
<p>First Book Price:<c:out value="$output/books/book[1]/price"/></p>
<p>Second Book Title:<c:out value="$output/books/book[2]/name"/></p>
<p>First Book price:<c:out value="$output/books/book[2]/price"/></p>				
</body>
</html>