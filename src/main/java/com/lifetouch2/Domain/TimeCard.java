package com.lifetouch2.Domain;

import org.hibernate.annotations.ValueGenerationType;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by Brandon.O'Donnell on 4/26/2017.
 */
@Entity
public class TimeCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private LocalDate day;

    private LocalTime clockIn;

    private LocalTime clockOut;

    @ManyToOne
    private Employee employee;

    private Integer wigets;


    public TimeCard() {
    }

    public TimeCard( Employee employee, LocalDate day, LocalTime clockIn, LocalTime clockOut, Integer wigets) {
        this.day = day;
        this.clockIn = clockIn;
        this.clockOut = clockOut;
        this.employee = employee;
        this.wigets = wigets;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDay() {
        return day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    public LocalTime getClockIn() {
        return clockIn;
    }

    public void setClockIn(LocalTime clockIn) {
        this.clockIn = clockIn;
    }

    public LocalTime getClockOut() {
        return clockOut;
    }

    public void setClockOut(LocalTime clockOut) {
        this.clockOut = clockOut;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getWigets() {
        return wigets;
    }

    public void setWigets(Integer wigets) {
        this.wigets = wigets;
    }
}
