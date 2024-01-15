package org.OOP1;

import java.time.LocalDate;

public class Seller extends BaseEmployee {

    private final int salary = 3000;


    public Seller(String position, String name, String surname, LocalDate employmentDate) {
        super(position, name, surname, employmentDate);
    }

    @Override
    public int getBaseSalary() {
        return this.salary;
    }

     @Override
    public int claculateMonthlySalary() {
        return getBaseSalary();
    }
}
