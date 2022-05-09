package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.controller.HomeController;
import com.example.dao.DaoInterface1;
import com.example.service.ServiceClass1;
import com.example.service.ServiceInterface1;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ThreeLayerMockitoDemoApplicationTests {

//	@InjectMocks
//	private HomeController homeController=new HomeController();
//	
//	@Mock
//	private ServiceInterface1 serviceInterface1;
//	
//
//@Test
//public void retTest() throws Exception{
//	when(serviceInterface1.ret()).thenReturn("a");
//	assertEquals(homeController.ret(),"a");
//	
//}
	/**
	 * Cannot instantiate @InjectMocks field in an Interfaces
	 */
	
	@InjectMocks
	private ServiceClass1 serviceClass1;
	
	@Mock
	private DaoInterface1 daoInterface1;
	
	@Test
	public void retTest() throws Exception{
		when(daoInterface1.ret()).thenReturn("a");
		assertEquals(serviceClass1.ret(),"a");
		
	}
	
	

}
