package com.vuacademy.training.controller;


import com.vuacademy.training.commons.NorthwindException;
import com.vuacademy.training.model.Category;
import com.vuacademy.training.service.CategoryService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * Servlet implementation class CategoryViewServlet
 */
@WebServlet("/categories-list")
public class CategoryViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
		 CategoryService service = new CategoryService();
		 try{
			 List<Category> list = service.getAllCategories();
			/* out.print("<table border='1'>");
			 for(Category c : list){
				 out.print("<tr>");
				 out.print("<td> "+c.getCategoryId()+"</td>");
				 out.print("<td> "+c.getCategoryName()+"</td>");
				 out.print("<td> "+c.getDescription()+"</td>");
				 out.print("</tr>");
			 }*/
			 //out.print("</table>");
			 	 ObjectMapper objectMapper = new ObjectMapper();
			 String val =  objectMapper.writeValueAsString(list);
			request.setAttribute("categories", list);
			request.setAttribute("listPage", "list.jsp");
		
			 request.getRequestDispatcher("index.jsp").forward(request, response);
			 
			 
		 }catch(NorthwindException ex){
			 ex.printStackTrace();
		 }
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		doGet(request, response);
	}

}
