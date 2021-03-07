package com.company;
public class ModernChair implements Chair{ //Class about Modern chair
    @Override
    public void hasLegs() {
        System.out.println("The Modern Chair has 4 legs");
    }
    @Override
    public void sitOn() {

        System.out.println("Modern,Beautiful,Comfortable");
    }
}