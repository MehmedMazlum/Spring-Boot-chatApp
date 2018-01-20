package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class DemoGui1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoGui1Application.class, args);
	}
}
