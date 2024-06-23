package com.samarth.videocall;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service) {
		return args -> {
			service.register(User.builder()
					.username("Samarth")
					.email("sam@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("Rahul")
					.email("rahul@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("karan")
					.email("karan@mail.com")
					.password("aaa")
					.build());
		};
	}

}
