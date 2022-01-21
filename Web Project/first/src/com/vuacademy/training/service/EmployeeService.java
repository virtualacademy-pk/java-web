package com.vuacademy.training.service;


import java.util.ArrayList;
import java.util.List;

import com.vuacademy.training.commons.NorthwindException;
import com.vuacademy.training.dao.EmployeeDAO;
import com.vuacademy.training.model.Employee;
 
public class EmployeeService {
	 private EmployeeDAO employeeDAO = new EmployeeDAO();
	public void saveEmployee(Employee employee) throws NorthwindException{
		  employeeDAO.saveEmployee(employee);
	 }
	
	public Employee findEmployee(int employeeId) throws NorthwindException{
		 Employee employee = null;
		  employee = employeeDAO.findEmployee(employeeId);
		 return employee;
	 }
	 
	 public List<Employee> getAllEmployee() throws NorthwindException{
		 List<Employee> employees = new ArrayList<Employee>();
		 employees = employeeDAO.getAllEmployee();
	 
		 return employees;
	 }
	 
	 public void deleteEmployee(int employeeId) throws NorthwindException{
		 employeeDAO.deleteEmployee(employeeId);
	 }
	 
	 public void updateEmployee(Employee employee) throws NorthwindException{
		 
		  employeeDAO.updateEmployee(employee);		 
	 }
}
