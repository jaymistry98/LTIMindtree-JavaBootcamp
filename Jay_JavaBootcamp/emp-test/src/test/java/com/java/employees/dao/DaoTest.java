package com.java.employees.dao;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.java.employees.model.Employee;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace =AutoConfigureTestDatabase.Replace.NONE)
public class DaoTest {

	@Autowired
	EmployeeRepository employeeRepository;
	@Test
	public void testCreateAndDelete() {
		Employee em= new Employee("suresh", "gupta");
		employeeRepository.save(em);
		
		Iterable<Employee> employees= employeeRepository.findAll();
		Assertions.assertThat(employees).extracting(Employee :: getFirstName).containsOnly("suresh");
		
		employeeRepository.deleteAll();
		Assertions.assertThat(employeeRepository.findAll()).isEmpty();
		
		
		
		
	}
}
