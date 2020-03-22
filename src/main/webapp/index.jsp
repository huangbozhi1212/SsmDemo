<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="account/findAll">测试</a>
<h3>测试保存</h3>
<form action="account/save" method="post">
    <input type="text" name="name"/><br />
    <input type="text" name="money"/><br />
    <input type="submit" value="保存"/>
</form>
</body>
</html>
