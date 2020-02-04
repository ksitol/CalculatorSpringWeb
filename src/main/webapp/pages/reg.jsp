<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 07.01.2020
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h3>Registration</h3>
<s:form action="${pageContext.request.contextPath}/reg" modelAttribute="newUser" method="post" >
<table>
        <s:errors path="name"/>
        <tr>
            <td>Name</td>
            <td><s:input type="text" path="name" name="name"/></td>
        </tr>
        <tr>
            <td>Login</td>
            <td><s:input type="text" path="login" name="login"/></td>
        </tr>
            <s:errors path="age"/>
        <tr>
            <td>Age</td>
            <td><s:input type="text" path="age" name="age"/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><s:input type="text" path="password" name="pass"/></td>
        </tr>
    </table>
    <s:button>Reg</s:button>
</s:form>
</body>
</html>
