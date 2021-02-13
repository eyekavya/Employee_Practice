package com.example;
import com.example.domain.Employee;

public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setEmpId(101);
        emp.setEmpName("Jane Smith");
        emp.setEmpSSN("012-43-4567");
        emp.setEmpSalary(120345.27);

        System.out.println("Employee ID:     " + emp.getEmpId());
        System.out.println("Employee Name:      " + emp.getEmpName());
        System.out.println("Employee SSN:       " + emp.getEmpSSN());
        System.out.println("Employee Salary:       " + emp.getEmpSalary());


    }

}
