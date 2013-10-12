package com.satellite.dao;

import java.util.List;



import org.apache.ibatis.annotations.Param;

import com.satellite.domain.Product;

public interface ProductDao {
	
	void insertProduct(@Param("producto")Product producto) ;
	List<Product> getAllProduct();
	Product getProduct(@Param("id")Integer id);
	void deleteProduct(@Param("id") Integer id);

}
