package com.systememployee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.systememployee.model.EmployeeDetails;
import com.systememployee.repo.EmployeeRepository;


@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	

	@Autowired
    EmployeeRepository repo;
	//list the employee
	@RequestMapping(value="/employee",method=RequestMethod.GET)
	public List<EmployeeDetails> getAllEmployeeDetails(){
		return repo.findAll();
	}
	
	  
	//list the employee by id
	@RequestMapping(value="/employee/{Id}",method=RequestMethod.GET)
	  public List<EmployeeDetails> getByEmployeeId(@PathVariable String employeeId) {
		return repo.findByEmployeeId(employeeId);
	  }
	


	  @RequestMapping(value="/emp",method=RequestMethod.POST)
	  public String addEmpDetails(@RequestBody EmployeeDetails employee) {
		  
		  repo.insert(employee);
		  return "employee added sucessfully";
		  
	  }

	  @RequestMapping(value="/emp/{id}",method=RequestMethod.PUT)
	  public String updateEmployeeDetails(@PathVariable String id, @RequestBody EmployeeDetails employee) {

		repo.save(employee);
		return "employee updated sucessfully";
	  }

	  @RequestMapping(value="/emp/{id}",method=RequestMethod.DELETE)
	  public String deleteEmployeeDetails(@PathVariable String id) {
	    repo.deleteById(id);
	    return "employee deletd sucessfully";
	  }

}
