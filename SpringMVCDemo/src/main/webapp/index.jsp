<%--
  Created by IntelliJ IDEA.
  User: 19781
  Date: 2020/11/15
  Time: 13:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
login.jsp
<section class="loginCont"  style="text-align: center">
    <form class="loginForm" action="${pageContext.request.contextPath }/doLogin"  name="actionForm" id="actionForm"  method="post" >
        <div class="info">${error}</div>
        <div class="inputbox">
            <%--@declare id="user"--%><label for="user">用户名：</label>
            <input type="text" class="input-text" id="userCode" name="userCode" placeholder="请输入用户名" required/>
        </div>
        <div class="inputbox">
            <%--@declare id="mima"--%><label for="mima">密码：</label>
            <input type="password" id="userPassword" name="userPassword" placeholder="请输入密码" required/>
        </div>
        <div class="subBtn">
            <input type="submit" value="登录"/>
            <input type="reset" value="重置"/>
        </div>
    </form>
</section>

</body>
</html>