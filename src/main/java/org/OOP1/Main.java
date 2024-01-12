package org.OOP1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("manager", "Dariusz", "Kozak",
                            3000, LocalDate.of(2020, 10, 23));
        Manager.setBonus(500);

        System.out.println(manager.introduceEmployee());
        System.out.println("My experience is: " + manager.getExperience() + " years");
        System.out.println("My basic salary is: " + manager.getBaseSalary());
        System.out.println("My monthly salary is: " + manager.getMonthlySalary());


        Employee seller = new Seller("ticket seller", "Tadeusz", "Rydzyk",
                            3000, LocalDate.of(2022, 8, 16));

        System.out.println(seller.introduceEmployee());
        System.out.println("My experience is: " + seller.getExperience() + " years");
        System.out.println("My monthly salary is: " + seller.getMonthlySalary());
    }
}