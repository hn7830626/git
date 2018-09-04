<%--
  Created by IntelliJ IDEA.
  User: 光着脚吖子。
  Date: 2018/8/18
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="user/hello.do">springMVC请求</a>
<form action="user/body.do" method="post">
   姓名: <input type="text" name="name">
   城市 : <input type="text" name="city">
    <input type="submit">
</form>
</body>
</html>
