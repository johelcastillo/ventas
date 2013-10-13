package com.satellite.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.satellite.dao.ProductDao;
import com.satellite.domain.Product;
import com.satellite.service.ProductService;



public class ProductController {
	
	List<Product> listaproductos = new ArrayList<>();
	
	@Autowired
	ProductDao productDao;
	
	@PostConstruct
	void init(){
		listaproductos=(List<Product>) productDao.getAllProduct();
		
	}
	

}
