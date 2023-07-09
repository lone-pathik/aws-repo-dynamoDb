package com.aws.crud.service;

import com.aws.crud.model.Employee;
import com.aws.crud.repository.AWSRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AWSServiceImpl implements AWSService {

    @Autowired
    AWSRepo awsRepo;


    @Override
    public Employee getEmployeeDetails(int id) {
        return awsRepo.getEmployeeDetails(id);
    }

    @Override
    public Boolean createEmployee(Employee employee) {
        return awsRepo.createNewStudent(employee);
    }
}
