package com.lifetouch2.Repository;

import com.lifetouch2.Domain.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Brandon.O'Donnell on 4/26/2017.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
