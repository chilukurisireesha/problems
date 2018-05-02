package com.sireesha.tutorial;

import java.text.DecimalFormat;

public class CalculateDollarAmt {
	
	
	public String calculateAmt(Integer quantity, Double pricePerPiece)
	{
		DecimalFormat df = new DecimalFormat("####0.00");
		
		return String.format("Price is $ %s", df.format(quantity*pricePerPiece));
	}

}
