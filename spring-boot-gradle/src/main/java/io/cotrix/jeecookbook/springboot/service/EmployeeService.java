package io.cotrix.jeecookbook.springboot.service;


import io.cotrix.jeecookbook.springboot.service.command.CreateEmployeeCommand;

public interface EmployeeService {

    Long createEmployee(CreateEmployeeCommand command);

}
