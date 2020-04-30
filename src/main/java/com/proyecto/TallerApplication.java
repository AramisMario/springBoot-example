package com.proyecto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan("com.models")
@ComponentScan("com.controllers")
@ComponentScan("com.services")
@ComponentScan("com.dao.interfaces")
@ComponentScan("com.dao.implementations")
@SpringBootApplication
public class TallerApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(TallerApplication.class, args);

	}

}
