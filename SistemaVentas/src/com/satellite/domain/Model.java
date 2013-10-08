package com.satellite.domain;

import org.apache.ibatis.type.Alias;

@Alias("Model")
public class Model {

	int id_model;
	String name_product;
	String descripcion_product;
	

	public int getId_model() {
		return id_model;
	}

	public void setId_model(int id_model) {
		this.id_model = id_model;
	}

	public String getName_product() {
		return name_product;
	}

	public void setName_product(String name_product) {
		this.name_product = name_product;
	}

	public String getDescripcion_product() {
		return descripcion_product;
	}

	public void setDescripcion_product(String descripcion_product) {
		this.descripcion_product = descripcion_product;
	}

	public int getId() {
		return id_model;
	}

	public void setId(int id) {
		this.id_model = id;
	}

	public String getName() {
		return name_product;
	}

	public void setName(String name) {
		this.name_product = name;
	}

	public String getDescripcion() {
		return descripcion_product;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion_product = descripcion;
	}

}
