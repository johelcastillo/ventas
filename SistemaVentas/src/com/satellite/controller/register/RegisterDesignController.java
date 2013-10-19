package com.satellite.controller.register;

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
public class RegisterDesignController implements Serializable{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Autowired
DesignDao designDao;	

private Design diseno;

@PostConstruct
private void init() {
	
	
}

public DesignDao getDesignDao() {
	return designDao;
}

public void setDesignDao(DesignDao designDao) {
	this.designDao = designDao;
}

public Design getDiseno() {
	return diseno;
}

public void setDiseno(Design diseno) {
	this.diseno = diseno;
}


public void saveDesign(){
	
	designDao.insertDesign(diseno);
	
	
}

}
