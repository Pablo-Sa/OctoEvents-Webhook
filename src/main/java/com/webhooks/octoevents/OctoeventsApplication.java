package com.webhooks.octoevents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AutoConfigurationPackage
public class OctoeventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OctoeventsApplication.class, args);
	}

}
