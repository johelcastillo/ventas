package com.satellite.controller.read;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.satellite.dao.ModelDao;
import com.satellite.domain.Model;

@Controller
@Scope("request")
public class ReadModelController {
	
	
	
	private List<Model> listamodelos;
	
	@Autowired
	ModelDao modelDao;
	
	@PostConstruct
	public void init(){
		System.out.println("modelos carajo estoy aqui");
		listamodelos=(List<Model>) modelDao.getAllModel();
		
	}
	public void listar(){
		listamodelos=(List<Model>) modelDao.getAllModel();
		for(Model modelo :listamodelos)
			System.out.println(modelo.getDescription_model());
		
	}

	public List<Model> getListamodelos() {
		return listamodelos;
	}

	public void setListamodelos(List<Model> listamodelos) {
		this.listamodelos = listamodelos;
	}

	
	
}
