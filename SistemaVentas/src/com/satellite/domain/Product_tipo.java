package com.satellite.domain;

import org.apache.ibatis.type.Alias;

@Alias("Produc_Tipo")
public class Product_tipo {

	private Integer id_product_tipo;
	private String description;
	private Product product;
	private Variedad variedad;

	public Integer getId_product_tipo() {
		return id_product_tipo;
	}

	public void setId_product_tipo(Integer id_product_tipo) {
		this.id_product_tipo = id_product_tipo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Variedad getVariedad() {
		return variedad;
	}

	public void setVariedad(Variedad variedad) {
		this.variedad = variedad;
	}

}
