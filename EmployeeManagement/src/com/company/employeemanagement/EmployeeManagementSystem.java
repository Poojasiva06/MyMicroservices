package com.company.employeemanagement;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee manager = new Manager("Pooja S", 101);
        Employee developer = new Developer("Shanmu", 102);
        Employee guard = new SecurityGuard("Shailu", 103);

        EmployeeService service = new EmployeeService();
        
        manager.displayDetails();
        service.performEmployeeDuties((Work) manager);

        developer.displayDetails();
        service.performEmployeeDuties((Work) developer);

        guard.displayDetails();
        service.performSecurityCheck((SecurityClearance) guard);
    }
}