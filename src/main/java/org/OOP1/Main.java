package org.OOP1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee managerSalary = new Manager();
        Employee manager = new Manager("manager", "Dariusz", "Kozak",
                                        LocalDate.of(2020, 10, 23));

        Manager.setBonus(500);

        System.out.println(manager.introduceEmployee());
        System.out.println("My experience is: " + manager.getExperience() + " years");
        System.out.println("My basic salary is: " + managerSalary.getBaseSalary());
        System.out.println("My monthly salary is: " + managerSalary.getMonthlySalary());


        Employee seller = new Seller("ticket seller", "Tadeusz", "Rydzyk",
                                        LocalDate.of(2022, 8, 16));
        Employee sellerSalary = new Seller();

        System.out.println(seller.introduceEmployee());
        System.out.println("My experience is: " + seller.getExperience() + " years");
        System.out.println("My monthly salary is: " + sellerSalary.getMonthlySalary());
    }
}