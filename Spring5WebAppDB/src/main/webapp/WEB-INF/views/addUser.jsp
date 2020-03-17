<%--
  Created by IntelliJ IDEA.
  User: sumat
  Date: 3/12/2020
  Time: 4:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring " uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Add User</title>
    <!--<script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js" />
    <link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />-->
</head>
<body>
<form:form method="post" modelAttribute="person">
    <fieldset>
        <form:label path="name">Name: </form:label>
        <form:input path="name" type="text" required="required"/>
    </fieldset>
    <input type="submit" value="Add User"/>
</form:form>

<h1>${person.name}</h1>

</body>
</html>
