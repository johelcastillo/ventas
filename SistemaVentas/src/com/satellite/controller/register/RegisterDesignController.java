package com.satellite.controller.register;


import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.satellite.dao.DesignDao;
import com.satellite.domain.Design;


@Controller
@Scope("session")
public class RegisterDesignController {
	


@Autowired
DesignDao designDao;	

private Design design=new Design();

@PostConstruct
private void init() {
	
	
	
}

public DesignDao getDesignDao() {
	return designDao;
}

public void setDesignDao(DesignDao designDao) {
	this.designDao = designDao;
}



public Design getDesign() {
	return design;
}

public void setDesign(Design design) {
	this.design = design;
}
@Transactional
public void saveDesign(){
	
	designDao.insertDesign(design);
	
	
}

}
