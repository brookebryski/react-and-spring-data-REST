package com.example.reactandspringdataREST.payroll;

import com.example.reactandspringdataREST.payroll.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}

