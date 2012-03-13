package org.ordermgmt;

/**
 * An item in an order.
 * 
 * @author Derek
 */
public class OrderItem {

	/** Item number */
	private String productId;

	/** Item name */
	private String name;

	/** Item listPrice */
	private float listPrice;

	/** Item quantity */
	private int quantity;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getListPrice() {
		return listPrice;
	}

	public void setListPrice(float listPrice) {
		this.listPrice = listPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}