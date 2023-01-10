package com.systememployee.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.systememployee.model.EmployeeDetails;
import com.systememployee.repo.EmployeeRepository;


@Service
public class EmployeeService {
@Autowired
     public EmployeeRepository EmployeeDetailsRepo;
	private String employeeId;
	
	public Boolean addEmployee(EmployeeDetails employee) {
		EmployeeDetailsRepo.insert(employee);
		return true;
		}

	public List<EmployeeDetails> getAllEmployee() {
		
		return EmployeeDetailsRepo.findAll();
	}

	public List<EmployeeDetails> getAllEmpByEmployee(String employeeId) 
	{
		return EmployeeDetailsRepo.findByEmployeeId(employeeId);
	}

	public boolean deleteEmployee(String employeeId) {
		EmployeeDetailsRepo.deleteById(employeeId);
		return true;
		
	}

	public String updateEmployee(EmployeeDetails employee) {
		// TODO Auto-generated method stub
		EmployeeDetailsRepo.save(employee);
		return "employee UPdated Successfully";
	}

	public List<EmployeeDetails> findAll() {
		
		 return EmployeeDetailsRepo.findAll();
	}

	public Optional<EmployeeDetails> findById(String id) {
		EmployeeDetailsRepo.findById(employeeId);
		return null;
	}

	/*
	 * public void updateCropByFarmer(String cropId, CropModel crop) {
	 * cropRepository.
	 * 
	 * }
	 */
	
	
	
}
