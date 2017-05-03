package com.lifetouch2.Rest;

import com.lifetouch2.Domain.Employee;
import com.lifetouch2.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Brandon.O'Donnell on 4/26/2017.
 */
@RestController
@RequestMapping("/api/employee")
public class EmployeeRest {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    private Employee getById(@PathVariable Integer id) {
        return employeeService.getOneById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    private Iterable<Employee> getAll() {
        return employeeService.getAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    private Employee saveOne(@RequestBody Employee employee) {
        return employeeService.saveOne(employee);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    private Iterable<Employee> saveMulti(@RequestBody Iterable<Employee> employees) {
        return employeeService.saveMany(employees);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    private boolean deleteOne(@PathVariable Integer id) {
        return employeeService.deleteById(id);
    }

}
