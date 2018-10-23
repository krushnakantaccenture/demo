package com.accenture.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.accenture.calculate.Calculate;
import com.accenture.calculate.impl.CalculateImpl;

@Configuration
public class AppConfig {
	@Bean(name="calculate")
	public Calculate calculate(){
		return new CalculateImpl();
	}
}
