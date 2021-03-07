package com.company;
public class VictorianCoffeeTable implements
        CoffeeTable{ //Class about Victorian coffee table
    @Override
    public void hasLegs() {
        System.out.println("The Victorian CoffeeTable has 4 legs");
    }
    @Override
    public void sitOn() {
        System.out.println("Antique,Unique");
    }
}