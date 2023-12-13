package com.example.dto;

import com.example.model.Customer;

public class OrderRequest {

	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public OrderRequest(Customer customer) {
		super();
		this.customer = customer;
	}

	public OrderRequest() {
		super();
	}

	@Override
	public String toString() {
		return "OrderRequest [customer=" + customer + "]";
	}
	
	
	
}
