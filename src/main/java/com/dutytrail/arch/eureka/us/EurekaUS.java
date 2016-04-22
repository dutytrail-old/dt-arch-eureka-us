package com.dutytrail.arch.eureka.us;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaUS {

	public static void main(String[] args) {
		SpringApplication.run(EurekaUS.class, args);
	}

}
