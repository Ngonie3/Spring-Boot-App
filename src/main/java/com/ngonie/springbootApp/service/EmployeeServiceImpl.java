/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngonie.springbootApp.service;

import com.ngonie.springbootApp.model.Employee;
import com.ngonie.springbootApp.repository.EmployeeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ngoni
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{
    
    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Override
    public List<Employee> getAllEmployees() {
        //To change body of generated methods, choose Tools | Templates.
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
         //To change body of generated methods, choose Tools | Templates.\
         this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEployeeById(long id) {
        //To change body of generated methods, choose Tools | Templates.
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee = null;
        if(optional.isPresent()){
            employee = optional.get();
        }
        else{
            throw new RuntimeException("Employee not found for id ::" +id);
        }
        return employee; 
    }

    @Override
    public void deleteEmployeeById(long id) {
       //To change body of generated methods, choose Tools | Templates.
       this.employeeRepository.deleteById(id);
    }
    
}
