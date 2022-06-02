<%-- 
    Document   : agecalculator
    Created on : 26-May-2022, 11:31:49 AM
    Author     : 18255
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form method ="post" action="age">
            <label> Enter Your age:</label>
            <input type ="text" name="age" value="${Age}">
            
            <br><br>
            <input type="submit" value="Age next birthday">
            
         </form>
        <p> ${message}</p>
        <a href="arithmetic">Arithmetic Calculator</a>
        
    </body>
</html>
