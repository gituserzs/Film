<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<div style="border: 1px solid ;border-radius: 5px;width: 300px;margin: 100px auto">
    <form action="/login" method="post" style="margin: 0px auto;" onsubmit="return check()">
        <table style="margin: 0px auto">
            <tr><th colspan="2" style="text-align: center"> 登录</th></tr>
            <tr><td>用户名：</td><td><input type="text" name="userName"/></td></tr>
            <tr><td colspan="2" style="text-align: center"><input type="submit" value="登录"/></td></tr>
        </table>
    </form>
</div>
<script>
    // function check()
    // {
    //     var userName = document.getElementsByName("userName")[0].value;
    //     var password = document.getElementsByName("password")[0].value;
    //     if (userName == "") {
    //         alert("请填写用户名");
    //         return false;
    //     }
    //     if (password =="") {
    //         alert("请填写密码")
    //         return false;
    //     }
    // }
</script>
</body>
</html>
