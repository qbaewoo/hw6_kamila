package com.company;
public class VictorianFurnitureFactory implements FurnitureFactory{ //Class about Victorian Furniture Factory
    @Override
    public VictorianChair createChair() {
        return new VictorianChair(); }
    @Override
    public VictorianCoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
    @Override
    public VictorianSofa createSofa() {
        return new VictorianSofa();
    }
}
