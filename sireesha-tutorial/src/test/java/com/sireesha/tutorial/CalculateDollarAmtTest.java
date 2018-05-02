package com.sireesha.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateDollarAmtTest {

	CalculateDollarAmt cda = new CalculateDollarAmt();
	@Test
	public void testCalculateAmt() throws Exception {
		String value = cda.calculateAmt(10,20.67);
		
		assertEquals("Price is $ 206.70",value);
		
	}

}
