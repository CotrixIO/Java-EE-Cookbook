package io.cotrix.jeecookbook.springboot.controller;

import io.cotrix.jeecookbook.response.Response;
import io.cotrix.jeecookbook.springboot.service.EmployeeService;
import io.cotrix.jeecookbook.springboot.service.command.CreateEmployeeCommand;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @ApiOperation(value = "Finds the parameters orginally from the enquete", httpMethod = "GET")
    @RequestMapping(value = "/parameter", method = RequestMethod.GET, produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Response.class),
            @ApiResponse(code = 500, message = "Failure")
    })
    @ResponseBody
    public Response<Long> createEmployee(@RequestBody CreateEmployeeCommand command){
        Long employeeId = employeeService.createEmployee(command);
        return new Response<>(employeeId);
    }

}
