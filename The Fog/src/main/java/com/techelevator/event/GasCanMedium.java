package com.techelevator.event;

public class GasCanMedium extends Pickup {
    private int fuelAmount;

    public GasCanMedium(int[] location){
        super("Medium Gas Can", location);
        this.fuelAmount = 2;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }
}
