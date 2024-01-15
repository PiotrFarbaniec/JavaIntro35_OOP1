package org.OOP1;

import java.time.LocalDate;

public class Seller extends Employee {

    private int salary;

    public Seller() {
        super();
        this.salary = 3000;
    }

    public Seller(String position, String name, String surname, LocalDate employmentDate) {
        super(position, name, surname, employmentDate);
    }

    @Override
    public int getBaseSalary() {
        return this.salary;
    }

     @Override
    public int getMonthlySalary() {
        return getBaseSalary();
    }
}
