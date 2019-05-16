<%--
  Created by IntelliJ IDEA.
  User: A
  Date: 2019/5/15
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/dateParse" method="post">
    请输入生日<input type="text" name="birthday" ><br>
    请输入您的名字<input type="text" name="username"> <br>
    <input type="submit" value="提交吧，亲"><br>
</form>
------------------------------------------------------
<form action="/register" enctype="multipart/form-data" method="post">
    注册邮箱<input type="text" name="mail"><br>
    创建密码<input type="password" name="password"><br>
    真实姓名<input type="text" name="username"><br>
    性别<br>
    男<input type="radio" name="gender" value="male" >
    女<input type="radio" name="gender" value="female"><br>
    爱好<br>
    篮球<input type="checkbox" name="hobbies" value="basketball">
    足球<input type="checkbox" name="hobbies" value="soccer">
    跑步<input type="checkbox" name="hobbies" value="running">
    生日<input type="text" name="birthday"><br>
    头像<input type="file" name="headfile"><br>
    <input type="submit" value="提交吧，亲"><br>
</form>
</body>
</html>
