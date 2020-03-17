<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: sumat
  Date: 3/15/2020
  Time: 6:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring " uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" modelAttribute="todo">
    <fieldset>
        <form:label path="description">Description: </form:label>
        <form:input path="description" type="text" required="required"  />
    </fieldset>
    <fieldset>
        <form:label path="personName">Person name: </form:label>
        <form:select path="personName" items="${personList}"/>
    </fieldset>
    <input type="submit" value="Add Todo" />
</form:form>
</body>
</html>
