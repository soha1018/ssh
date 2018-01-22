<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/20
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" id="hello" action="${pageContext.request.contextPath}/Hello_register">
    <input name="name" type="text">
    <input name="pwd" type="password">
    <input type="submit" value="注册">
</form>
</body>
</html>
