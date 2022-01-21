package com.vuacademy.training.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vuacademy.training.commons.NorthwindException;
import com.vuacademy.training.model.Category;
import com.vuacademy.training.service.CategoryService;

/**
 * Servlet implementation class CategoryViewServlet
 */
@WebServlet("/CategoryDeleteServlet")
public class CategoryDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryDeleteServlet() {
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
			 int categoryId = Integer.parseInt(request.getParameter("catid"));
			 service.deleteCategory(categoryId);
			 response.sendRedirect("CategoryViewServlet");
			 
			 
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
