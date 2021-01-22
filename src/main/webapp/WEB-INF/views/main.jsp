<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Your Tasks</title>
</head>
<body>

<style>

form{

	border:1px solid black;
	padding: 20px;
	margin-left: 30px;
	margin-top:40px;
	margin-right:30px;
}

</style>

<form method="post">



<h2> Add Task </h2>
<br> 
<h5>Task name: </h5> <input type="text" name="tskname" required> <br/> <br/>

<h5>Descriptions:</h5> <input type="text" name="descrip" required> <br/> <br/>

<h5>Email: </h5> <input type="email" name="email" required> <br/> <br/>

<h5>Severity:</h5>
<select  id="sev" name="sev" required>
					<option value="low">Low</option>
					<option value="Medium">Medium</option>
					<option value="High">High</option>
</select>
<br/>  <br/>
<h5>Start Date:</h5>
 <input type="date" pattern="yyyy-mm-dd" name="startdate" required> <br/> <br/>
 
 <h5> End Date: </h5><input type="date" pattern="yyyy-mm-dd" name="enddate" required> <br/> <br/>

<button class="btn btn-primary" type="submit">Submit</button>

&nbsp; &nbsp; &nbsp;To get the list of the Tasks Click Here!!!   <a type="button" class="btn btn-dark" href="/loadfeeds">List Tasks</a>

</form>
</body>
</html>