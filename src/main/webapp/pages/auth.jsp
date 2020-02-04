<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 21.01.2020
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authorization</title>
</head>
<body>
<s:form action="${pageContext.request.contextPath}/auth" modelAttribute="currentUser" method="post" >
        <p>
            ${message}
        </p>
    <table>
        <tr>
            <s:errors path="login"/>
            <p>
                    ${messageLogin}
            </p>
            <td>Login</td>
            <td><s:input type="text" path="login"/></td>
            <td><s:input type="hidden" value="22" path="age"/></td>
            <td><s:input type="hidden" value="Test" path="name"/></td>
        </tr>
        <tr>
            <s:errors path="password"/>
            <p>
                    ${messagePassword}
            </p>
            <td>Password</td>
            <td><s:input type="text" path="password"/></td>
        </tr>
    </table>
    <s:button>Submit</s:button>
</s:form>

<a href="${pageContext.request.contextPath}/reg"><button>Reg</button></a>
</body>
</html>