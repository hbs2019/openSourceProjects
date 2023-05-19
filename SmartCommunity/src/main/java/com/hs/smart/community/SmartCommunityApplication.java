package com.hs.smart.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import xyz.erupt.core.annotation.EruptScan;

@EntityScan
@EruptScan
@SpringBootApplication
public class SmartCommunityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartCommunityApplication.class, args);
	}

}
