package com.company;

import java.util.List;

public class Employee {
    private String name;
    private String position;
    private int age;
    private List<Employee> employees;

    public Employee(String name, String position, int age, List<Employee> employees) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "name " + name
                + " age " + age
                + " position " + position;
    }
}
