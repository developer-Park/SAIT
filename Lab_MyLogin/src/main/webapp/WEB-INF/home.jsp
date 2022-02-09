<%-- 
    Document   : home
    Created on : 7-Feb-2022, 1:53:42 PM
    Author     : JeongHun Park
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet"   type="text/css" href="Style/myLogin.css">
        <title>Home Page</title>
    </head>
    <body>
        <div class="main">
        <h1>Success login Page</h1>
        <h2>Hello My name is ${username}.</h2>
         <a href="login?logout">Log Out</a>
        </div>
    </body>
</html>
