<%-- 
    Document   : teste
    Created on : 16/10/2019, 19:53:24
    Author     : internet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%    String usuario = (String) session.getAttribute("usuario");    
                  out.print(usuario);
            %></h1>
    </body>
</html>
