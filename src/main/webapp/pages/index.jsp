<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index.jsp file</title>
</head>
<body>

	<form:form action="showform" modelAttribute="student" method="get">
		<table>

			<tr>

				<td>Name :</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Phno :</td>
				<td><form:input path="phno" /></td>
			<tr>
				<td>Gender :</td>
				<td>
				<form:radiobutton path="gender" value="male" />Male 
				<form:radiobutton path="gender" value="female" />Female
				</td>
			</tr>


			<tr>
				<td>Course :</td>
				<td><form:select path="course">
						<form:option value="Java">Java</form:option>
						<form:option value="Python">Python</form:option>
						<form:option value="JavaScript">JavaScript</form:option>
						<form:option value="Sql">Sql</form:option>
					</form:select></td>
			</tr>

			<tr>
				<td>Timings:</td>
				<td><form:checkbox path="timings" value="Morning" />Morning <form:checkbox
						path="timings" value="Noon" />Noon <form:checkbox path="timings"
						value="Evening" />Evening</td>
			</tr>



			<tr>
				<td></td>
				<td><input type="submit" value="submit"></td>

			</tr>

		</table>



	</form:form>

</body>
</html>