package com.sireesha.tutorial;

import java.text.DecimalFormat;

public class CalculateDollarAmt {
	
	
	/**
	 * This method takes quantity and price per piece and calculates
	 * the total amount
	 * @param quantity
	 * @param pricePerPiece
	 * @return
	 */
	public String calculateAmt(Integer quantity, Double pricePerPiece)
	{
		DecimalFormat df = new DecimalFormat("####0.00");
		
		return String.format("Price is $ %s", df.format(quantity*pricePerPiece));
	}

}
