package com.company;

import java.util.List;

public class Backend extends Employee implements Responsibility {
    public Backend(String name, String position, int age, List<Employee> employees) {
        super(name, position, age, employees);
    }

    @Override
    public void work() {
        System.out.println("Back-end");
    }
}
