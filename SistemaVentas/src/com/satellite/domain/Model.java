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

	public String getName_model() {
		return name_model;
	}

	public void setName_model(String name_model) {
		this.name_model = name_model;
	}

	public String getDescripcion_model() {
		return descripcion_model;
	}

	public void setDescripcion_model(String descripcion_model) {
		this.descripcion_model = descripcion_model;
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




	

}
