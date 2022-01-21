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
@WebServlet("/CategoryEditServlet")
public class CategoryEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryEditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    private void handleForward(HttpServletRequest request, HttpServletResponse response,int categoryId){
    	 CategoryService service = new CategoryService();
		 try {
			Category cat = service.findCategory(categoryId);
			request.setAttribute("category", cat);
			request.getRequestDispatcher("editcat.jsp").forward(request, response);
		} catch (Exception e) {
		 
			e.printStackTrace();
		}
    }
    private void saveCategoryChanges(Category cat){
    	CategoryService service = new CategoryService();
    	try {
			service.updateCategory(cat);
		} catch (NorthwindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
		 int categoryId = Integer.parseInt(request.getParameter("catid"));
		 if(request.getParameter("action") == null){
			 handleForward(request, response, categoryId);
		 }else{
			 String catId = request.getParameter("catid");
			 String catName =request.getParameter("catnam");
			 String desc = request.getParameter("desc");
			 Category cat = new Category();
			 cat.setCategoryId(Integer.parseInt(catId));
			 cat.setCategoryName(catName);
			 cat.setDescription(desc);
			 
			 saveCategoryChanges(cat);
			response.sendRedirect("CategoryViewServlet");
		 }
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		doGet(request, response);
	}

}
