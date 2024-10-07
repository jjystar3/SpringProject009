package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing //JPA 리스너 기능 활성화 시키기
public class Project007Application {

	public static void main(String[] args) {
		SpringApplication.run(Project007Application.class, args);
	}

}
