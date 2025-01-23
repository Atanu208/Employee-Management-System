package com.example.employee.service;

import com.example.employee.dao.EmployeeDAO;
import com.example.employee.model.Employee;
import java.util.List;

public class EmployeeService {
    private final EmployeeDAO employeeDAO;

    public EmployeeService(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
    public void addEmployee(Employee employee) {
        employeeDAO.addEmployee(employee);
    }
    public List<Employee> fetchAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
    public void updateEmployee(Employee employee) {
        employeeDAO.updateEmployee(employee);
    }
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
    }
}
