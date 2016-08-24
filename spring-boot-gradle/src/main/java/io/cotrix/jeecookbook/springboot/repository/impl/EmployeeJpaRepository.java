package io.cotrix.jeecookbook.springboot.repository.impl;

import io.cotrix.jeecookbook.springboot.domain.Address;
import io.cotrix.jeecookbook.springboot.domain.Department;
import io.cotrix.jeecookbook.springboot.domain.Employee;
import io.cotrix.jeecookbook.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeJpaRepository implements EmployeeRepository{

    @Autowired
    private EntityManager entityManager;

    @Override
    public Employee findOneById(Long id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public Employee findOneByName(String name) {
        TypedQuery<Employee> query = entityManager.createNamedQuery("Employee.findByName", Employee.class);
        query.setParameter("name",name);
        return query.getSingleResult();
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
        entityManager.persist(employee);
        return new Long(0);
    }
}
