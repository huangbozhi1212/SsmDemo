<%--
  Created by IntelliJ IDEA.
  User: 努力学习努力减肥
  Date: 2020/3/22
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>hello SSM</h1>
<c:forEach items="${list}" var="account">
    ${account.name}
</c:forEach>
</body>
</html>
