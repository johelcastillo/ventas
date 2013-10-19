package com.satellite.controller.read;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.satellite.dao.ProductDao;
import com.satellite.domain.Product;

public class ReadDesignController {

	
	
	
List<Product> listaproductos = new ArrayList<>();
	
	
	@Autowired
	ProductDao productDao;
	
	@PostConstruct
	void init(){
		listaproductos=(List<Product>) productDao.getAllProduct();
		
	}

	public List<Product> getListaproductos() {
		return listaproductos;
	}

	public void setListaproductos(List<Product> listaproductos) {
		this.listaproductos = listaproductos;
	}
	
}
