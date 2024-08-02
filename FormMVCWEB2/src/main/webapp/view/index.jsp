<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Portal</title>
<style>
.error {
    color: red;
}
</style>
</head>
<body>
    <h3>User Registration Form</h3>
    <form:form action="register" modelAttribute="user" method="POST">
        <table>
            <tr>
                <td>User Name:</td>
                <td><form:input path="uname" /> <form:errors path="uname" cssClass="error" /></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><form:input path="pwd" /> <form:errors path="pwd" cssClass="error" /></td>
            </tr>
            <tr>
                <td>Email Id:</td>
                <td><form:input path="email" /> <form:errors path="email" cssClass="error" /></td>
            </tr>
            <tr>
                <td>Phone No:</td>
                <td><form:input path="phno" /> <form:errors path="phno" cssClass="error" /></td>
            </tr>
            <tr>
                <td>Age:</td>
                <td><form:input path="age" /> <form:errors path="age" cssClass="error" /></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Submit" /></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
