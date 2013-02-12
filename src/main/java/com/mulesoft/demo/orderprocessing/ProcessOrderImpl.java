package com.mulesoft.demo.orderprocessing;

import javax.jws.WebService;

/**
 * Implementation for order processing.
 * 
 * @author Derek
 */
@WebService(endpointInterface = "com.mulesoft.demo.orderprocessing.IProcessOrder", serviceName = "ProcessOrder")
public class ProcessOrderImpl implements IProcessOrder {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ordermgmt.IProcessOrder#processOrder(org.ordermgmt.Order)
	 */
	public OrderSummary processOrder(Order order) {
		int itemCount = 0;
		float totalListPrice = 0.0f;
		for (OrderItem item : order.getItems()) {
			for (int x = 0; x < item.getQuantity(); x++) {
				itemCount++;
				totalListPrice += item.getListPrice();
			}
		}

		OrderSummary summary = new OrderSummary();
		summary.setOrderId(order.getOrderId());
		summary.setItemCount(itemCount);
		summary.setTotalListPrice(totalListPrice);
		return summary;
	}
}