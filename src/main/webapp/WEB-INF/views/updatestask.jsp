<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Tasks</title>


	<style>
			
			h2{
			margin-top:40px;
			}
	</style>
</head>
<body>

	<div align="center">
		<h2>Update Task</h2>

		<form:form method="post" modelAttribute="updtsk">
			<table border="0" cellpadding="5">
				<tr>
					<td>ID:</td>
					<td>${updtsk.id}<form:hidden path="id" />
					</td>
				</tr>


				<tr>
					<td>Task</td>
					<td><form:input path="tskname" /></td>

				</tr>

				<tr>
					<td>Description</td>
					<td><form:input path="descrip" /></td>
				</tr>

				<tr>
					<td>Email</td>
					<td><form:input path="email" /></td>
				</tr>

				<tr>
					<td><form:label path="sever">Severity</form:label></td>
					<td><form:select path="sever" items="${severity}">
							<form:option value="NONE" label="Select" />
							<form:options items="${sever}" />
						</form:select></td>
				</tr>


				<tr>
					<td>Start Date</td>
					<td><form:input type="date" path="startdate" required="required" /></td>

				</tr>

				<tr>
					<td>End Date</td>
					<td><form:input type="date" path="enddate" required="required" /></td>

				</tr>

				<tr>
					<td colspan="2"><input type="submit" class="btn btn-secondary" value="Save"></td>
				</tr>
			</table>
		</form:form>
	</div>


</body>
</html>
