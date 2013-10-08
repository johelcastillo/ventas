package com.satellite.dao;

import java.util.List;

import com.satellite.domain.Design;
import com.satellite.domain.Model;

 public interface DesignDao {
	
	
	void insertDesign(Design modelo) ;
	List<Design> getAllDesign();
	Model getDesign(Integer id);
	void deleteDesign(Integer id);
	List<Design> getDesignforModel(Integer design);
}
