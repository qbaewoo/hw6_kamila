package com.company;
public class Main {
    public static void main(String[] args) {
        Logistics a = new RoadLogistics();
        a.planDelivery();
        Logistics b = new SeaLogistics();
        b.planDelivery();
    }
}