package com.company;
public class VictorianChair implements Chair{ //Class about Victorian chair
    @Override
    public void hasLegs() {
        System.out.println("The Victorian Chair has 4 legs");
    }
    @Override
    public void sitOn() {
        System.out.println("Antique,Unique");
    }
}