package com.satellite.controller.register;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.satellite.dao.DesignDao;
import com.satellite.dao.ModelDao;
import com.satellite.dao.ProductDao;
import com.satellite.domain.Design;
import com.satellite.domain.Model;
import com.satellite.domain.Product;

@Controller
@Scope("session")
public class RegisterProductController {

	
	private Product product;
	
	List<Design> disenos;
	List<Model> modelos;
	public List<Design> getDisenos() {
		return disenos;
	}

	public void setDisenos(List<Design> disenos) {
		this.disenos = disenos;
	}

	@Autowired
	ProductDao productDao;
	@Autowired
	DesignDao designDao;
	@Autowired
	ModelDao modelDao;

	@PostConstruct
	void init() {
		disenos = (List<Design>) designDao.getAllDesign();
		modelos=(List<Model>)modelDao.getAllModel();
	}
	
	public void save() {
		
		productDao.insertProduct(product);
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product producto) {
		this.product = producto;
	}

}
