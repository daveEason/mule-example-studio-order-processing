package com.mulesoft.demo.orderprocessing;

/**
 * Add a 20% discount to order.
 * 
 * @author Derek
 */
public class TwentyPercentDiscount {

	/**
	 * Calculate the discount.
	 * 
	 * @param summary
	 * @return
	 */
	public OrderSummary calculateDiscount(OrderSummary summary) {
		
		summary.setDiscountPercentage((float)20);
		summary.calculateDiscountedPrice();
		
		return summary;
	}
}
