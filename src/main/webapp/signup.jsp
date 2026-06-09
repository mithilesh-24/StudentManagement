<%--
  Created by IntelliJ IDEA.
  User: MITHILESH_24
  Date: 09-06-2026
  Time: 06:41 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Management</title>
    <link href="index.css" rel="stylesheet">

</head>
<body>
    <div class="form">
        <form action="signup" method="post">

            <input type="text" name="username" placeholder="Enter Username" required>
            <input type="text" name="name" placeholder="Enter Name" required>
            <input type="number" name="age" placeholder="Enter Age" required>
            <input type="text" name="department" placeholder="Enter Department" required>
            <input type="password" name="pass" placeholder="Enter Password" required>

            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>
