package com.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.entity.EmployeeEntity;
import com.mvc.service.imple.EmployeeService;

@Controller
@RequestMapping("/api/registrations")
@CrossOrigin
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public ResponseEntity<EmployeeEntity> createRegistration(@RequestBody EmployeeEntity entity) {
        EmployeeEntity savedEntity = service.createRegistration(entity);
        return new ResponseEntity<>(savedEntity, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeEntity> getRegistrationById(@PathVariable Integer id) {
        EmployeeEntity registration = service.getRegistrationById(id);
        if (registration != null) {
            return new ResponseEntity<>(registration, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<EmployeeEntity>> getAllRegistrations() {
        List<EmployeeEntity> registrations = service.getAllRegistrations();
        return new ResponseEntity<>(registrations, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeEntity> updateRegistration(@PathVariable Integer id, @RequestBody EmployeeEntity registration) {
        EmployeeEntity updatedRegistration = service.updateRegistration(id, registration);
        if (updatedRegistration != null) {
            return new ResponseEntity<>(updatedRegistration, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRegistration(@PathVariable Integer id) {
        service.deleteRegistration(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
