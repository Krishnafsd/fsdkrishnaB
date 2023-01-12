package com.example.empp;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.empp.model.Edemo;
import com.example.empp.repository.Emrepo;

@SpringBootTest
class SpringbootFirstAppApplicationTests {
	@Autowired
	Emrepo emrepo;
	@Test
	public void testCreate()
	{
		Edemo u=new Edemo();
		u.setId(1);
		u.setName("nithin");
		emrepo.save(u);
		
	}
	@Test
	public void testReadAll()
	{
		Iterable<Edemo> list=emrepo.findAll();
		
	}
	@Test
	public void testUpdate()
	{
		Edemo u=emrepo.findById(5).get();
		u.setName("krishna");
		emrepo.save(u);
		
	}
	@Test
	public void testDelete()
	{		
		emrepo.deleteById(3);
		
	}
}

