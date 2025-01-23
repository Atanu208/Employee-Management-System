package com.example.employee.controller;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;

import java.util.List;

public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    public void displayAllEmployees() {
        List<Employee> employees = employeeService.fetchAllEmployees();
        employees.forEach(System.out::println);
    }
    public void addNewEmployee(Employee employee) {
        employeeService.addEmployee(employee);
        System.out.println("Employee added: " + employee);
    }
    public void updateEmployee(Employee employee) {
        employeeService.updateEmployee(employee);
        System.out.println("Employee updated: " + employee);
    }
    public void deleteEmployee(int id) {
        employeeService.deleteEmployee(id);
        System.out.println("Employee with ID " + id + " deleted.");
    }
}
