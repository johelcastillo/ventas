package com.satellite.controller.read;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;


import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.satellite.dao.DesignDao;
import com.satellite.dao.ProductDao;
import com.satellite.domain.Design;
@Controller
@Scope("request")
public class ReadDesignController {

	
	
	

	private List<Design> listadisenos;
	@Autowired
	DesignDao designDao;
	@Autowired
	ProductDao productDao;
	
	@PostConstruct
	void init(){
		System.out.println("carajo disen");
		listadisenos=(List<Design>) designDao.getAllDesign();
		System.out.println(listadisenos.size()+"size");
		
	}

	public List<Design> getListadisenos() {
		return listadisenos;
	}

	public void setListadisenos(List<Design> listadisenos) {
		this.listadisenos = listadisenos;
	}


	
}
