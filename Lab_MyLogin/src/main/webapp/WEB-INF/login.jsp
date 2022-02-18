<%-- 
    Document   : login
    Created on : 7-Feb-2022, 1:53:42 PM
    Author     : JeongHun Park
    
   
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <link rel="stylesheet"   type="text/css" href="Style/myLogin.css">
        <title>Login Page</title>
    </head>
    <body>
        <div class="main">
        <h1>Login</h1>
        
            <form action="login" method="post">
                
                <label for="username">Username</label>
                <input  type="text" id="username" name="username"/>
                <br>
                <label for="password">Password</label>
                <input type="password" id="password" name="password"/>
                <br>
                <button type="submit">Log In</button>
                
            </form>
             <p>${message}</p>
        </div>
    </body>
</html>
