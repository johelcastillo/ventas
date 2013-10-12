package com.satellite.domain;

import org.apache.ibatis.type.Alias;

@Alias("Design")
public class Design {

	Integer id_design;
	String name_design;
	String descripction_design;

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

	public String getDescripction_design() {
		return descripction_design;
	}

	public void setDescripction_design(String descripction_design) {
		this.descripction_design = descripction_design;
	}

}
