package com.vuacademy.training.service;


import com.vuacademy.training.commons.NorthwindException;
import com.vuacademy.training.dao.SupplierDAO;
import com.vuacademy.training.model.Supplier;

import java.util.ArrayList;
import java.util.List;
 
public class SupplierService {
	 private SupplierDAO supplierDAO = new SupplierDAO();
	public void saveSupplier(Supplier supplier) throws NorthwindException{
		supplierDAO.saveSupplier(supplier);
	 }
	
	public Supplier findSupplier(int supplierId) throws NorthwindException{
		 Supplier supplier = null;
		 supplier = supplierDAO.findSupplier(supplierId);
		 return supplier;
	 }
	 
	 public List<Supplier> getAllSupplier() throws NorthwindException{
		 List<Supplier> suppliers = new ArrayList<Supplier>();
		 suppliers = supplierDAO.getAllSupplier();
		 return suppliers;
	 }
	 
	 public void deleteSupplier(int supplierId) throws NorthwindException{
		 supplierDAO.deleteSupplier(supplierId);
	 }
	 
	 public void updateSupplier(Supplier supplier) throws NorthwindException{
		 supplierDAO.updateSupplier(supplier);		 
	 }
}
