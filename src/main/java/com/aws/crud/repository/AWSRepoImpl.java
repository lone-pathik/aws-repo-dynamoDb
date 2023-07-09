package com.aws.crud.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.aws.crud.config.DynamoDBConfig;
import com.aws.crud.model.Employee;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AWSRepoImpl implements AWSRepo {

    private final DynamoDBMapper dynamoDBMapper;
    private final DynamoDBConfig dynamoDbConfig;

    @Autowired
    public AWSRepoImpl(DynamoDBMapper dynamoDBMapper, DynamoDBConfig dynamoDbConfig) {
        this.dynamoDBMapper = dynamoDBMapper;
        this.dynamoDbConfig = dynamoDbConfig;
    }

    @Override
    public Employee getEmployeeDetails(int id) {
        Employee emp ;


        return null;
    }

    public Boolean createNewStudent(Employee employee) {

        //Employee employee = new Employee();

        try {
            dynamoDBMapper.save(employee);
        }catch (Exception e){
            e.printStackTrace();
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }
}
