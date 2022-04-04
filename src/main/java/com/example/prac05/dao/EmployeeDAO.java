package com.example.prac05.dao;

import com.example.prac05.model.EmployeeModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeDAO extends MongoRepository<EmployeeModel, Long> {

}
