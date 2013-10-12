package com.satellite.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.satellite.domain.Model;

public interface ModelDao  {
	
	void insertModel(@Param("modelo")Model modelo) ;
	List<Model> getAllModel();
	Model getModel(@Param("id") Integer id);
	void deleteModel(@Param("id") Integer id);

}
