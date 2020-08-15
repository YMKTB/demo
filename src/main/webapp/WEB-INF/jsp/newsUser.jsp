<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Anno Page</title>
</head>
<body>
<h2>News</h2>

<c:forEach items="${news}" var="news">
    <ul>
        <li>${news.konu}</li>
        <li>${news.icerik}</li>
        <li>${news.gecerliliktarihi}</li>
        <li>${news.haberlinki}</li>


    </ul>
</c:forEach>

</body>
</html>