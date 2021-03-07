package com.company;
public class Main {
    public static void main(String[] args) {
        System.out.println("Modern Chair Parameters:");
        Chair chair = new ModernChair();
        chair.hasLegs();
        chair.sitOn();
        System.out.println();
        System.out.println("Modern Coffee Table Parameters:");
        CoffeeTable coffeeTable = new ModernCoffeeTable();
        coffeeTable.hasLegs();
        coffeeTable.sitOn();
        System.out.println();
        System.out.println("Modern Sofa Parameters:");
        Sofa sofa = new ModernSofa();
        sofa.hasLegs();
        sofa.sitOn();
        System.out.println();
        System.out.println("Victorian Chair Parameters:");
        Chair chair1 = new VictorianChair();
        chair1.hasLegs();
        chair1.sitOn();
        System.out.println();
        System.out.println("Victorian Coffee Table Parameters:");
        CoffeeTable coffeeTable1 = new VictorianCoffeeTable();
        coffeeTable1.hasLegs();
        coffeeTable1.sitOn();
        System.out.println();
        System.out.println("Victorian Sofa Parameters:");
        Sofa sofa1 = new VictorianSofa();
        sofa1.hasLegs();
        sofa1.sitOn();
    }
}