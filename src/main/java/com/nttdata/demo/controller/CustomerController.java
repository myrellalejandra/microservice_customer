package com.nttdata.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.demo.model.Customer;
import com.nttdata.demo.service.CustomerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/postCustomer")
	public void save(@RequestBody Customer customer) {
		customerService.save(customer);
	}
	
	@GetMapping("/getCustomer")
	public List<Customer> findAll(){
		return customerService.findAll();
	}
	
	@GetMapping("/finByIdCustomer/{id}")
	public Customer findById(@PathVariable String id){
		return customerService.findById(id).get();
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public void deleteById(@PathVariable String id){
		customerService.deleteById(id);
	}
	
	@PutMapping("/updateCustomer")
	public void update(@RequestBody Customer customer){
		 customerService.save(customer);
	}
	
}
