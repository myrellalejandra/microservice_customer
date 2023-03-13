package com.nttdata.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.demo.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String>{


}
