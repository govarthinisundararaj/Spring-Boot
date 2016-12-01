package com.spring.boot.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.boot.mongo.entity.Employee;
import com.spring.boot.mongo.repository.EmployeeMongoRespository;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeMongoRespository repository;
	
	@RequestMapping(value = "/employee")
	public String employee() {
		return "employee";
	}

	@RequestMapping(value = "/allEmployees", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> fetchEmployees() {
		System.out.println("Start ---- Inside fetchEmployees");

		List<Employee> emps = repository.findAll();

		System.out.println("End ----  fetchEmployees");

		return new ResponseEntity<List<Employee>>(emps, HttpStatus.OK);
	}

	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public ResponseEntity<Void> addEmployee(@RequestBody Employee employee) {
		System.out.println("Start ---- Inside addEmployee "+ employee.toString());
		
		repository.save(employee);

		System.out.println("End ---- Inside addEmployee");
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@RequestMapping(value = "/deleteEmployee/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<List<Employee>> deleteEmployee(@PathVariable("id") Long id) {
		System.out.println("Start ---- Inside deleteEmployee" + id);
		List<Employee> emps = null;

		Long noOfDocuments = repository.deleteByEmpId(id);
		
		System.out.println(noOfDocuments + " Documents deleted");
		emps = repository.findAll();

		System.out.println("End ----- Inside deleteEmployee");

		return new ResponseEntity<List<Employee>>(emps, HttpStatus.OK);
	}

	@RequestMapping(value = "/modifyEmployee/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> modifyEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {

		System.out.println("Start ---- Inside modifyEmployee "+ employee.toString());
		
		repository.save(employee);
		System.out.println("End ---- Inside modifyEmployee "+ employee.toString());

		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
