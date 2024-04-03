package com.techelevator.vehicles;

public abstract class Vehicle {
    private String name;
    private String difficulty;
    private int fuelCapacity;
    private int fuelEfficiency;
    private float fuelLevel;
    private float range;
    private int retreatMoves;

    public Vehicle(String name, String difficulty, int fuelCapacity, int fuelEfficiency, int retreatMoves) {
        this.name = name;
        this.difficulty = difficulty;
        this.fuelCapacity = fuelCapacity;
        this.fuelEfficiency = fuelEfficiency;
        this.retreatMoves = retreatMoves;
        this.fuelLevel = fuelCapacity;
        this.range = fuelCapacity * fuelCapacity;
    }

    public String getName() {
        return name;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getFuelEfficiency() {
        return fuelEfficiency;
    }

    public float getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int distance) {
        float fuelCost = (float)distance / fuelEfficiency;
        this.fuelLevel -= fuelCost;
    }

    public void addFuel(int fuel) {
        this.fuelLevel += fuel;
        if (this.fuelLevel > fuelCapacity) {
            this.fuelLevel = fuelCapacity;
        }
    }

    public float getRange() {
        this.range = fuelLevel * fuelEfficiency;
        return range;
    }

    public int getRetreatMoves() {
        return retreatMoves;
    }
}
