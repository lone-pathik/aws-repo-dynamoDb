package com.aws.crud.controller;

import com.aws.crud.model.Employee;
import com.aws.crud.service.AWSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/v1/api")
public class AWSCrudController {

    @Autowired
    AWSService awsService;

    @GetMapping(value="/fetch-employee-details")
    public ResponseEntity<Employee> getEmployeeDetails(@RequestParam int id){

        Employee emp = awsService.getEmployeeDetails(id);
        return new ResponseEntity<Employee>(emp, HttpStatus.OK);
    }

    @PostMapping(value="/create-employee")
    public ResponseEntity<Boolean> getEmployeeDetails(@RequestBody Employee employee){

        Boolean status = awsService.createEmployee(employee);
        return new ResponseEntity<Boolean>(status, HttpStatus.OK);
    }
}
