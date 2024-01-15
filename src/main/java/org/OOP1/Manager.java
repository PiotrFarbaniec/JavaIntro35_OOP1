package org.OOP1;

import java.time.LocalDate;

public class Manager extends Employee {
    private static int bonus;
    private int salary;

    public Manager() {
        super();
        this.salary = 5000;
    }

    public Manager(String position, String name, String surname,LocalDate employmentDate) {
        super(position, name, surname, employmentDate);
    }

    static void setBonus(int salaryBonus) {
        Manager.bonus = salaryBonus;
    }

    @Override
    public int getBaseSalary() {
        return this.salary;
    }

    @Override
    public int getMonthlySalary() {
        return getBaseSalary() + getBonus();
    }

    private int getBonus() {
        return bonus;
    }
}
