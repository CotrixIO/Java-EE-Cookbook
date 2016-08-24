package io.cotrix.jeecookbook.springboot.domain;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE", schema = "MYAPP", uniqueConstraints = {@UniqueConstraint(columnNames = {"EMPLOYEE_ID"})})
public class Employee {

    @Id
    @Column(name = "EMPLOYEE_ID", unique = true, nullable = false)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
