package org.OOP1;

import java.time.LocalDate;

abstract class Employee {
    private String position;
    private String name;
    private String surname;
    private int salary;
    private LocalDate employmentDate;

    public Employee(String position, String name, String surname, int salary, LocalDate employmentDate) {
        this.position = position;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.employmentDate =employmentDate;
    }
    protected String introduceEmployee() {
        return "Hello, my name is: " + name + " " + surname + ", I'm a " + position;
    }


    protected int getSalary() {
        return salary;
    }

    protected LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public int getExperience() {
        return LocalDate.now().compareTo(getEmploymentDate());
    }

    public abstract int getMonthlySalary();

    public abstract int getBaseSalary();

}
