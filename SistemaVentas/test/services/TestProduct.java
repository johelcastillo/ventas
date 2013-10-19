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
import com.satellite.dao.ProductDao;
import com.satellite.domain.Design;
import com.satellite.domain.Model;
import com.satellite.domain.Product;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:recurso/applicationContext.xml" })
@Transactional
@TransactionConfiguration(defaultRollback = false)
public class TestProduct {

	
	@Resource
	ProductDao productDao;
	
	@Resource 
	DesignDao designDao;
	
	@Test
	public void insertProductTest() {
		System.out.println();
		long sizeInitial = productDao.getAllProduct().size();
		System.out.println(sizeInitial);
		Product product= new Product();
		
		product.setDescription_product("Aguilera Díaz-Heredero");
		product.setName_product("Calle de la zarzuela, 45");
		Model model= new Model();
		model.setId_model(1);
		Design design= new Design();
		design.setId_design(1);
		product.setModel(model);
		product.setDesign(design);
		productDao.insertProduct(product);
		
		assertEquals(sizeInitial + 1, productDao.getAllProduct().size());
		
		
	}
	@Test
	public void getAllProductTest() {
		System.out.println();
		long sizeInitial = productDao.getAllProduct().size();
		System.out.println("all"+sizeInitial);
		
		
		List<Product> products = productDao.getAllProduct();
		
		  assertNotNull(products);
	
		  for (Product product : products)
		
		  {

		   System.out.println(product);
	
		  }

				
	}
	@Test
	public void deleteProductTest() {
		int i=productDao.getAllProduct().size();
		System.out.println("elimno"+productDao.getProduct(i).getId_product());
		productDao.deleteProduct(i);		
		assertNull(productDao.getProduct(i));
}

}
