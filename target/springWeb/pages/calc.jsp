<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 21.01.2020
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/calc" method="post">
    <input type="text" name="num1">
    <input type="text" name="num2">
    <input type="text" name="action">
    <button type="submit">Submit</button>
</form>
<%!String a = "Hello";%>

Ваш результат <%=request.getAttribute("result")%>
<a href="${pageContext.request.contextPath}/main"><button>На главную</button></a>
</body>
</html>
