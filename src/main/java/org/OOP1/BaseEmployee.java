package org.OOP1;

import java.time.LocalDate;

abstract class BaseEmployee {
    private String position;
    private String name;
    private String surname;
    private LocalDate employmentDate;


    public BaseEmployee(String position, String name, String surname, LocalDate employmentDate) {
        this.position = position;
        this.name = name;
        this.surname = surname;
        this.employmentDate =employmentDate;
    }
    protected String introduceEmployee() {
        return "Hello, my name is: " + name + " " + surname + ", I'm a " + position;
    }

    protected LocalDate getEmploymentDate() {
        return employmentDate;
    }

    protected int getExperience() {
        return LocalDate.now().compareTo(getEmploymentDate());
    }

    public abstract int claculateMonthlySalary();

    public abstract int getBaseSalary();

}
