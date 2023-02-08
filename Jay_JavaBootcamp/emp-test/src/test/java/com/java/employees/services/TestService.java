package com.java.employees.services;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.java.employees.dao.EmployeeRepository;
import com.java.employees.model.Employee;

@ExtendWith(MockitoExtension.class)
public class TestService {
	
	@InjectMocks
	EmployeeService employeeService;
	
	@Mock
	EmployeeRepository repository;
	
	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	void testFindEmp() {
		List<Employee> list = new ArrayList<Employee>();
		Employee one = new Employee("john", "john");
		Employee two = new Employee("same", "same");
		Employee three = new Employee("alena", "alena");
		list.add(one);
		list.add(two);
		list.add(three);
		
		Mockito.when(repository.findAll()).thenReturn(list);
		
		List<Employee> emplist = employeeService.findAll();
		Mockito.verify(repository, Mockito.times(1)).findAll();
		
	}
	
	@Test
	void testCreateAndSave() {
		Employee one = new Employee("john", "john");
		employeeService.save(one);
		Mockito.verify(repository, Mockito.times(1)).save(one);
		
	}
	
	@Test
	void testCreateAndDelete() {
		
		Employee one = new Employee("john", "john");
		Employee two = new Employee("same", "same");
		Employee three = new Employee("alena", "alena");
		one.setId(1);
		two.setId(2);
		three.setId(3);
		repository.save(one);
		repository.save(two);
		repository.save(three);
		
		repository.deleteById(1);
		Mockito.verify(repository, Mockito.times(1)).deleteById(1);
	}
	
}
