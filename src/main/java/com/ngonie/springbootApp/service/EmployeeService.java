/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngonie.springbootApp.service;

import com.ngonie.springbootApp.model.Employee;
import java.util.List;

/**
 *
 * @author ngoni
 */
public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
     Employee getEployeeById(long id);
     void deleteEmployeeById(long id);
}
