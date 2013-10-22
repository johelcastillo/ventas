package com.satellite.controller.register;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.satellite.dao.ModelDao;
import com.satellite.domain.Model;
@Controller
@Scope("session")
public class RegisterModelController {
	
	
	
	
	
	private Model model= new Model();
	
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
	@Transactional
	public void saveModel(){
		
		modeldao.insertModel(model);
		System.out.println("model"+model.getId_model()+"model"+model.getName_model());
	}

}
