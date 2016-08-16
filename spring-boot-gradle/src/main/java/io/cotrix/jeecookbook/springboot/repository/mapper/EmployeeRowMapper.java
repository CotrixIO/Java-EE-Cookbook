package io.cotrix.jeecookbook.springboot.repository.mapper;


import io.cotrix.jeecookbook.springboot.domain.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setId(rs.getLong("ID"));
        employee.setName(rs.getString("NAME"));
        return employee;
    }

}
