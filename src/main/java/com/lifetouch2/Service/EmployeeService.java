package com.lifetouch2.Service;

import com.lifetouch2.Domain.Employee;

/**
 * Created by Brandon.O'Donnell on 4/26/2017.
 */
public interface EmployeeService {

    Employee getOneById(Integer id);

    Iterable<Employee> getAll();

    Employee saveOne(Employee employee);

    Iterable<Employee> saveMany(Iterable<Employee> employees);

    boolean deleteById(Integer id);
}
