package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MotorcycleTest {

    Vehicle motorcycle = new Motorcycle();

    @Test
    public void motorcycle_fuel_capacity(){
        // Arrange...
        int expected = 2;

        // Act...
        int actual = motorcycle.getFuelCapacity();

        // Assert...
        assertEquals(expected,actual);

        // Report...
        System.out.println("Expected fuel capacity: " + expected);
        System.out.println("Actual fuel capacity: " + actual);
    }

    @Test
    public void motorcycle_fuel_efficiency(){
        // Arrange...
        int expected = 4;

        // Act...
        int actual = motorcycle.getFuelEfficiency();

        // Assert...
        assertEquals(expected, actual);

        // Report...
        System.out.println("Expected fuel efficiency: " + expected);
        System.out.println("Actual fuel efficiency: " + actual);
    }

    @Test
    public void motorcycle_total_range(){
        // Arrange...
        float expected = 8;

        // Act....
        float actual = motorcycle.getRange();

        // Assert...
        assertEquals(expected,actual,0.01f);

        // Report...
        System.out.println("Expected range: " + expected);
        System.out.println("Actual range: " + actual);
    }

    @Test
    public void motorcycle_fuelLevel_after_moving_1_space(){
        // Arrange...
        float expected = 1.75f;

        // Act...
        motorcycle.setFuelLevel(1);
        float actual = motorcycle.getFuelLevel();

        // Assert...
        assertEquals(expected, actual,0.01f);

        // Report...
        System.out.println("Expected fuel level: " + expected);
        System.out.println("Actual fuel level: " + actual);
    }

    @Test
    public void motorcycle_range_after_moving_1_space() {
        // Arrange...
        float expected = 7.0f;

        // Act...
        motorcycle.setFuelLevel(1);
        float actual = motorcycle.getRange();

        // Assert...
        assertEquals(expected,actual,0.01f);

        // Report...
        System.out.println("Expected range: " + expected);
        System.out.println("Actual range: " + actual);
    }

    @Test
    public void motorcycle_range_after_moving_4_spaces() {
        // Arrange...
        float expected = 4.0f;

        // Act...
        motorcycle.setFuelLevel(4);
        float actual = motorcycle.getRange();

        // Assert...
        assertEquals(expected,actual,0.01f);

        // Report...
        System.out.println("Expected range: " + expected);
        System.out.println("Actual range: " + actual);
    }

    @Test
    public void motorcycle_fuelLevel_add_1_fuel_at_full_tank(){
        // Arrange...
        float expected = 2f;

        // Act...
        motorcycle.addFuel(1);
        float actual = motorcycle.getFuelLevel();

        // Assert...
        assertEquals(expected,actual,0.01f);

        // Report...
        System.out.println("Expected fuel level: " + expected);
        System.out.println("Actual fuel level: " + actual);
    }

    @Test
    public void motorcycle_fuelLevel_after_moving_5_spaces_and_1_point_refuel(){
        // Arrange...
        float expected = 1.75f;

        // Act...
        motorcycle.setFuelLevel(5);
        motorcycle.addFuel(1);
        float actual = motorcycle.getFuelLevel();

        // Assert...
        assertEquals(expected,actual,0.01f);

        // Report...
        System.out.println("Expected fuel level: " + expected);
        System.out.println("Actual fuel level: " + actual);
    }
}