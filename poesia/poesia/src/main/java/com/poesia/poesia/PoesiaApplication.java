package com.poesia.poesia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

// Aquí está el truco: le decimos "exclude" para que NO active la seguridad (el login)
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class PoesiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoesiaApplication.class, args);
	}

}