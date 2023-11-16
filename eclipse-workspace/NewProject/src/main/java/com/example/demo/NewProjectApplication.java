package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewProjectApplication.class, args);
	}


CommandLineRunner.run()throws Exception{

	System.out.println("printing the data for commandLineRunner");

	for(int i =0; i<10; i++){
		String data = "sample data" +i;
		System.out.printlln(data);

	}
}
}
