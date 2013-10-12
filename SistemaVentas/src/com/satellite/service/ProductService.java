package com.satellite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.satellite.dao.ProductDao;
import com.satellite.domain.Product;


@Service
public class ProductService {
	
	@Autowired
	ProductDao productdao;
	
	@Transactional
	void insertProduct(Product product) {
		productdao.insertProduct(product);
		
	};
	public List<Product> getAllProduct() {
	return productdao.getAllProduct();	
		
	};
	public Product getProduct(Integer id){
		return productdao.getProduct(id);
		
	};
	@Transactional
	public void deleteProduct(Integer id){
		productdao.deleteProduct(id);
		
	};
}
