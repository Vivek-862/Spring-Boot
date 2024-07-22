package com.springboot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		// System.out.println("hello world");
		System.out.println(MyController.myMethod());
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
