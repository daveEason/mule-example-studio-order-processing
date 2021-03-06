package com.mulesoft.demo.orderprocessing;

/**
 * Add a 30% discount to order.
 * 
 * @author Derek
 */
public class ThirtyPercentDiscount {

	/**
	 * Calculate the discount.
	 * 
	 * @param summary
	 * @return
	 */
	public OrderSummary calculateDiscount(OrderSummary summary) {

		summary.setDiscountPercentage((float)30);
		summary.calculateDiscountedPrice();
		
		return summary;
	}
}
