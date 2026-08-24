package com.collection.framework.ecom;

public class Ecommerce implements Comparable<Ecommerce>
{
	private String prodId;
	private String prodName;
	private double price;
	private String status;
	
	
	public Ecommerce(String prodId, String prodName, double price, String status) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.status = status;
	}
	
	@Override
	public int hashCode() {
	
		return this.prodId.hashCode();
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
	 Ecommerce prod = (Ecommerce) obj;
	 return this.prodId.equals(prod.prodId) & this.prodName.equals(prod.prodName) & this.status.equals(prod.status) & this.price == prod.price;
		
	}

	@Override
	public int compareTo(Ecommerce o) {
		
		return Double.compare(this.price, o.price);
		
	}
	 
	@Override
	public String toString() {
		
		return "Product Id: " + prodId + ", Product Name: " + prodName +  ", Product price: " + price + ", Product Status: " + status;
		
	}
	
}
