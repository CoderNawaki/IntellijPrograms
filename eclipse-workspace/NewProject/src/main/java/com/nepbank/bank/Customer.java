package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
	@id
	@GenerateValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;

//getter and setter


}
