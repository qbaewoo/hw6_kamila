package com.company;
public class ModernSofa implements Sofa{ //Class about Modern Sofa
    @Override
    public void hasLegs() {
        System.out.println("The Modern Sofa has 4 legs");
    }
    @Override
    public void sitOn() {

        System.out.println("Modern,Beautiful,Comfortable");
    }
}