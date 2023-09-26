<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2023/9/4
  Time: 9:07
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="com.baidu.text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table broder="1px" align="center" bgcolor="#ffd700">

    <tr>
<td>id</td>
<td>name</td>
<td>sal</td>
<td>date</td>
    </tr>

    <c:forEach items="${list}" var="a">
        <tr>
            <td>${a.id}</td>
            <td>${a.name}</td>
            <td>${a.sal}</td>
            <td>${a.date}</td>
            <td>
                <a></a>
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
