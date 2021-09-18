package com.example.spring_crud_api_nguyenvanhung.service;

import com.example.spring_crud_api_nguyenvanhung.entity.Employee;
import com.example.spring_crud_api_nguyenvanhung.error.EmployeeNotFoundException;

import java.util.List;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(Long id) throws EmployeeNotFoundException;
    public void deleteById(Long id);
    public Employee updateEmployeeById(Long id,Employee employee);

}