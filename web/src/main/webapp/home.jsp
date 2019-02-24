<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.2.1/css/bootstrap.min.css">
    <meta charset="UTF-8">
</head>
<body>
<jsp:include page="/WEB-INF/fragments/header.jspf"/>
<br>
<br>
<c:set var="books" value="${requestScope.books}" />
<div class="container">
    <form action="/DecisionServlet" method="post">
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
                <%--<c:if test="${!book.borrowed}">--%>
                    <%--<div class="bootstrap-switch-square">--%>
                        <%--<button type="button" class="btn btn-success" title="Book status">--%>
                               <%--free--%>
                        <%--</button>--%>
                    <%--</div>--%>
                <%--</c:if>--%>
                <%--<c:if test="${book.borrowed}">--%>
                    <%--<div class="bootstrap-switch-square">--%>
                        <%--<button type="button" class="btn btn-danger" title="Book status">--%>
                            <%--borrowed--%>
                        <%--</button>--%>
                    <%--</div>--%>
                <%--</c:if>--%>
                    <c:choose>
                    <c:when test="${!book.borrowed}">
                        <div class="bootstrap-switch-square">
                            <button type="button" class="btn btn-success" title="Book status">
                                available
                            </button>
                        </div>
                    </c:when>
                    <c:otherwise>
                        <div class="bootstrap-switch-square">
                            <button type="button" class="btn btn-danger" title="Book status">
                                borrowed
                            </button>
                        </div>
                    </c:otherwise>
                    </c:choose>
                </td>
                <td><label>
                    <input type="radio" name="radio" value="+${book.id}">
                </label></td>
            </tr>

            <c:set var="index" value="${index+1}"/>
        </c:forEach>


    </table>
    <div class="container-fluid">
        <a href="add.jsp" class="btn btn-warning">Add</a>
        <button type="submit" class="btn btn-warning" name="option" value="DELETE">Delete</button>
        <button type="submit" class="btn btn-warning" name="option" value="BORROW">Borrow</button>
        <button type="submit" class="btn btn-warning" name="option" value="GIVE_BACK">Give back</button>
    </div>
    </form>
</div>
<%@ include file="/WEB-INF/fragments/footer.jspf" %>
</body>
</html>