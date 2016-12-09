package com.spring.boot.mongo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.boot.mongo.entity.Employee;

@Controller
public class EmployeeController {
	
	public  Map<Long,Employee> empMap = new HashMap<Long,Employee>();
	
	@RequestMapping(value = "/employee")
	public String employee() {
		return "employee";
	}

	@RequestMapping(value = "/allEmployees", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> fetchEmployees() {
		System.out.println("Start ---- Inside fetchEmployees");

		List<Employee> emps = new ArrayList<Employee>();
		for (Map.Entry<Long, Employee> entry : empMap.entrySet()) {
			emps.add(entry.getValue());
		}
		System.out.println("End ----  fetchEmployees");

		return new ResponseEntity<List<Employee>>(emps, HttpStatus.OK);
	}

	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public ResponseEntity<Void> addEmployee(@RequestBody Employee employee) {
		System.out.println("Start ---- Inside addEmployee "+ employee.toString());
		
		empMap.put(employee.getEmpId(), employee);

		System.out.println("End ---- Inside addEmployee");
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@RequestMapping(value = "/deleteEmployee/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<List<Employee>> deleteEmployee(@PathVariable("id") Long id) {
		System.out.println("Start ---- Inside deleteEmployee" + id);
		List<Employee> emps = new ArrayList<Employee>();

		
		empMap.remove(id);
		for (Map.Entry<Long, Employee> entry : empMap.entrySet()) {
			emps.add(entry.getValue());
		}

		System.out.println("End ----- Inside deleteEmployee");

		return new ResponseEntity<List<Employee>>(emps, HttpStatus.OK);
	}

	@RequestMapping(value = "/modifyEmployee/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> modifyEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {

		System.out.println("Start ---- Inside modifyEmployee "+ employee.toString());
		empMap.put(id, employee);
		//repository.save(employee);d
		System.out.println("End ---- Inside modifyEmployee "+ employee.toString());

		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
