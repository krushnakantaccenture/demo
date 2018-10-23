package com.accenture.core;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.accenture.calculate.Calculate;
import com.accenture.config.AppConfig;

public class App {
public static void main(String[] args) {
	    
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	    Calculate obj = (Calculate) context.getBean("calculate");
	    BigDecimal x = new BigDecimal(150);
	    BigDecimal y = new BigDecimal(100);
	    System.out.println(obj.add(x, y));
	    System.out.println(obj.multiply(x, y));
	    System.out.println(obj.divide(x, y));
	}
}
