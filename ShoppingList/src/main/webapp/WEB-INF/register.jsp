<%-- 
    Document   : register
    Created on : Feb 18, 2022, 3:26:07 PM
    Author     : JeongHun Park
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <form action="ShoppingList" method="POST">
            <div class="name">
                <label for="name">name: </label>
                <input type="text" name="name" id="name" placeholder="Register name here">
            </div>
            <button type="submit">Register Name</button>
            
        </form>
        
    </body>
</html>
