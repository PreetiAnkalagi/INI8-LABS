package com.mvc.service.imple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.entity.EmployeeEntity;
import com.mvc.repository.EmployeeRepository;
import com.mvc.service.EmpServiceInterface;

@Service
public class EmployeeService implements EmpServiceInterface {

    @Autowired
    private EmployeeRepository repo;

    @Override
    public EmployeeEntity createRegistration(EmployeeEntity register) {
        return repo.save(register);
    }

    @Override
    public EmployeeEntity getRegistrationById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<EmployeeEntity> getAllRegistrations() {
        return repo.findAll();
    }

    @Override
    public EmployeeEntity updateRegistration(Integer id, EmployeeEntity register) {
        Optional<EmployeeEntity> existingRegistration = repo.findById(id);
        if (existingRegistration.isPresent()) {
            EmployeeEntity reg = existingRegistration.get();
            reg.setName(register.getName());
            reg.setEmail(register.getEmail());
            reg.setDateOfBirth(register.getDateOfBirth());
            reg.setPhone(register.getPhone());
            return repo.save(reg);
        } else {
            return null;
        }
    }

    @Override
    public void deleteRegistration(Integer id) {
        repo.deleteById(id);
    }
}
