package com.satellite.dao;

import java.util.List;

import com.satellite.domain.Model;
import com.satellite.domain.Product;
import com.satellite.domain.Sucursal;

public interface SucursalDao {

	void insertSucursal(Model modelo) ;
	List<Sucursal> getAllProduct();
	Product getSucursal(Integer id);
	void deleteSucursal(Integer id);

}
