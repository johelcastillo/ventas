package com.satellite.domain;

import org.apache.ibatis.type.Alias;

@Alias("Product")
public class Product {

	private Integer id_product;
	private String name_product;
	private String description_product;
	
	private Model model;
	private Design design;
	public Integer getId_product() {
		return id_product;
	}
	public void setId_product(Integer id_product) {
		this.id_product = id_product;
	}
	public String getName_product() {
		return name_product;
	}
	public void setName_product(String name_product) {
		this.name_product = name_product;
	}
	public String getDescription_product() {
		return description_product;
	}
	public void setDescription_product(String description_product) {
		this.description_product = description_product;
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


}
