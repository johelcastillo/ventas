package com.satellite.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.satellite.dao.ModelDao;
import com.satellite.domain.Model;

public class ModelService {
	@Autowired
	private ModelDao modeldao;
	
	@Transactional
	void insertModel(Model modelo) {
		modeldao.insertModel(modelo);
		
	};
	List<Model> getAllModel(){
		return modeldao.getAllModel();
		
		
	};
	Model getModel(Integer id){
		return getModel(id);
		
		
	};
	@Transactional
	void deleteModel(Integer id){
		modeldao.deleteModel(id);
		
	};

}
