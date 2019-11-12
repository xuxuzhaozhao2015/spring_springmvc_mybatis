<%--
  Created by IntelliJ IDEA.
  User: 徐程意
  Date: 2019/11/11
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<h1>SUCCESS</h1>
<c:forEach items="${list}" var="account">
    ${account.name}
</c:forEach>
</body>
</html>
