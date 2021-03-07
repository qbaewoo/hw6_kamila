package com.company;
public class SeaLogistics extends Logistics{ //class SeaLogistics
    @Override
    public Transport createTransport(){
        return new Ship();
    }
}