package com.kollu.EurekaServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	private static Logger logger = LoggerFactory.getLogger(EurekaServerApplication.class);
	
	public static void main(String[] args) {
		System.out.println("Console:: EurekaServerApplication i am from bank module");
		logger.info("EurekaServerApplication i am from bank module");
		SpringApplication.run(EurekaServerApplication.class, args);
	}
	
/*Distributed Tracing/Zipkin*/
	
	/*@Bean
	public Sampler defaultSampler() {
		System.out.println("Console:: EurekaServerApplication - defaultSampler method");
		logger.info("EurekaServerApplication - defaultSampler method");
	    return Sampler.ALWAYS_SAMPLE;
	}*/
}
