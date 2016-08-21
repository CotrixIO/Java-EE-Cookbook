package io.cotrix.jeecookbook.springboot.controller;

import io.cotrix.jeecookbook.springboot.service.EmployeeService;
import io.cotrix.jeecookbook.springboot.service.command.CreateEmployeeCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public void createEmployee(@RequestBody CreateEmployeeCommand command){
        employeeService.createEmployee(command);
    }

}
