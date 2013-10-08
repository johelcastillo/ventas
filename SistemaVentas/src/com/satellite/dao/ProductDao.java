package com.satellite.dao;

import java.util.List;


import com.satellite.domain.Product;

public interface ProductDao {
	void insertProduct(Product modelo) ;
	List<Product> getAllProduct();
	Product getProduct(Integer id);
	void deleteProduct(Integer id);

}
