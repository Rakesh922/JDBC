package com.gl.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.gl.springboot.service"})
@EnableAutoConfiguration(exclude= {ErrorMvcAutoConfiguration.class})
@SpringBootApplication
public class SpringbootRestapiMysqlJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestapiMysqlJpaApplication.class, args);
		System.out.println("Welcome to Spring Boot");
	}
}
