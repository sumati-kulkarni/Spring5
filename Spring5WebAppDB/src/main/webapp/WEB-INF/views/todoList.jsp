<%--
  Created by IntelliJ IDEA.
  User: sumat
  Date: 3/14/2020
  Time: 7:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Todo List</title>
</head>
<body>
<c:forEach items="${todoList}" var="todo">
    <p>Todo ID: ${todo.id}</p>
    <p>Description: ${todo.description}</p>
    <p>Status: ${todo.done}</p>
    <p>End Date: ${todo.endDate}</p>
    <hr/>
</c:forEach>
</body>
</html>
