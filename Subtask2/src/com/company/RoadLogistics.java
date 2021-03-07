package com.company;
public class RoadLogistics extends Logistics{ //class RoadLogistics
    @Override
    public Transport createTransport(){
        return new Truck();
    }
}