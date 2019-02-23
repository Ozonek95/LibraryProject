<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.2.1/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="/WEB-INF/fragments/header.jspf"/>
<br>
<br>
<c:set var="books" value="${requestScope.books}" />
<div class="container">
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col"></th>
            <th scope="col">Title</th>
            <th scope="col">Author name</th>
            <th scope="col">ISBN</th>
            <th scope="col">Summary</th>
            <th scope="col">Borrowed</th>
        </tr>
        </thead>

        <c:set var ="index" value = "${1}"/>

        <c:forEach var="book" items="${books}">

            <tr>
                <td>${index}</td>
                <td>${book.title}</td>
                <td>${book.authorName}</td>
                <td>${book.isbn}</td>
                <td>${book.summary}</td>
                <td>
                <c:if test="${!book.borrowed}">
                    <div class="bootstrap-switch-square">
                        <button type="button" class="btn btn-success" title="Book status">
                               free
                        </button>
                    </div>
                </c:if>
                <c:if test="${book.borrowed}">
                    <div class="bootstrap-switch-square">
                        <button type="button" class="btn btn-danger" title="Book status">
                            borrowed
                        </button>
                    </div>
                </c:if>
                </td>
                <td><label>

                    <input type="radio" name="checked" value="+${index}">
                </label></td>
            </tr>

            <c:set var="index" value="${index+1}"/>
        </c:forEach>


    </table>
    <div class="container-fluid">
        <a href="WEB-INF/fragments/add.jsp" class="btn btn-warning">Add</a></li>
        <a href="about.jspf" class="btn btn-warning">Delete</a></li>
        <a href="about.jspf" class="btn btn-warning">Update</a></li>
    </div>

</div>
<%@ include file="/WEB-INF/fragments/footer.jspf" %>
</body>
</html>