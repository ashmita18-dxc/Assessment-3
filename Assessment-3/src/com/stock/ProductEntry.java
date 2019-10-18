package com.stock;

public class ProductEntry {
	int productId;	
	String productName;
	int quantity;
	float totalPrice;
	
	ProductEntry(int a, String b, int c, float d){
		this.productId=a;
		this.productName=b;
		this.quantity=c;
		this.totalPrice=d;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}

