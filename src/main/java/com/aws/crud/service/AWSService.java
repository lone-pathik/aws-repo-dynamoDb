package com.aws.crud.service;

import com.aws.crud.model.Employee;

public interface AWSService {

    Employee getEmployeeDetails(int id);
    Boolean createEmployee(Employee employee);
}
