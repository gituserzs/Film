<%--
  Created by IntelliJ IDEA.
  User: ZS
  Date: 2018/8/13
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
    <title>film</title>
</head>
<body>
    <table>
        <tr><td>film_id</td><td>title</td><td>description</td><td>language</td></tr>
        <c:forEach var="f" items="${films}">
            <tr><td><c:out value="${f.filmId}"/></td>
                <td><c:out value="${f.title}"/></td>
                <td><c:out value="${f.description}"/></td>
                <td><c:out value="${f.name}"/></td>
                <td><button><a href="/toupdate?filmId=<c:out value="${f.filmId}"/>">编辑</a></button>&nbsp;
                <button><a href="/delete?filmId=<c:out value="${f.filmId}"/>">删除</a></button></td></tr>
        </c:forEach>
    </table>
</body>
</html>
