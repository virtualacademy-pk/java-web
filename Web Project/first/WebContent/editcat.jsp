<%@page import="com.vuacademy.training.model.Category"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Category category = (Category)request.getAttribute("category");
%>
<form action="CategoryEditServlet?action=save" method="post">
	<table border="1">
		<tr>
			<td> Category Id : </td>
			<td> <input type="text" name="catid" readonly="readonly" value="<%=category.getCategoryId() %>"/></td>
		</tr>
		<tr>
			<td> Category Name : </td>
			<td> <input type="text" name="catnam" value="<%=category.getCategoryName() %>"/></td>
		</tr>
		<tr>
			<td> Description : </td>
			<td> <input type="text" name="desc" value="<%=category.getDescription() %>"/>
			 
			</td>
		</tr>
		 
		<tr>
		<td colspan="2">
			<input type="submit" value="Save"/>
		</td>
		</tr>
	</table>
	
</form>
</body>
</html>