package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    Vehicle car = new Car();

    @Test
    public void car_fuel_capacity(){
        // Arrange...
        int expected = 3;

        // Act...
        int actual = car.getFuelCapacity();

        // Assert...
        assertEquals(expected,actual);

        // Report...
        System.out.println("Expected fuel capacity: " + expected);
        System.out.println("Actual fuel capacity: " + actual);
    }

    @Test
    public void car_fuel_efficiency(){
        // Arrange...
        int expected = 2;

        // Act...
        int actual = car.getFuelEfficiency();

        // Assert...
        assertEquals(expected, actual);

        // Report...
        System.out.println("Expected fuel efficiency: " + expected);
        System.out.println("Actual fuel efficiency: " + actual);
    }

    @Test
    public void car_total_range(){
        // Arrange...
        float expected = 6;

        // Act....
        float actual = car.getRange();

        // Assert...
        assertEquals(expected,actual,0.01f);

        // Report...
        System.out.println("Expected range: " + expected);
        System.out.println("Actual range: " + actual);
    }

    @Test
    public void car_fuelLevel_after_moving_1_space(){
        // Arrange...
        float expected = 2.5f;

        // Act...
        car.setFuelLevel(1);
        float actual = car.getFuelLevel();

        // Assert...
        assertEquals(expected, actual,0.01f);

        // Report...
        System.out.println("Expected fuel level: " + expected);
        System.out.println("Actual fuel level: " + actual);
    }

    @Test
    public void car_range_after_moving_1_space() {
        // Arrange...
        float expected = 5.0f;

        // Act...
        car.setFuelLevel(1);
        float actual = car.getRange();

        // Assert...
        assertEquals(expected,actual,0.01f);

        // Report...
        System.out.println("Expected range: " + expected);
        System.out.println("Actual range: " + actual);
    }

    @Test
    public void car_range_after_moving_4_spaces() {
        // Arrange...
        float expected = 2.0f;

        // Act...
        car.setFuelLevel(4);
        float actual = car.getRange();

        // Assert...
        assertEquals(expected,actual,0.01f);

        // Report...
        System.out.println("Expected range: " + expected);
        System.out.println("Actual range: " + actual);
    }

    @Test
    public void car_fuelLevel_add_1_fuel_at_full_tank(){
        // Arrange...
        float expected = 3f;

        // Act...
        car.addFuel(1);
        float actual = car.getFuelLevel();

        // Assert...
        assertEquals(expected,actual,0.01f);

        // Report...
        System.out.println("Expected fuel level: " + expected);
        System.out.println("Actual fuel level: " + actual);
    }

    @Test
    public void car_fuelLevel_after_moving_5_spaces_and_1_point_refuel(){
        // Arrange...
        float expected = 1.5f;

        // Act...
        car.setFuelLevel(5);
        car.addFuel(1);
        float actual = car.getFuelLevel();

        // Assert...
        assertEquals(expected,actual,0.01f);

        // Report...
        System.out.println("Expected fuel level: " + expected);
        System.out.println("Actual fuel level: " + actual);
    }

}