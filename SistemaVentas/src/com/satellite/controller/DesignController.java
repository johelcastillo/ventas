package com.satellite.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.satellite.dao.DesignDao;
import com.satellite.domain.Design;


@Controller
@Scope("session")
public class DesignController implements Serializable{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Autowired
DesignDao designDao;	

List<Design> listadisenos;

@PostConstruct
private void init() {
	
	listadisenos = designDao.getAllDesign();
	// TODO Auto-generated method stub
	for(Design d :listadisenos)
System.out.println(d.getDescription_design());
}
public List<Design> getListadisenos() {
	return listadisenos;
}

public void setListadisenos(List<Design> listadisenos) {
	this.listadisenos = listadisenos;
}


}
