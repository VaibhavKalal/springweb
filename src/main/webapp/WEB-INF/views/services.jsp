<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>services</title>
    </head>
    <body>
        <%
            String contact = (String) request.getAttribute("contact");
        %>
        <h1>Hello World!</h1>
        <h1>Contact No.: <%= contact %></h1>
        <a href="/springweb">home</a>
    </body>
</html>
