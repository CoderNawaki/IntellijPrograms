package com.example.demo;
import com.example.demo.Customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HarderApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(HarderApplication.class,args);
		Customer c = context.getBean(Customer.class);
		c.display();
	}

}
