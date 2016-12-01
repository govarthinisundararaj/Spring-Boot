package com.spring.boot.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.boot.mongo.entity.Employee;

public interface EmployeeMongoRespository extends MongoRepository<Employee, String> {

	Long deleteByEmpId(Long empId);
}
