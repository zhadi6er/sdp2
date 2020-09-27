package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Developer developer = new Developer("John", "Android Developer", 24, employees);
        Tester tester = new Tester("Eva", "iOS Developer", 21, employees);

        Project project = new Project(tester);
        project.addEmployee(developer);
        project.addEmployee(tester);
        project.printEmployees();
        tester.work();
        project.removeEmployee(tester);
    }
}
