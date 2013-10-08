package com.satellite.domain;

import org.apache.ibatis.type.Alias;

@Alias(value = "Design")
public class Design {

	
	Integer id;
	String name_design;
	String descripcion;
	Model model;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name_design;
	}
	public void setName(String name) {
		this.name_design = name;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}

}
