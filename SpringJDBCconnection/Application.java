package com.java.springboot.SpringJDBCconnection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories ("com.java.springboot.SpringJDBCconnection")
//@EntityScan("com.java.springboot.SpringJDBCconnection")
//@ComponentScan("com.java.springboot.SpringJDBCconnection")
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);

	}
}
