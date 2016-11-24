package com.mongoboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author hungrymind
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.mongoboot" })
public class MongoBootAppliaction{

	public static void main(String[] args) {
		SpringApplication.run(MongoBootAppliaction.class, args);
	}
}

