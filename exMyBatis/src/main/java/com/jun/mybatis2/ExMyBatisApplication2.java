package com.jun.mybatis2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class ExMyBatisApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(ExMyBatisApplication2.class, args);
	}

}
