<%-- 
    Document   : HelloJsp
    Created on : Jul 11, 2018, 5:01:32 PM
    Author     : maidul
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>Today: <%= new Date().toString()%></p>
    </body>
</html>
