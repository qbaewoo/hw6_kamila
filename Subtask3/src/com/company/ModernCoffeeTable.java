package com.company;
public class ModernCoffeeTable implements CoffeeTable{ // Class about Modern coffee table
    @Override
    public void hasLegs() {
        System.out.println("The Modern CoffeeTable has 4 legs");
    }
    @Override
    public void sitOn() {
        System.out.println("Modern,Beautiful,Comfortable");
    }
}