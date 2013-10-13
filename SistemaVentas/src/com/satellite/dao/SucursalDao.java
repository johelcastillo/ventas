package com.satellite.dao;

import java.util.List;

import com.satellite.domain.Model;
import com.satellite.domain.Sucursal;

public interface SucursalDao {

	public void insertSucursal(Model modelo) ;
	public List<Sucursal> getAllProduct();
	public Sucursal getSucursal(Integer id);
	public void deleteSucursal(Integer id);

}
