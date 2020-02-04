<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main</title>
</head>
<body>
${sessionScope.currentUser}


<s:form action="${pageContext.request.contextPath}/main" method="post">
        <p>
            ${message}
        </p>
</s:form>
<a href="${pageContext.request.contextPath}/calc"><button>К вычислениям</button></a>
</body>
</html>
