package com.aws.crud.repository;

import com.aws.crud.model.Employee;

public interface AWSRepo {
    Employee getEmployeeDetails(int id);
    Boolean createNewStudent(Employee dto);
}
