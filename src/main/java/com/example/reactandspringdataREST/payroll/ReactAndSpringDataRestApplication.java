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

// Part 2:
//	    GET: Fetches the state of a resource without altering the system
//
//		POST: Creates a new resource without saying where
//
//		PUT: Replaces an existing resource, overwriting whatever else (if anything) is already there
//
//		DELETE: Removes an existing resource
//
//		PATCH: Alters an existing resource (partially rather than creating a new resource)

// Part 2 Review:

//In this section:
//
//	You turned on Spring Data REST’s paging feature.
//
//	You threw out hardcoded URI paths and started using the root URI combined with relationship names or “rels”.
//
//	You updated the UI to dynamically use page-based hypermedia controls.
//
//	You added the ability to create & delete employees and update the UI as needed.
//
//	You made it possible to change the page size and have the UI flexibly respond.