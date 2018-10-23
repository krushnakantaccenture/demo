package com.accenture.calculate;

import java.math.BigDecimal;

public interface Calculate {
	public BigDecimal add(BigDecimal x, BigDecimal y);
	public BigDecimal multiply(BigDecimal x, BigDecimal y);
	public String divide(BigDecimal x, BigDecimal y);
}
