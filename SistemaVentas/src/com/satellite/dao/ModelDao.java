package com.satellite.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.satellite.domain.Model;

public interface ModelDao  {
	
	public void insertModel(@Param("modelo")Model modelo) ;
	public List<Model> getAllModel();
	public Model getModel(@Param("id") Integer id);
	void deleteModel(@Param("id") Integer id);

}
