package com.company;
public class House { //class House
    private int windows;
    private int doors;
    private int rooms;
    private boolean hasGarage;
    private boolean hasSwimPool;
    private boolean hasStatues;
    private boolean hasGarden; public static class Builder{ //static class Builder
        private int windows;
        private int doors;
        private int rooms;
        private boolean hasGarage;
        private boolean hasSwimPool;
        private boolean hasStatues;
        private boolean hasGarden;
        public Builder(int windows,int doors,int rooms) { //Builder constructor
            this.windows = windows;
            this.doors = doors;
            this.rooms = rooms;
        }

        public Builder Garage(boolean hasGarage){ //Garage constructor
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder SwimPool(boolean hasSwimPool){ // Swimming Pool constructor
            this.hasSwimPool = hasSwimPool;
            return this;
        }

        public Builder Statues(boolean hasStatues){ // Statues constructor
            this.hasStatues = hasStatues;
            return this;
        }

        public Builder Garden(boolean hasGarden) { // Garden constructor
            this.hasGarden = hasGarden; return this;
        }

        public House build(){
            House house = new House();
            house.windows = this.windows;
            house.doors = this.doors;
            house.rooms = this.rooms;
            house.hasGarage = this.hasGarage;
            house.hasSwimPool = this.hasSwimPool;
            house.hasStatues = this.hasStatues;
            house.hasGarden = this.hasGarden;
            return house;
        }
    }
    @Override
    public String toString() {
        return "House(" + "Amount of windows=" + windows + ", Amount of doors=" + doors + ", Amount of rooms=" + rooms + ", Is there a Garage=" + hasGarage + ", Is there a Swimming Pool=" + hasSwimPool + ", Is there a Statues=" + hasStatues + ", Is there a Garden=" + hasGarden +')';
    }
}
