package io.cotrix.jeecookbook.springboot.service.command;


import org.hibernate.validator.constraints.NotEmpty;

public class CreateEmployeeCommand {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
