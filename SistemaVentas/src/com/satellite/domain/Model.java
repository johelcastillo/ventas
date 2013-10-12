package com.satellite.domain;

import org.apache.ibatis.type.Alias;

@Alias("Model")
public class Model {

	int id_model;
	String name_model;
	String descripcion_model;
	

	public int getId_model() {
		return id_model;
	}

	public void setId_model(int id_model) {
		this.id_model = id_model;
	}

	public String getName_product() {
		return name_model;
	}

	public void setName_product(String name_product) {
		this.name_model = name_product;
	}

	public String getDescripcion_product() {
		return descripcion_model;
	}

	public void setDescripcion_product(String descripcion_product) {
		this.descripcion_model = descripcion_product;
	}



	

}
