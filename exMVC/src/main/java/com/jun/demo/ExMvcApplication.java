package com.jun.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.jun")
public class ExMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExMvcApplication.class, args);
	}

}
