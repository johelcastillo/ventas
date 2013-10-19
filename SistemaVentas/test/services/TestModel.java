package services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.satellite.dao.DesignDao;
import com.satellite.dao.ModelDao;
import com.satellite.domain.Model;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:recurso/applicationContext.xml"})
@Transactional  
@TransactionConfiguration(defaultRollback = false)
public class TestModel {

	
	
	@Resource
	ModelDao modelDao;
	
	@Resource 
	DesignDao designDao;
	
	@Test
	public void insertModelTest() {
		System.out.println();
		long sizeInitial = modelDao.getAllModel().size();
		System.out.println(sizeInitial);
		Model model= new Model();
		model.setDescription_model("modelo de la temporada");
		model.setName_model("modelo 1");
		modelDao.insertModel(model);
		assertEquals(sizeInitial + 1, modelDao.getAllModel().size());
		
		
	}
	@Test
	public void getAllModelTest() {
		System.out.println();
		long sizeInitial = modelDao.getAllModel().size();
		System.out.println("all"+sizeInitial);
	
		

		List<Model> models = modelDao.getAllModel();
		
		  assertNotNull(models);
	
		  for (Model model : models)
		
		  {

		   System.out.println(model);
	
		  }
				
	}
	@Test
	public void deleteModelTest() {
		int i=modelDao.getAllModel().size();
		System.out.println("elimno"+modelDao.getModel(i));
		modelDao.deleteModel(i);		
		assertNull(modelDao.getModel(i));
				
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
