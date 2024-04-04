package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Map {

    private List<int[]> visitedLocations;

    public Map(){
        this.visitedLocations = new ArrayList<>();
    }

    public void addCoordinates(int yPosition, int xPosition){
        int[] coordinates = {yPosition, xPosition};
        visitedLocations.add(coordinates);
    }

    public int getListSize(){
        return visitedLocations.size();
    }

    public void printList(){
        System.out.println("Visited locations: ");
        int count = 1;
        for (int[] intArray : visitedLocations){
            System.out.println("Coordinate " + count + ": " + intArray[0] + ", " +intArray[1]);
            count++;
        }
    }
}
