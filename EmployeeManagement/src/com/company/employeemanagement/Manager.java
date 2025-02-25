package com.company.employeemanagement;
//open-closed
public class Manager extends Employee implements Work {
    public Manager(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is managing the team.");
    }

    @Override
    public void displayDetails() {
        System.out.println("Manager: " + name + " (ID: " + id + ")");
    }
}