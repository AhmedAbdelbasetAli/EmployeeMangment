package com.alifirstproject.employeesystemapi.services;

import java.util.List;

import com.alifirstproject.employeesystemapi.model.Employee;



public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    
}
