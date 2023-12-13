package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.OrderRequest;
import com.example.model.Customer;
import com.example.repository.CustomerRepository;
import com.example.repository.ProductRepository;

@RestController
public class OrderController {
	
	@Autowired
	private CustomerRepository repository;
	
	@Autowired
	private ProductRepository productRepository;
	
	
	private static final Logger log = LoggerFactory.getLogger(OrderController.class);
	
	@PostMapping("/placeorder")
	public Customer palceorder(@RequestBody OrderRequest request) {
		log.info("Details :: "+request.getCustomer());
		return repository.save(request.getCustomer());
	}
	@GetMapping("/orders")
	public List<Customer> allcustomerdata(){
		log.info(" Indide  findAllOrdersWithCustomerDetails");
		return repository.findAll();
	} 
	@GetMapping("/yes")
	public String welcome() {
		return"  Welcome to One to Many Project ";
	}
	
}
