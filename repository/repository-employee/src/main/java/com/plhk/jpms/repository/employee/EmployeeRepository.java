package com.plhk.jpms.repository.employee;

import com.plhk.jpms.domain.employee.Employee;
import com.plhk.jpms.repository.core.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeRepository implements Repository<Employee> {

    @Override
    public Employee findById(long id) {
        return fakeEmployeeGenerator(id);
    }

    @Override
    public List<Employee> findAll() {
        return Stream
                .generate(() -> fakeEmployeeGenerator((long) (Math.random() * 100)))
                .limit(5)
                .collect(Collectors.toList());
    }

    private Employee fakeEmployeeGenerator(long id) {
        return new Employee("Employee-" + id);
    }
}
