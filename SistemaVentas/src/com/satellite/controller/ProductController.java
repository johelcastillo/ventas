package com.satellite.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.satellite.domain.Product;
import com.satellite.service.ProductService;


@Controller
public class ProductController {
	
	List<Product> listaproductos = new ArrayList<>();
	
	@Autowired
	ProductService productservice;
	
	@PostConstruct
	void init(){
		listaproductos=(List<Product>) productservice.getAllProduct();
		
	}
	

}
