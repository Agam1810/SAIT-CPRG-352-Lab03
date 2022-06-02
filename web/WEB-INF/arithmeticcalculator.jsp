<%-- 
    Document   : arithmeticcalculator
    Created on : 27-May-2022, 4:35:16 PM
    Author     : 18255
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method ="post" action="arithmetic">
            <label> First:</label>
            <input type ="text" name="first" value="${Fir}">
            
            <label> Second:</label>
            <input type ="text" name="second" value="${Sec}">
            
            <br><br>
            <input type="submit" name="res" value="+">
            <input type="submit" name="res" value="-">
            <input type="submit" name="res" value="*">
            <input type="submit" name="res" value="%">
            
            </form>
        <p>${message}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
