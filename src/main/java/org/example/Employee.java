package org.example;

import java.time.LocalDate;

public class Employee extends Person {
    private static int nextEmployeeId = 0;
    private int employeeId;
    private int salary;

    public Employee(String name, LocalDate dateOfBirth, int salary) {
        super(name, dateOfBirth);
        this.employeeId = nextEmployeeId;
        ++nextEmployeeId;
        this.salary = salary;
        secret = 13;
        System.out.println("En employee har skapats.");

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void introducePerson() {
        System.out.println(this.employeeId + ", " + this.getName() + ", " + this.getDateOfBirth());
    }
}
