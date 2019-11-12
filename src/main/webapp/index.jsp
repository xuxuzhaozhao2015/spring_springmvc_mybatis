<%--
  Created by IntelliJ IDEA.
  User: 徐程意
  Date: 2019/11/11
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<h1>
    <a href="/account/findall">测试</a><br>
</h1>
<form action="/account/save2" method="post">
    name: <input name="name" type="text"/><br/>
    money:<input name="money" type="text"><br/>
    <input type="submit" value="submit"/>
</form>
</body>
</html>
