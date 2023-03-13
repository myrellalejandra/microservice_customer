 package com.nttdata.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.demo.model.Customer;
import com.nttdata.demo.repository.CustomerRepository;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor 
@AllArgsConstructor
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public void save(Customer customer) {
		customerRepository.save(customer);
	}
	
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
	public Optional<Customer> findById(String id) {
		return customerRepository.findById(id);
	}
	
	public void deleteById(String id) {
		customerRepository.deleteById(id);
	}
}
