package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	private int pId;
	private String productName;
	private String productDesc;
	private double price;
	private int qty;

	
	public Product() {
		
	}


	public Product(int pId, String productName, String productDesc, double price, int qty) {
		super();
		this.pId = pId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.price = price;
		this.qty = qty;
	}


	public int getpId() {
		return pId;
	}


	public void setpId(int pId) {
		this.pId = pId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductDesc() {
		return productDesc;
	}


	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	@Override
	public String toString() {
		return "Product [pId=" + pId + ", productName=" + productName + ", productDesc=" + productDesc + ", price="
				+ price + ", qty=" + qty + "]";
	}
	
}
