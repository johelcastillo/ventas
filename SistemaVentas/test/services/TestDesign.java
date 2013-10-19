package services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.logging.Log;
import org.hsqldb.persist.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.satellite.dao.DesignDao;
import com.satellite.domain.Design;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:recurso/applicationContext.xml" })
@Transactional
@TransactionConfiguration(defaultRollback = false)
public class TestDesign {
	@Resource
	DesignDao designDao;

	@Test
	public void insertDesignTest() {
		System.out.println();
		long sizeInitial = designDao.getAllDesign().size();
		System.out.println(sizeInitial);
		Design design = new Design();

		design.setDescription_design("Aguilera Díaz-Heredero");
		design.setName_design("Calle de la zarzuela, 45");
		designDao.insertDesign(design);

		assertEquals(sizeInitial + 1, designDao.getAllDesign().size());

	}

	@Test
	public void getAllDesignTest() {
		System.out.println();
		long sizeInitial = designDao.getAllDesign().size();
		System.out.println("all" + sizeInitial);

		List<Design> designs = designDao.getAllDesign();

		assertNotNull(designs);

		for (Design design : designs)

		{

			System.out.println(design);

		}

	}

	@Test
	public void deleteDesignTest() {
		Design design = new Design();

		design.setDescription_design("Aguilera Díaz-Heredero");
		design.setName_design("Calle de la zarzuela, 45");
		designDao.insertDesign(design);
		int i=designDao.getAllDesign().size();
		designDao.deleteDesign(designDao.getAllDesign().size());
		assertNull(designDao.getDesignById(i));

	}

}
