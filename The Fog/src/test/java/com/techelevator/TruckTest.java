package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.*;

public class TruckTest {

    Vehicle truck = new Truck();

    @Test
    public void truck_fuel_capacity(){
        // Arrange...
        int expected = 4;

        // Act...
        int actual = truck.getFuelCapacity();

        // Assert...
        assertEquals(expected,actual);

        // Report...
        System.out.println("Expected fuel capacity: " + expected);
        System.out.println("Actual fuel capacity: " + actual);
    }

    @Test
    public void truck_fuel_efficiency(){
        // Arrange...
        int expected = 1;

        // Act...
        int actual = truck.getFuelEfficiency();

        // Assert...
        assertEquals(expected, actual);

        // Report...
        System.out.println("Expected fuel efficiency: " + expected);
        System.out.println("Actual fuel efficiency: " + actual);
    }

    @Test
    public void truck_total_range(){
        // Arrange...
        float expected = 4;

        // Act....
        float actual = truck.getRange();

        // Assert...
        assertEquals(expected,actual,0.01f);

        // Report...
        System.out.println("Expected range: " + expected);
        System.out.println("Actual range: " + actual);
    }

    @Test
    public void truck_fuelLevel_after_moving_1_space(){
        // Arrange...
        float expected = 3.0f;

        // Act...
        truck.setFuelLevel(1);
        float actual = truck.getFuelLevel();

        // Assert...
        assertEquals(expected, actual,0.01f);

        // Report...
        System.out.println("Expected fuel level: " + expected);
        System.out.println("Actual fuel level: " + actual);
    }

    @Test
    public void truck_range_after_moving_1_space() {
        // Arrange...
        float expected = 3.0f;

        // Act...
        truck.setFuelLevel(1);
        float actual = truck.getRange();

        // Assert...
        assertEquals(expected,actual,0.01f);

        // Report...
        System.out.println("Expected range: " + expected);
        System.out.println("Actual range: " + actual);
    }

    @Test
    public void truck_range_after_moving_4_spaces() {
        // Arrange...
        float expected = 0.0f;

        // Act...
        truck.setFuelLevel(4);
        float actual = truck.getRange();

        // Assert...
        assertEquals(expected,actual,0.01f);

        // Report...
        System.out.println("Expected range: " + expected);
        System.out.println("Actual range: " + actual);
    }

    @Test
    public void truck_fuelLevel_add_1_fuel_at_full_tank(){
        // Arrange...
        float expected = 4.0f;

        // Act...
        truck.addFuel(1);
        float actual = truck.getFuelLevel();

        // Assert...
        assertEquals(expected,actual,0.01f);

        // Report...
        System.out.println("Expected fuel level: " + expected);
        System.out.println("Actual fuel level: " + actual);
    }

    @Test
    public void truck_fuelLevel_after_moving_4_spaces_and_1_point_refuel(){
        // Arrange...
        float expected = 1.0f;

        // Act...
        truck.setFuelLevel(4);
        truck.addFuel(1);
        float actual = truck.getFuelLevel();

        // Assert...
        assertEquals(expected,actual,0.01f);

        // Report...
        System.out.println("Expected fuel level: " + expected);
        System.out.println("Actual fuel level: " + actual);
    }
}