package com.yash.product.model;

public class Vendor {
	private int vendorId;
	private String vendorName;
	private City city;
	
	
	public Vendor() {
		// TODO Auto-generated constructor stub
	}
	
	public Vendor(int vendorId, String vendorName, City city) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.city = city;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	@Override
	public int hashCode() {
		return vendorId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendor other = (Vendor) obj;
		if (vendorId != other.vendorId)
			return false;
		if (vendorName == null) {
			if (other.vendorName != null)
				return false;
		} else if (!vendorName.equals(other.vendorName))
			return false;
		return true;
	}





	
}
