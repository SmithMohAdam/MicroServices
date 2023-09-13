package com.mohammed.moviecatalogeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MovieCatalogeServiceApplication {

	@Bean
	public RestTemplate getRestTemplat(){
		return new RestTemplate();
	}
	@Bean
	public WebClient.Builder getWebClintBuilder(){
		return WebClient.builder();
	}

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogeServiceApplication.class, args);
	}

}
