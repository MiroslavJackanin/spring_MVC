<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Home</title>
    </head>
    <body>
        <h2>${message}</h2>
        <br>
        <br>
        <a href="${pageContext.request.contextPath}/form/showForm">Show form</a>
        <br>
        <br>
        <a href="${pageContext.request.contextPath}/student/showForm">Student form</a>
        <br>
        <br>
        <a href="${pageContext.request.contextPath}/customer/showForm">Customer form</a>
    </body>
</html>
