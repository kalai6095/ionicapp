package com.server.ionicapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.server.ionicapp.beer")
@EnableJpaRepositories
public class IonicappApplication {

	public static void main(String[] args) {
		SpringApplication.run(IonicappApplication.class, args);
	}
}
