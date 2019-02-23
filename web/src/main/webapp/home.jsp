<%@ page import="services.BookService" %>
<%@ page import="dto.BookDto" %>
<%@ page import="java.util.List" %>
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
<br>
<%
    BookService bookService = new BookService();
    List<BookDto> bookDtos = bookService.showBooks();
%>
<div class="container">
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col"></th>
            <th scope="col">Title</th>
            <th scope="col">Name author</th>
            <th scope="col">ISBN</th>
            <th scope="col">Summary</th>
            <th scope="col">Borrowed</th>
        </tr>
        </thead>
        <tbody>

        <%
            for (int i = 0; i < bookDtos.size(); i++) {%>
        <tr>
            <th scope="row">
                <%=i+1%>
            </th>
            <td>
                <%=bookDtos.get(i).getAuthorName()%>
            </td>
            <td>
                <%=bookDtos.get(i).getAuthorName()%>
            </td>
            <td>
                <%=bookDtos.get(i).getIsbn()%>
            </td>
            <td>
                <%=bookDtos.get(i).getSummary()%>
            </td>
            <td>
                <div class="bootstrap-switch-square">
                    <input type="checkbox" data-toggle="switch" name="Borrowed" id="Borrowed"
                           value=<%=bookDtos.get(i).isBorrowed() %>/>
                </div>
            </td>
        </tr>
        <%
            }
        %>

        </tbody>
    </table>


</div>
<%@ include file="/WEB-INF/fragments/footer.jspf" %>
</body>
</html>