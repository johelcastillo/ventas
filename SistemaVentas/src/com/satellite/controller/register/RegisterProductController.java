package com.satellite.controller.register;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.satellite.dao.DesignDao;
import com.satellite.dao.ModelDao;
import com.satellite.dao.ProductDao;
import com.satellite.domain.Design;
import com.satellite.domain.Model;
import com.satellite.domain.Product;

@Controller
@Scope("session")
public class RegisterProductController {

	
	
	
	
	
	
	private String modelito;
	private String disenito;
	
	
	@Autowired
	ProductDao productDao;
	@Autowired
	DesignDao designDao;
	@Autowired
	ModelDao modelDao;
	

	private Product product=new Product();
	private Model model;
	

	private Design design;
	private List<Design> listadisenos;
	private List<Model> listamodelos;
	

	@PostConstruct
	void init() {
		listadisenos = (List<Design>) designDao.getAllDesign();
		listamodelos=(List<Model>)modelDao.getAllModel();
	}
	
	@Transactional
	public void saveProduct() {
		product.setModel(model);
		product.setDesign(design);
		System.out.println("carajo que webon");
	productDao.insertProduct(product);
		//System.out.println(product.getId_product()+" producto "+product.getDescription_product());
	}


	public List<Design> getListadisenos() {
		return listadisenos;
	}

	public void setListadisenos(List<Design> listadisenos) {
		this.listadisenos = listadisenos;
	}

	public List<Model> getListamodelos() {
		return listamodelos;
	}

	public void setListamodelos(List<Model> listamodelos) {
		this.listamodelos = listamodelos;
	}


	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public Design getDesign() {
		return design;
	}

	public void setDesign(Design design) {
		this.design = design;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product producto) {
		this.product = producto;
	}

}
