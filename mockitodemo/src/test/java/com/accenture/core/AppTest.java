package com.accenture.core;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.accenture.calculate.impl.CalculateImpl;

import junit.framework.Assert;


@SuppressWarnings("deprecation")
@RunWith(MockitoJUnitRunner.class)
public class AppTest {

	@InjectMocks
	CalculateImpl calculate;
	
	@Before
	public void setupMock() throws Exception{
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testAdd(){
		BigDecimal x = new BigDecimal(150);
		BigDecimal y = new BigDecimal(100);
		BigDecimal res = calculate.add(x, y);
		Assert.assertEquals(new BigDecimal(250), res);
	}
	
	@Test
	public void testMultiply(){
		BigDecimal x = new BigDecimal(150);
		BigDecimal y = new BigDecimal(100);
		BigDecimal res = calculate.multiply(x, y);
		Assert.assertEquals(new BigDecimal(15000), res);
	}
	
	@Test
	public void testDivide(){
		BigDecimal x = new BigDecimal(150);
		BigDecimal y = new BigDecimal(100);
		String res = calculate.divide(x, y);
		Assert.assertEquals(new BigDecimal(1.5).toString(), res);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivideForException(){
		BigDecimal x = new BigDecimal(150);
		BigDecimal y = new BigDecimal(0);
		calculate.divide(x, y);
	}
}
