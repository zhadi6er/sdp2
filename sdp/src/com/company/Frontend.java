package com.company;

import java.util.List;

public class Frontend extends Employee implements Responsibility {
    public Frontend(String name, String position, int age, List<Employee> employees) {
        super(name, position, age, employees);
    }

    @Override
    public void work() {
        System.out.println("Front-end");
    }
}
