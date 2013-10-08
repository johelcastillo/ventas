package com.satellite.dao;

import java.util.List;

import com.satellite.domain.Model;

interface ModelDao  {
	
	void insertModel(Model modelo) ;
	List<Model> getAllModel();
	Model getModel(Integer id);
	void deleteModel(Integer id);

}
