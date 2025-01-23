package com.example.test;

import com.example.employee.controller.EmployeeController;
import com.example.employee.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeController controller = (EmployeeController) context.getBean("employeeController");

        // Add an employee
        controller.addNewEmployee(new Employee(10, "Tara", "Sell",152000 ));

        // Display all employees
        controller.displayAllEmployees();

//        // Update an employee
        controller.updateEmployee(new Employee(9, "Atanu", "Director", 180000));

//        // Delete an employee
        controller.deleteEmployee(5);
    }
}
