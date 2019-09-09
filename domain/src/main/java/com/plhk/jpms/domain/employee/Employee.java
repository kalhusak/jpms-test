package com.plhk.jpms.domain.employee;

import com.plhk.jpms.domain.Person;

public class Employee implements Person {

    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
