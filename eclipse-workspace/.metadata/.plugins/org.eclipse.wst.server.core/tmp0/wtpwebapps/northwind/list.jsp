<%@page import="com.vuacademy.training.model.Category"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List of Categories</h1>

 <div class="card">
          <div class="card-content">

            <span class="card-title">Product Categories</span>
            <form method="get">
             <button type="submit" formaction="category-form" class="add-btn btn blue darken-3"><i class="fa fa-plus"></i> Add Category</button>
        </form>
        <table class="striped" id="category-list">
          <thead>
          <tr>
            <th>Category Id</th>
            <th>Name</th>
            <th>Description</th>
            <th></th>
          </tr>
          </thead>

          <tbody>
           <%
	List<Category> list =  (List)request.getAttribute("categories");
 for(Category cat : list){
%>
<tr>
			<td><%=cat.getCategoryId() %></td>
			<td><%=cat.getCategoryName() %></td>
			<td><%=cat.getDescription() %></td>
			<td><a href="category-form?categoryId=<%=cat.getCategoryId()%>">Edit</a>&nbsp;&nbsp;
			<a href="category-delete?categoryId=<%=cat.getCategoryId()%>">Delete</a>
			</td> 
		</tr>
<% 	 
 }
 %>
          </tbody>
        </table>
          </div>
        </div>
</body>
</html>