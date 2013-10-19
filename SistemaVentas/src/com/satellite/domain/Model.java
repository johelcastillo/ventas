package com.satellite.domain;

import org.apache.ibatis.type.Alias;

@Alias("Model")
public class Model {

	private int id_model;
	private String name_model;
	private String description_model;
	public String getDescription_model() {
		return description_model;
	}
	public void setDescription_model(String description_model) {
		this.description_model = description_model;
	}
	public int getId_model() {
		return id_model;
	}
	public void setId_model(int id_model) {
		this.id_model = id_model;
	}
	public String getName_model() {
		return name_model;
	}
	public void setName_model(String name_model) {
		this.name_model = name_model;
	}

	




	

}
