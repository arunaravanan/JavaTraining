package com.java.training.day3;

public class store {
	private int productid;
	private String productname;
	private  int Qty;
	
	/**
	 * @return the productid
	 */
	public int getProductid() {
		return productid;
	}

	/**
	 * @param productid the productid to set
	 */
	public void setProductid(int productid) {
		this.productid = productid;
	}

	/**
	 * @return the productname
	 */
	public String getProductname() {
		return productname;
	}

	/**
	 * @param productname the productname to set
	 */
	public void setProductname(String productname) {
		this.productname = productname;
	}

	/**
	 * @return the qty
	 */
	public int getQty() {
		return Qty;
	}

	/**
	 * @param qty the qty to set
	 */
	public void setQty(int qty) {
		Qty = qty;
	}

	@Override
	public String toString() {
		return "store [productid=" + productid + ", productname=" + productname + ", Qty=" + Qty + "]";
	}

}
