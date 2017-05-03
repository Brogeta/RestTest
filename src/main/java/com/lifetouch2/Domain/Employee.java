package com.lifetouch2.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Brandon.O'Donnell on 4/26/2017.
 */
@Entity
public class Employee {

    @Id
    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private String gender;

    public Employee() {
    }

    public Employee(Integer id, String firstName, String lastName, String email, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
