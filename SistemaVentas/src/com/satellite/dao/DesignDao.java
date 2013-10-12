package com.satellite.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.satellite.domain.Design;


 public interface DesignDao {
	
	
	void insertDesign(@Param("diseno")Design diseno) ;
	List<Design> getAllDesign();
	Design getDesignById(@Param("id")Integer id);
	void deleteDesign(@Param("id")Integer id);
	//List<Design> getDesignforModel(Integer design);
}
