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
<div class="col-md-12">
    <div class="col-md-6" style="display: inline-block">
        <h3>News Entry</h3>

        <form:form method="POST"
                   action="/admin/anno" modelAttribute="anno">
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
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>

        DELETE (by id)

        <form:form method="POST"
                   action="/admin/anno/delete">
            <table>
                <tr>
                    <input id="id" name="id" value="${id}"/>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
        UPDATE
        <form:form method="POST"
                   action="/admin/anno/update" modelAttribute="anno">
            <table>
                <tr>
                    <input id="idx" name="id" value="${id}"/>
                </tr>
                <tr>
                    <input id="konu" name="konu" value="${konu}"/>

                </tr>
                <tr>
                    <input id="icerik" name="icerik" value="${icerik}"/>

                </tr>

                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </div>
    <div class="col-md-6" style="display: inline-block">
    Annos (ids)
        <c:forEach items="${annoss}" var="annosx">
            <ul>
                <li>${annosx.id}</li>
            </ul>
        </c:forEach>

    </div>

</div>


</body>
</html>