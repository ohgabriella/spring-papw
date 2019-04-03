package br.unipe.papw.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackages = {"br.unipe.papw.config"})
public class PersonApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(PersonApplication.class, args);
	}
}
