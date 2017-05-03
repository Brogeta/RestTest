package com.lifetouch2.Service.Impl;

import com.lifetouch2.Domain.Employee;
import com.lifetouch2.Repository.EmployeeRepository;
import com.lifetouch2.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Brandon.O'Donnell on 4/26/2017.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee getOneById(Integer id) {
        return employeeRepository.findOne(id);
    }

    @Override
    public Iterable<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveOne(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Iterable<Employee> saveMany(Iterable<Employee> employees) {
        return employeeRepository.save(employees);
    }

    @Override
    public boolean deleteById(Integer id) {
        boolean request = false;

        try{
            employeeRepository.delete(id);
            request = true;
        }catch (Exception e){
            //
        }

        return request;
    }
}
