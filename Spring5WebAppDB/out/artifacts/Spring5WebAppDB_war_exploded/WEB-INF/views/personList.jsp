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
    <title>Person List</title>
</head>
<body>
<c:forEach items="${personList}" var="person">
    <p>Name : <a href="/Spring5WebAppDB_war_exploded/personList/person/${person.name}">${person.name}</a> </p>
    <hr/>
</c:forEach>
</body>
</html>
