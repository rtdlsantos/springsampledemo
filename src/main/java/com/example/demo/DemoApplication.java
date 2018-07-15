package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(Table1Repository repository) {
		return (args) -> {
			// repository.save(new Table1(2L, new Timestamp((new java.util.Date()).getTime())));

			log.info("-------------------------------");
			for (Table1 table1 : repository.findAll()) {
				log.info(table1.toString());
			}
			log.info("");

			log.info("");
		};
	}
}
