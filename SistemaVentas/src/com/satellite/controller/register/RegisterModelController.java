package com.satellite.controller.register;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.satellite.dao.ModelDao;
import com.satellite.domain.Model;

public class RegisterModelController {
	
	
	
	
	
	private Model model;
	
	@Autowired
	private ModelDao modeldao;;
	
	@PostConstruct
	void init(){
		
		
	}
	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
	public void saveModel(){
		
		modeldao.insertModel(model);
		
	}

}
