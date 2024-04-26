package com.techelevator.event;

public class GasCanLarge extends Pickup{
    private int fuelAmount;

    public GasCanLarge(int[] location){
        super("Large Gas Can", location);
        this.fuelAmount = 3;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }
}
