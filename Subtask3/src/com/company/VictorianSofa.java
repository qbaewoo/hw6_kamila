package com.company;
public class VictorianSofa implements Sofa{ //Class about Victorian sofa
    @Override
    public void hasLegs() {
        System.out.println("The Victorian Sofa has 4 legs");
    }
    @Override
    public void sitOn() {
        System.out.println("Antique,Unique");
    }
}
