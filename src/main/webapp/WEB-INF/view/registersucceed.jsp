<%--
  Created by IntelliJ IDEA.
  User: A
  Date: 2019/5/7
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
注册成功
邮箱${user.mail}<br>
密码${user.password}<br>
真实姓名${user.username}<br>
性别${user.gender}<br>
爱好${user.hobbies}<br>
生日${user.birthday}
头像<a src="${user.headImgUrl}"></a>
</body>
</html>
