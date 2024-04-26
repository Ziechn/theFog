package com.techelevator.event;

public interface GameEvent {
    public void setName(String name);
    public void setLocation(int[] location);
    public int[] getLocation();
    public boolean hasBeenTriggered();
}
