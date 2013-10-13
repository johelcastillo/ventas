package com.satellite.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

	@Alias("Design")
public class Design  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id_design;
	private String name_design;
	private String description_design;

	public Integer getId_design() {
		return id_design;
	}

	public void setId_design(Integer id_design) {
		this.id_design = id_design;
	}

	public String getName_design() {
		return name_design;
	}

	public void setName_design(String name_design) {
		this.name_design = name_design;
	}

	public String getDescription_design() {
		return description_design;
	}

	public void setDescription_design(String description_design) {
		this.description_design = description_design;
	}

}
