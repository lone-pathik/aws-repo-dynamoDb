package com.aws.crud.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.Data;

@Data
@DynamoDBTable(tableName = "employee")
public class Employee {

    @DynamoDBHashKey(attributeName = "employeeId")
    private String employeeId;
    @DynamoDBAttribute
    private String name;
    @DynamoDBAttribute
    private String manager;
    @DynamoDBAttribute
    private String doj;
    @DynamoDBAttribute
    private String department;
}
