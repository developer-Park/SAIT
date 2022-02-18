<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <p> Hello, ${username} <a href="ShoppingList?Logout">Logout</a></p>
        <h2>List</h2>
        <form action="ShoppingList" method="POST">
            <input type="hidden" name="action" value="add">
            <label for="item">Add Item: </label>
            <input type="text" name="item" id="items">
            <button type="submit">Add</button>
        </form>
        
        <form action="ShoppingList" method="POST">
            <input type="hidden" name="action" value="delete">
            <c:forEach items="${items}" var="item">
               <p>
                   <input type="radio" name="item" value="<c:out value="${item}"/>">
                    
                    ${item}
                </p> 
            </c:forEach>
            
            <button type="submit">Delete</button>
        </form>
    </body>
</html>
