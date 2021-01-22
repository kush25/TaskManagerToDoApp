<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log In Page</title>

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
    		background-color:lightgrey;
    		border-radius:30px;
    		box-shadow:15px 5px 10px black;
    	}
    	
    	input{
    		border-radius:20px;
    	}
    	
    	
    </style>
</head>
<body>

	<div class="container">
	<form method="post">

<h4>Please Log In here</h4> <br/> <br/>
<h5>Name:</h5> <input type="text" name="uname" required="required"> <br/> <br/>
<h5>Password:</h5><input type="password" name="upass" required="required"> <br/>
<br/>
<input type="submit" class="btn btn-success" />
</form>

</div>
</body>
</html>