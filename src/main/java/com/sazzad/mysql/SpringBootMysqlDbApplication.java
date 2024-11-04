package com.sazzad.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootMysqlDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMysqlDbApplication.class, args);
	}

}
