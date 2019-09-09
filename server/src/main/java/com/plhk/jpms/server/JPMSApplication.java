package com.plhk.jpms.server;

import com.plhk.jpms.domain.employee.Employee;
import com.plhk.jpms.domain.user.User;
import com.plhk.jpms.repository.employee.EmployeeRepository;
import com.plhk.jpms.repository.user.UserRepository;

import java.util.List;

public class JPMSApplication {

    public static void main(String[] args) {

        // USER
        UserRepository userRepository = new UserRepository();
        User user64 = userRepository.findById(64);
        System.out.println("Founded user: " + user64.getName());
        List<User> allUsers = userRepository.findAll();
        System.out.println("All users:");
        allUsers.forEach(user -> System.out.println("\tFounded user: " + user.getName()));


        // EMPLOYEE
        EmployeeRepository employeeRepository = new EmployeeRepository();
        Employee employee34 = employeeRepository.findById(34);
        System.out.println("Founded employee: " + employee34.getName());
        List<Employee> allEmployees = employeeRepository.findAll();
        System.out.println("All employees:");
        allEmployees.forEach(user -> System.out.println("\tFounded employee: " + user.getName()));
    }
}
