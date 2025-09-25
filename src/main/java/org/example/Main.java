package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Adam", LocalDate.of(1998, 12,11), 25000);
        Employee employee2 = new Employee("Adam", LocalDate.of(1998, 12,11), 25000);
        Employee employee3 = new Employee("Adam", LocalDate.of(1998, 12,11), 25000);
        Employee employee4 = new Employee("Adam", LocalDate.of(1998, 12,11), 25000);
        Customer customer1 = new Customer("Bertil", LocalDate.of(1999, 6, 12));
        Product product = new Product("Hammare");


        employee1.introducePerson();
        employee2.introducePerson();
        employee3.introducePerson();
        employee4.introducePerson();

        System.out.println("This is written in master/main branch");




    }
}