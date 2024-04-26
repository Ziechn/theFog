package com.techelevator.event;

public class GasCanSmall extends Pickup{
    private int fuelAmount;

    public GasCanSmall(int[] location){
        super("Small Gas Can", location);
        this.fuelAmount = 1;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }
}
