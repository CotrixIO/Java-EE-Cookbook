package io.cotrix.jeecookbook.springboot.repository.impl;


import io.cotrix.jeecookbook.springboot.domain.Address;
import io.cotrix.jeecookbook.springboot.domain.Department;
import io.cotrix.jeecookbook.springboot.domain.Employee;
import io.cotrix.jeecookbook.springboot.repository.EmployeeRepository;
import io.cotrix.jeecookbook.springboot.repository.mapper.EmployeeRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@PropertySource("sql/employee.sql")
public class EmployeeRepositoryJdbcImpl implements EmployeeRepository{

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Value("${findEmployeeById}")
    private String findEmployeeByIdSql;

    @Override
    public Employee findOneById(Long id) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("employeeId", id);
        return jdbcTemplate.queryForObject(findEmployeeByIdSql, parameters, new EmployeeRowMapper());
    }

    @Override
    public Employee findOneByName(String name) {
        return null;
    }

    @Override
    public Employee findOneByNameAndAddress(String name, Address address) {
        return null;
    }

    @Override
    public List<Employee> findByDepartment(Department department) {
        return null;
    }

    @Override
    public Long countByDepartment(Department department) {
        return null;
    }

    @Override
    public Map<Department, List<Employee>> findAndGroupByDepartment() {
        return null;
    }

    @Override
    public void updateByAddress(Employee employee, Address address) {

    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void updateNameById(String name, Long id) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Long insert(Employee employee) {
        return null;
    }
}
