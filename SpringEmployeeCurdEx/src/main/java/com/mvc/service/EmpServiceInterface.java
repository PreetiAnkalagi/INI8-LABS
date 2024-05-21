package com.mvc.service;

import java.util.List;

import com.mvc.entity.EmployeeEntity;

public interface EmpServiceInterface {
	EmployeeEntity createRegistration(EmployeeEntity register);
	
	EmployeeEntity getRegistrationById(Integer id);
	
    List<EmployeeEntity> getAllRegistrations();
    
    EmployeeEntity updateRegistration(Integer id, EmployeeEntity register);
    
    void deleteRegistration(Integer id);

}
