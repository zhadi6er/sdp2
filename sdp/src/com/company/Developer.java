package com.company;

import java.util.List;

public class Developer extends Employee implements Responsibility {
    public Developer(String name, String position, int age, List<Employee> members) {
        super(name, position, age, members);
    }

    @Override
    public void work() {
        System.out.println("Developer");
    }
}
