package io.cotrix.jeecookbook.springboot;

import io.cotrix.jeecookbook.springboot.domain.Employee;
import io.cotrix.jeecookbook.springboot.repository.impl.EmployeeRepositoryJPA;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import spock.lang.Specification;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("unittest")
public class EmployeeJPAIntegrationTest extends Specification {

    @Autowired
    private EmployeeRepositoryJPA employeeRepository;

    @Test
    public void testBlabla(){

    }

    public void  setup(){
        Employee employee = new Employee();
        employeeRepository.insert(employee);
    }

}