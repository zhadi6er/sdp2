package com.company;

public class Project {
    private final Employee employee;

    public Project(Employee employee) {
        this.employee = employee;
    }

    public void addEmployee(Employee employee) {
        employee.getEmployees().add(employee);
    }

    public void removeEmployee(Employee employee) {
        employee.getEmployees().remove(employee);
    }

    public void printEmployees() {
        for (Employee employee : this.employee.getEmployees()) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }
}
