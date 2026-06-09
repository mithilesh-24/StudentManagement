<%--
  Created by IntelliJ IDEA.
  User: MITHILESH_24
  Date: 09-06-2026
  Time: 09:44 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Dashbard</title>
</head>
<body>
    <h1>Dashboard</h1>
    <p> name : ${param.name}</p>
    <form method="get" action="logout">
        <input type="submit" value="logout">
    </form>
</body>
</html>
