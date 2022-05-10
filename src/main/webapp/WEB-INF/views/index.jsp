<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <%
            String name = (String)request.getAttribute("name");
        %>
        <h1>Hello World!</h1>
        <h1>my name is <%= name %></h1>
        <a href="services">services</a>
        <a href="about">about</a>
        <a href="help">help</a>
    </body>
</html>
