package com.cg.eis.exception;

public class your_Main_Class {
    public static void main(String[] args) {
        try {
            validateSalary(750);  
        } catch (employee_Exception e) {
            System.out.println(e.getMessage());
           
        }
    }

    private static void validateSalary(double salary) throws employee_Exception {
        if (salary < 3000) {
            throw new employee_Exception("Salary cannot be below 3000");
        }
        // Continue with processing if salary is valid
    }
}