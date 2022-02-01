package com.example.reactandspringdataREST.payroll;

import com.example.reactandspringdataREST.payroll.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

}

