package io.cotrix.jeecookbook.springboot.service.impl;

import io.cotrix.jeecookbook.exceptions.BusinessException;
import io.cotrix.jeecookbook.springboot.domain.Employee;
import io.cotrix.jeecookbook.springboot.enumeration.EmployeeServiceError;
import io.cotrix.jeecookbook.springboot.enumeration.ServiceError;
import io.cotrix.jeecookbook.springboot.repository.EmployeeRepository;
import io.cotrix.jeecookbook.springboot.service.EmployeeService;
import io.cotrix.jeecookbook.springboot.service.command.CreateEmployeeCommand;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeDefaultService implements EmployeeService {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeDefaultService.class);

    @Autowired
    @Qualifier(value = "employeeJpaRepository")
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public Long createEmployee(CreateEmployeeCommand command) {
        validateCreateEmployee(command);
        Employee employee = new Employee();
        employee.setName(command.getName());
        Long employeeId =  employeeRepository.insert(employee);
        logger.info("Create employee with primary key {} for command {}",employeeId, command);
        return employeeId;
    }

    private void validateCreateEmployee(CreateEmployeeCommand command) {
        if(command == null){
            throw new BusinessException(ServiceError.NULL_INPUT, "Create employee with null input given");
        }

        if (StringUtils.isNotEmpty(command.getName())) {
            throw new BusinessException(EmployeeServiceError.EMPLOYEE_NAME_MADATORY,
                    "No employee name was given for create employee command {}",command);
        }

        // check if an employee already exists
        Employee employee = employeeRepository.findOneByName("Test");
        if (employee != null) {
            throw new BusinessException(EmployeeServiceError.EMPLOYEE_EXISTS,
                    "The employee with name {} already exists",
                    command.getName());
        }
    }

}
