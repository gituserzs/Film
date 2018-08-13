<%@ page import="com.zs.entity.Film" %><%--
  Created by IntelliJ IDEA.
  User: ZS
  Date: 2018/8/13
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>update</title>
</head>
<body>
<%
    Film film = (Film)request.getAttribute("film");
%>
<div style="border: 1px solid ;border-radius: 5px;width: 300px;margin: 100px auto">
    <form action="/update" method="post">
        <table style="margin: 0px auto">
            <tr><td><input type="hidden" value="<%=film.getFilmId()%>" name="filmId"></td></tr>
            <tr><td>标题</td><td><input type="text" name="title" value="<%=film.getTitle()%>"/></td></tr>
            <tr><td>简介</td><td><input type="text" name="description" value="<%=film.getDescription()%>"/></td></tr>
            <tr><td>语言</td><td><select name="name">
                <c:forEach var="l" items="${languages}">
                    <option value="<c:out value="${l.languageId}"/>"
                        <c:if test="${l.name == film.name}">selected</c:if>>
                    <c:out value="${l.name}"/></option>
                </c:forEach>
            </select>
            </td></tr>
            <tr><td colspan="2" style="text-align: center"><input type="submit" value="修改"></td></tr>
        </table>
    </form>
</div>
</body>
</html>
