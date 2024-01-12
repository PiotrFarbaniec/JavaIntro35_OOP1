package org.OOP1;

import java.time.LocalDate;

public class Manager extends Employee {
    private static int bonus;


    public Manager(String position, String name, String surname, int salary, LocalDate employmentDate) {
        super(position, name, surname, salary, employmentDate);
    }

    static void setBonus(int salaryBonus) {
        Manager.bonus = salaryBonus;
    }

    @Override
    public int getBaseSalary() {
        return getSalary()+2000;
    }

    @Override
    public int getMonthlySalary() {
        return getBaseSalary() + getBonus();
    }

    private int getBonus() {
    return bonus;
    }
}
