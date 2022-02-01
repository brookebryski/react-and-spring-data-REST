package com.example.reactandspringdataREST.payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// https://spring.io/guides/tutorials/react-and-spring-data-rest/

@SpringBootApplication
public class ReactAndSpringDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactAndSpringDataRestApplication.class, args);
	}

}
// localhost:8080/api
// localhost:8080/api/employees

// Part 1 Review:
//
//In this section:
//
//You defined a domain object and a corresponding repository.
//
//You let Spring Data REST export it with full-blown hypermedia controls.
//
//You created two simple React components in a parent-child relationship.
//
//You fetched server data and rendered them in as a simple, static HTML structure.