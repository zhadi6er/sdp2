package com.company;

import java.util.List;

public class Tester extends Employee implements Responsibility {
    public Tester(String name, String position, int age, List<Employee> employees) {
        super(name, position, age, employees);
    }

    @Override
    public void work() {
        System.out.println("Tester");
    }
}
