package com.satellite.domain;

import org.apache.ibatis.type.Alias;


@Alias("Variedad")
public class Variedad {
	private Integer id_color;
	private  String description_color;
	private String name_color;
	
	
	public String getDescription_color() {
		return description_color;
	}
	public void setDescription_color(String descripcion_color) {
		this.description_color = descripcion_color;
	}
	
	
	
	public Integer getId_color() {
		return id_color;
	}
	public void setId_color(Integer id_color) {
		this.id_color = id_color;
	}
	
	public String getName_color() {
		return name_color;
	}
	public void setName_color(String name_color) {
		this.name_color = name_color;
	}
	
	
	
	
	
	
}
