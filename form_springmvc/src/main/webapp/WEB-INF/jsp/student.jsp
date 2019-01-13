<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student information</title>
</head>
<body>
	<h2>Student Information</h2>
	<form:form action="/form_springmvc/addStudent" method="post">
		<table>
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="age">Age</form:label></td>
				<td><form:input path="age"></form:input>
			</tr>
			<tr>
				<td><form:label path="id">id</form:label></td>
				<td><form:input path="id"></form:input></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Submit"/>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>