package com.satellite.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.satellite.domain.Design;


 public interface DesignDao {
	
	
	public void insertDesign(@Param("design") Design design) ;
	public List<Design> getAllDesign();
	public Design getDesignById(@Param("id")Integer id);
	public void deleteDesign(@Param("id")Integer id);
	//List<Design> getDesignforModel(Integer design);
}
