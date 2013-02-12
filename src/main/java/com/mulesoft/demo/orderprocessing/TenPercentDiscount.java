package com.mulesoft.demo.orderprocessing;

/**
 * Add a 10% discount to order.
 * 
 * @author Derek
 */
public class TenPercentDiscount {

	/**
	 * Calculate the discount.
	 * 
	 * @param summary
	 * @return
	 */
	public OrderSummary calculateDiscount(OrderSummary summary) {
		
		summary.setDiscountPercentage((float)10);
		summary.calculateDiscountedPrice();
		
		return summary;
	}
}
