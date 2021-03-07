package com.company;
public class Main {
    public static void main(String[] args) {
        House house1 = new House.Builder(2,4,2)
                .Garage(true)
                .build();
        System.out.println(house1);
        System.out.println();
        House house2 = new House.Builder(2,4,2)
                .Garage(true)
                .SwimPool(true)
                .Statues(true)
                .Garden(true)
                .build();
        System.out.println(house2);
    }
}