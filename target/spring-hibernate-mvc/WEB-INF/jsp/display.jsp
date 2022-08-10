<%--
  Created by IntelliJ IDEA.
  User: aakin
  Date: 7/21/2022
  Time: 1:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
      <title>Aytug SNI</title>
      <style type="text/css">
            th{
                  background: cornflowerblue;
                  color: white;
            }
      </style>
</head>
<body>
<center>

      <h1>Çalışan listesi</h1>
      <table border="2" width="100%">
            <tr>
                  <th>Çalışan kodu</th>
                  <th>Çalışan ismi</th>
                  <th>Açıklama</th>
                  <th>Email</th>

            </tr>
            <c:forEach var="tab" items="${data}">
            <tr>
                  <td>${tab.empcode}</td>
                  <td>${tab.empname}</td>
                  <td>${tab.designation}</td>
                  <td>${tab.email}</td>
            </tr>
            </c:forEach>
      </table>
      <br/>
            <h2>${msg}</h2>
</center>
</body>
</html>
