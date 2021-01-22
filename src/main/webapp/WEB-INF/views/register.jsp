<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    
    
    <style>
    
    	form{
    		border:2px solid black;
    		margin-top:40px;
    		margin-left:50px;
    		padding:50px;
    		}
    		
    		a{
    			text-decoration:none;
    			color:white;
    		}
    		
    		a:hover{
    			color:black;
    		}
    </style>
    
    
</head>
<body>

<div class="container">
<form method="post">

<h3>User Registration</h3> <br/> <br/>

<h5>Username:</h5>
 <input type="text" name="uname">  <br/> <br/>
<h5>Password:</h5><input type="password" name="upass">  <br/>  <br/>
<h5>Email:</h5> <input type="email" name="uemail">  <br/>  <br/>

<button type="submit" class="btn btn-primary">Submit</button>
<br/> <br/>

<h5> Already Registered, Log In !!!</h5>

<button type="submit" class="btn btn-success"> <a href="/login">Login</a></button>
</form>



</body>

</div>
</html>