package com.yash.product.model;

public class Product  {
	private int productId;
	private String productName;
	private Vendor vendor;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, Vendor vendor) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.vendor = vendor;
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
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	@Override
	public int hashCode() {
	return productId;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		
		return true;
	}
	
	
}
