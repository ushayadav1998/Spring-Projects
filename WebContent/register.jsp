<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Register Page</title>
<link rel="stylesheet" type="text/css" href="css/style.css">  
</head>
<body>
<h2>Registration Page</h2><br>   
<div class="login">   
<form action="RegisterServlet" method="post">

     <label><b>Customer ID     
        </b>    
        </label>    
        <input type="text" name="customerID" id="customerID" placeholder="customerID">    
        <br><br>   
         
         <label><b>Customer Name    
        </b>    
        </label>    
        <input type="text" name="customerName" id="customerName" placeholder="customerName">    
        <br><br>  
        
        <label><b>Customer Address   
        </b>    
        </label>    
        <input type="text" name="customerAddress" id="customerAddress" placeholder="customerAddress">    
        <br><br>  
         
        <label><b>Password     
        </b>    
        </label>    
        <input type="Password" name="password" id="Pass" placeholder="Password">    
        <br><br>    
        <input type="submit" value="Register"/>      
        <br><br>    




</form>
</body>
</html>