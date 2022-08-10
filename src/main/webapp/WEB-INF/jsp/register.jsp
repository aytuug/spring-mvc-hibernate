<%--
  Created by IntelliJ IDEA.
  User: aakin
  Date: 7/21/2022
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Aytug SNI</title>
    <style>
        h2{
            color: cornflowerblue;
        }

    </style>
</head>
<body>
<center>

    <h1>Kayıt Formu</h1>
    <form:form action="store" method="post" modelAttribute="bean">
        Ismi giriniz : <form:input path="empname"/> <br/><br/>
        Aciklamayi giriniz:   : <form:input path="designation"/> <br/><br/>
        email : <form:input path="email"/><br/><br/>

        <input type="submit" value="Register">
    </form:form>
    <br/>
    <h2> ${msg}</h2>
</center>
</body>
</html>
