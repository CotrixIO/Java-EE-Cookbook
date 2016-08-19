package io.cotrix.jeecookbook.springboot.service.impl;

import io.cotrix.jeecookbook.springboot.repository.EmployeeRepository;
import io.cotrix.jeecookbook.springboot.service.EmployeeService;
import io.cotrix.jeecookbook.springboot.service.command.CreateEmployeeCommand;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class EmployeeServiceDefaultImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    @Transactional
    public Long createEmployee(CreateEmployeeCommand command) {
        return null;
    }

    private void validateCreateEmployee(CreateEmployeeCommand command){
        if(command==null || StringUtils.isNotEmpty(command.getName()))


        // check if an employee already exists
        employeeRepository.findOneByName("Test");
    }

}
