package com.kollu.EurekaServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	private static Logger logger = LoggerFactory.getLogger(EurekaServerApplication.class);
	
	public static void main(String[] args) {
		System.out.println("Console:: EurekaServerApplication i am from bank module");
		logger.info("EurekaServerApplication i am from bank module");
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
