package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car car  = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car,bicycle,boat};

        for(Vehicle x: racers){
            x.go();
        }
    }
}
