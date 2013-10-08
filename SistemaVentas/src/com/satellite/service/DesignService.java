package com.satellite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satellite.dao.DesignDao;
import com.satellite.domain.Design;


@Service
public class DesignService {
	
@Autowired
 private DesignDao designdao;

void insertDesign(Design design) {
	designdao.insertDesign(design);
	
};
List<Design> getAllDesign(){
	return designdao.getAllDesign();
	
	
};
Design getDesign(Integer id){
	return getDesign(id);
	
	
};
void deleteDesign(Integer id){
	designdao.deleteDesign(id);
	
};
List<Design> getDesignforModel(Integer model){
	
	return designdao.getDesignforModel(model);
	
		
};

}
