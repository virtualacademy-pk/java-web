package com.vuacademy.training.service;

import com.vuacademy.training.commons.NorthwindException;
import com.vuacademy.training.dao.CategoryDAO;
import com.vuacademy.training.model.Category;

import java.util.List;

public class CategoryService {
	private static CategoryDAO categoryDAO = new CategoryDAO();
	public void saveCategory(Category category) throws NorthwindException{
		categoryDAO.saveCategory(category);
	}
	public Category findCategory(int categoryId) throws NorthwindException{
		return categoryDAO.findCategory(categoryId);
	}
	 public void updateCategory(Category category) throws NorthwindException{
		 categoryDAO.updateCategory(category);
	 }
	 public void deleteCategory(int categoryId) throws NorthwindException{
		 categoryDAO.deleteCategory(categoryId);
	 }
	 public List<Category> getAllCategories() throws NorthwindException{
		 return categoryDAO.getAllCategories();
	 }
}
