package io.cotrix.jeecookbook.samples;


import io.cotrix.jeecookbook.samples.spring.Address;
import io.cotrix.jeecookbook.samples.spring.Department;
import io.cotrix.jeecookbook.samples.spring.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeRepository {

    Employee findOneById(Long id);

    Employee findOneByName(String name);

    Employee findOneByNameAndAddress(String name, Address address);

    List<Employee> findByDepartment(Department department);

    Long countByDepartment(Department department);

    /**
     * Finds all employees and groups them by department.
     *
     * @return a map that contains the department and all employees in that department
     */
    Map<Department, List<Employee>> findAndGroupByDepartment();

    void updateByAddress(Employee employee, Address address);

    void update(Employee employee);

    void updateNameById(String name, Long id);

    void deleteById(Long id);

    Long insert(Employee employee);

}
