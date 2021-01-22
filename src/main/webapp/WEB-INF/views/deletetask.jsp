<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
   
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Task</title>

		<style>
			form
			{
				margin-top:20px;
				padding:30px;
			}
				
		
		</style>
</head>
<body>


	<form:form modelAttribute="deltsk">
		
		<tr>
					<h5>Task ID to be Deleted is:</h5>
					<td>${deltsk.id}<form:hidden path="id" />
					</td>
					<br/><br/>
					<h5> And your Task Name is:</h5>
					<td>${deltsk.tskname}<form:hidden path="id" />
					</td>
				</tr>
		
		<br/> <br/> <br/>
		<div>
			<input onclick="myFunction()" type="submit" class="btn btn-primary" value="Delete Task" />
			
			<script>
			function myFunction(){
				alert("Task Deleted")
				}
			</script>

		</div>


	</form:form>

		
</body>
</html>