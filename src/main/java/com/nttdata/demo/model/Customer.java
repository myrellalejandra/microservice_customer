package com.nttdata.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document(collection = "Customers")
@RequiredArgsConstructor 
@AllArgsConstructor
@Data

public class Customer {
		
	@Id
	private String id;
	private String name;
	private String lastname;
	private String type;
	private String email;
	private Long phone;

	

	
}
