package com.borisk58.caseaggregatorbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CaseAggregatorApplication {

	public static void main(String[] args) {
		ClassLoader classLoader = CaseAggregatorApplication.class.getClassLoader();
		boolean fileExists = classLoader.getResource("application.properties") != null;

		SpringApplication.run(CaseAggregatorApplication.class, args);
	}

}
