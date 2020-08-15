<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <h2 class="hello-title">Admin News Page</h2>
</head>
<body>
<div style="display: inline-block">
    <h3>News Entry</h3>

    <form:form method="POST"
               action="/admin/news" modelAttribute="news">
        <table>
            <tr>
                <td><form:label path="konu">Konu</form:label></td>
                <td><form:input path="konu"/></td>
            </tr>
            <tr>
                <td><form:label path="gecerliliktarihi">Gecerlilik Tarihi</form:label></td>
                <td><form:input path="gecerliliktarihi"/></td>
            </tr>
            <tr>
                <td><form:label path="icerik">
                    Icerik</form:label></td>
                <td><form:input path="icerik"/></td>
            </tr>
            <tr>
                <td><form:label path="haberlinki">
                    Haber Linki</form:label></td>
                <td><form:input path="haberlinki"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
    </form:form>

    DELETE (by id)

    <form:form method="POST"
               action="/admin/news/delete">
        <table>
            <tr>
                <td></td>
                <input id="id" name="id" value="${id}"/>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
    </form:form>
    UPDATE
    <form:form method="POST"
               action="/admin/news/update" modelAttribute="news">
        <table>
            <tr>
                <td><form:label path="konu">ID</form:label></td>
                <td><input id="idx" name="id" value="${id}"/></td>
            </tr>

            <tr>
                <td><form:label path="konu">Konu</form:label></td>
                <td><input id="konu" name="konu" value="${konu}"/></td>
            </tr>

            <tr>
                <td><form:label path="Icerik">Icerik</form:label></td>
                <td><input id="icerik" name="icerik" value="${icerik}"/></td>
            </tr>

            <tr>
                <td><form:label path="konu">Link</form:label></td>
                <td><input id="haberlinki" name="haberlinki" value="${haberlinki}"/></td>
            </tr>

            <tr>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
    </form:form>
</div>
<div style="display: inline-block">
    News(ids)
    <c:forEach items="${newsss}" var="newsx">
        <ul>
            <li>${newsx.id}</li>
        </ul>
    </c:forEach>

</div>

</div>


</body>
</html>