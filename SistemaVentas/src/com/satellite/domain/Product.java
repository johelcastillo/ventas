package com.satellite.domain;

public class Product {

	private Integer id_product;
	private String name_product;
	private String description_product;
	
	private Model model;
	
	
	
	
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

	String color;
	Integer stock;
	Design  design;
	Sucursal sucursal;

	public Design getDesign() {
		return design;
	}

	public void setDesign(Design design) {
		this.design = design;
	}

	public Integer getId() {
		return id_product;
	}

	public void setId(Integer id) {
		this.id_product = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

}
