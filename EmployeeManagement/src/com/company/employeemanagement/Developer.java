package com.company.employeemanagement;

public class Developer extends Employee implements Work {
    public Developer(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is writing code.");
    }

    @Override
    public void displayDetails() {
        System.out.println("Developer: " + name + " (ID: " + id + ")");
    }
}