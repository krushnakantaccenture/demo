package com.accenture.calculate.impl;

import java.math.BigDecimal;

import com.accenture.calculate.Calculate;

public class CalculateImpl implements Calculate{

	public BigDecimal add(BigDecimal x, BigDecimal y) {
		return x.add(y);
	}

	public BigDecimal multiply(BigDecimal x, BigDecimal y) {
		return x.multiply(y);
	}

	public String divide(BigDecimal x, BigDecimal y) {
		if(y.equals(BigDecimal.ZERO)){
			throw new ArithmeticException();
		}
		else{
			return x.divide(y).toString();
		}
	}
}
