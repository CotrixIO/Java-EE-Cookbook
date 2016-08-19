package io.cotrix.jeecookbook.springboot;

import io.cotrix.jeecookbook.springboot.repository.impl.EmployeeRepositoryJPAImpl;
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
    private EmployeeRepositoryJPAImpl employeeRepository;

    @Test
    public void testBlabla(){

    }

}