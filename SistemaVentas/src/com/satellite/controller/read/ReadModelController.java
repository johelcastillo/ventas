package com.satellite.controller.read;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.satellite.dao.ModelDao;
import com.satellite.domain.Model;

public class ReadModelController {
	
	
	
	private List<Model> listamodelos;
	
	@Autowired
	ModelDao modelDao;
	
	@PostConstruct
	void init(){
		listamodelos=(List<Model>) modelDao.getAllModel();
		
	}

	public List<Model> getListamodelos() {
		return listamodelos;
	}

	public void setListamodelos(List<Model> listamodelos) {
		this.listamodelos = listamodelos;
	}

	
	
}
