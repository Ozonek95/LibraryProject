<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Super Side!</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.0.0-2/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="/WEB-INF/fragments/header.jspf"/>
<div class="container mt-5">
    <div class="alert alert-success" role="alert">
        <strong>Well done!</strong> You successfully read this important alert message.
    </div>
</div>
<%@ include file="/WEB-INF/fragments/footer.jspf" %>
<script src="webjars/bootstrap/4.0.0-2/js/bootstrap.js"></script>
</body>
</html>