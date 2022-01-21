package com.vuacademy.training.service;


import java.util.ArrayList;
import java.util.List;

import com.vuacademy.training.commons.NorthwindException;
import com.vuacademy.training.dao.RegionDAO;
import com.vuacademy.training.model.Region;
 
public class RegionService {
	 private RegionDAO regionDAO = new RegionDAO();
	public void saveRegion(Region region) throws NorthwindException{
		regionDAO.saveRegion(region);
	 }
	
	public Region findRegion(int regionId) throws NorthwindException{
		 Region region = null;
		 regionDAO.findRegion(regionId);
		 return region;
	 }
	 
	 public List<Region> getAllRegion() throws NorthwindException{
		 List<Region> regions = new ArrayList<Region>();
		 regions = regionDAO.getAllRegion();
		 return regions;
	 }
	 
	 public void deleteRegion(int regionId) throws NorthwindException{
		 regionDAO.deleteRegion(regionId);
	 }
	 
	 public void updateRegion(Region region) throws NorthwindException{
		 regionDAO.updateRegion(region);		 
	 }
}
