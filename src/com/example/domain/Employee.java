package com.example.domain;

public class Employee {

//
    public int EmpId;
    public String EmpName;
    public String EmpSSN;
    public double EmpSalary;

    public Employee() {

    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getEmpSSN() {
        return EmpSSN;
    }

    public void setEmpSSN(String empSSN) {
        EmpSSN = empSSN;
    }

    public double getEmpSalary() {
        return EmpSalary;
    }

    public void setEmpSalary(double empSalary) {
        EmpSalary = empSalary;
    }
}
