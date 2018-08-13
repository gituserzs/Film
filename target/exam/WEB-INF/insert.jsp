<%--
  Created by IntelliJ IDEA.
  User: ZS
  Date: 2018/8/13
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<html>
<head>
    <title>insert</title>
</head>
<body>
<div style="border: 1px solid ;border-radius: 5px;width: 300px;margin: 100px auto">
<form action="/insert" method="post">
    <table style="margin: 0px auto">
        <tr><td>标题</td><td><input type="text" name="title"></td></tr>
        <tr><td>简介</td><td><input type="text" name="description"></td></tr>
        <tr><td>语言</td><td><select name="name">
                    <c:forEach var="l" items="${languages}">
                        <option value="<c:out value="${l.languageId}"/>" selected><c:out value="${l.name}"/></option>
                    </c:forEach>
                </select>
           </td></tr>
        <tr><td colspan="2" style="text-align: center"><input type="submit" value="增加"></td></tr>
    </table>
</form>
</div>
</body>
</html>
