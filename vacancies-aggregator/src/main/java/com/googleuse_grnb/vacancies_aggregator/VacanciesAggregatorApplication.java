package com.googleuse_grnb.vacancies_aggregator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class VacanciesAggregatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(VacanciesAggregatorApplication.class, args);
	}

}
