package org.OOP1;

import java.time.LocalDate;

abstract class Employee {
    private String position;
    private String name;
    private String surname;
    private int salary;
    private LocalDate employmentDate;

    public Employee() {
    }

    public Employee(String position, String name, String surname, LocalDate employmentDate) {
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

    public abstract int getMonthlySalary();

    public abstract int getBaseSalary();

}
