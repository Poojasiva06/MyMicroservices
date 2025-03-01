package com.company.employeemanagement;
//liskov 
public class SecurityGuard extends Employee implements SecurityClearance {
    public SecurityGuard(String name, int id) {
        super(name, id);
    }

    @Override
    public void checkSecurity() {
        System.out.println(name + " is checking security.");
    }

    @Override
    public void displayDetails() {
        System.out.println("Security Guard: " + name + " (ID: " + id + ")");
    }
}
