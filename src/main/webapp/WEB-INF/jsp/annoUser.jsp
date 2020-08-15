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
<h2>Announcement</h2>

<c:forEach items="${annos}" var="anno">
    <ul>
        <li>${anno.konu}</li>
        <li>${anno.icerik}</li>
        <li>${anno.gecerliliktarihi}</li>
        <li>${anno.photo}</li>

    </ul>
</c:forEach>

</body>
</html>