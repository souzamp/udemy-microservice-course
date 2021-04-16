package com.mircroservice.hrconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import jdk.jfr.Enabled;

@EnableConfigServer
@SpringBootApplication
public class HrConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrConfigServerApplication.class, args);
	}

}
