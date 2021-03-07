package com.company;
public class ModernFurnitureFactory implements FurnitureFactory{ //Class about Modern Furniture Factory
    @Override
    public ModernChair createChair() {
        return new ModernChair();
    }
    @Override
    public ModernCoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
    @Override
    public ModernSofa createSofa() {
        return new ModernSofa();
    }
}