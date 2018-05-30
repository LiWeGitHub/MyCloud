package com.lw.myeurake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyeurakeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyeurakeApplication.class, args);
	}
}
