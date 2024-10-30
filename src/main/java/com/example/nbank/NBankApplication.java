package com.example.nbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class NBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(NBankApplication.class, args);
	}

}
