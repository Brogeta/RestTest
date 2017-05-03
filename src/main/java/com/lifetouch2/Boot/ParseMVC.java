package com.lifetouch2.Boot;

import com.lifetouch2.Domain.Employee;
import com.lifetouch2.Domain.TimeCard;
import com.lifetouch2.Service.EmployeeService;
import com.lifetouch2.Service.TimeCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brandon.O'Donnell on 4/26/2017.
 */
@Component
public class ParseMVC implements ApplicationListener<ContextRefreshedEvent>{

    @Autowired
    EmployeeService employeeService;

    @Autowired
    TimeCardService timeCardService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        parseEmployee();
        parseTimeCard();
    }

    private void parseEmployee() {

        List<Employee> employees = new ArrayList<>();
        String split = ",";
        String hold = "";
        String[] data = null;
        try {
            BufferedReader buffer = new BufferedReader(new FileReader("C:\\Users\\brandon.o'donnell\\Desktop\\mis\\CSV\\Employee.csv"));

            buffer.readLine();

            while((hold=buffer.readLine()) != null) {
                data= hold.split(split);

                employees.add(new Employee(Integer.parseInt(data[0]), data[1], data[2], data[3], data[4]));
            }
        }catch (IOException io) {
            //
        }

        employeeService.saveMany(employees);
    }

    private void parseTimeCard() {
        List<TimeCard> timeCards = new ArrayList<>();
        String split = ",";
        String hold = "";
        String[] data = null;

        DateTimeFormatter dateFormater =DateTimeFormatter.ofPattern("M/d/yyyy");
        DateTimeFormatter timeFormater =DateTimeFormatter.ofPattern("H:mm");


        try {
            BufferedReader buffer = new BufferedReader(new FileReader("C:\\Users\\brandon.o'donnell\\Desktop\\mis\\CSV\\TimeCard.csv"));

            buffer.readLine();

            while((hold=buffer.readLine()) != null) {
                data = hold.split(split);

                timeCards.add(new TimeCard(employeeService.getOneById(Integer.parseInt(data[0])), LocalDate.parse(data[1],dateFormater),
                        LocalTime.parse(data[2],timeFormater), LocalTime.parse(data[3], timeFormater), Integer.parseInt(data[4])));
            }
        }catch (IOException io) {
            //
        }

        timeCardService.saveMany(timeCards);
    }
}
