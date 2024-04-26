package com.techelevator.event;

import com.techelevator.Game;

public abstract class Pickup implements GameEvent {
    private String name;
    private int[] location;
    private boolean hasBeenTriggered;

    public Pickup(String name, int[] location) {
        this.name = name;
        this.location = location;
        this.hasBeenTriggered = false;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void setLocation(int[] location) {
        this.location = location;
    }

    @Override
    public int[] getLocation() {
        return location;
    }

    @Override
    public boolean hasBeenTriggered() {
        return true;
    }
}
