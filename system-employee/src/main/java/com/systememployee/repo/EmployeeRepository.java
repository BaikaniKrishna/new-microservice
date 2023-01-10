
package com.systememployee.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.systememployee.model.EmployeeDetails;

public interface EmployeeRepository extends MongoRepository<EmployeeDetails, String>{
	
	List<EmployeeDetails> findByEmployeeId(String employeeId);
   
}
