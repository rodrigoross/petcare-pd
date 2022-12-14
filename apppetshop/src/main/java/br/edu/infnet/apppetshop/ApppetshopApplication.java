package br.edu.infnet.apppetshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApppetshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApppetshopApplication.class, args);
	}

}
