package com.company.employeemanagement;

public class EmployeeService {
    public void performEmployeeDuties(Work worker) {
        worker.performDuties();
    }
    
    public void performSecurityCheck(SecurityClearance security) {
        security.checkSecurity();
    }
}