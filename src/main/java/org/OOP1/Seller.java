package org.OOP1;

import java.time.LocalDate;

public class Seller extends Employee {

    public Seller(String position, String name, String surname, int salary, LocalDate employmentDate) {
        super(position, name, surname, salary, employmentDate);
    }

    @Override
    public int getBaseSalary() {
        return getSalary();
    }

     @Override
    public int getMonthlySalary() {
        return getSalary();
    }
}
