<%--
  Created by IntelliJ IDEA.
  User: wisn
  Date: 2018/1/12
  Time: 上午10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
hello
<form action="../mvc/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file"><br>
    <input type="submit" value="submit">
</form>



<form action="../restful/user/1" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="text" name="data"><br>
    <input type="submit" value="put">
</form>

<form action="../restful/user/1" method="post">
    <input type="text" name="data"><br>
    <input type="submit" value="post">
</form>

<form action="../restful/user/1" method="get">
    <input type="text" name="data"><br>
    <input type="submit" value="get">
</form>

<form action="../restful/user/1" method="post">
    <input type="text" name="data"><br>
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="delete">
</form>
</body>
</html>
