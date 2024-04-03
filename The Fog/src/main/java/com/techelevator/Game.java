package com.techelevator;

import com.techelevator.vehicles.Car;
import com.techelevator.vehicles.Motorcycle;
import com.techelevator.vehicles.Truck;
import com.techelevator.vehicles.Vehicle;

import java.util.Scanner;

public class Game {

    private Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("\nWelcome to The Fog\n");
        Game game = new Game();
        game.mainMenu();

        // Start Game displays a list of options: Motorcycle (easy), Car (medium), Truck (hard), Back to menu
        // Once a vehicle is selected, display the fuel for the vehicle and ask which direction to move: N, S, E, W
        // The player moves in that in that direction:
        // Display what the player found, update the fuel, ask for a new direction to move (without the previous direction)

    }

    private void mainMenu(){
        boolean play = true;
        while (play) {
            System.out.println("Main Menu");
            System.out.println("1. Play Game");
            System.out.println("2. High Score");
            System.out.println("3. Story");
            System.out.println("4. Quit");

            int userChoice = Integer.parseInt(userInput.nextLine());

            if (userChoice == 1) {
                // Play game...
                // Open the menu to select the vehicle
                vehicleSelect();
            } else if (userChoice == 2) {
                // High Score...
                // List the players high scores.
                // Saved to a txt file.
            } else if (userChoice == 3) {
                // Story...
                // Tell the player a short story.
                // Pulled from a txt file.
            } else if (userChoice == 4) {
                // Quit the game...
                // Ask the player if they are sure.
                quitMenu();
            } else {
                // Invalid input...
                System.out.println("Invalid selection. Please choose another option.\n");
            }
        }
    }

    private void vehicleSelect(){
        Vehicle motorcycle = new Motorcycle();
        Vehicle car = new Car();
        Vehicle truck = new Truck();

        boolean vehicleSelect = true;
        while (vehicleSelect) {
            System.out.println("Select your vehicle:");
            System.out.println("1. " + motorcycle.getName() + " (" + motorcycle.getDifficulty() + ")");
            System.out.println("2. " + car.getName() + " (" + car.getDifficulty() + ")");
            System.out.println("3. " + truck.getName() + " (" + truck.getDifficulty() + ")");
            System.out.println("4. Return to Main Menu");

            int vehicleChoice = Integer.parseInt(userInput.nextLine());

            if (vehicleChoice == 1) {
                // Motorcycle vehicle selection...
                // Load the map...
                map(motorcycle);
                vehicleSelect = false;
            } else if (vehicleChoice == 2) {
                // Car vehicle selection...
                // Load the map...
                map(car);
                vehicleSelect = false;
            } else if (vehicleChoice == 3) {
                // Truck vehicle selection...
                // Load the map...
                map(truck);
                vehicleSelect = false;
            } else if (vehicleChoice == 4) {
                // Return to the main menu...
                vehicleSelect = false;
            } else {
                // Invalid selection...
                System.out.println("Invalid selection. Please choose another option\n");
            }
        }
    }

    private void map(Vehicle vehicle){

        int xPosition = 0;
        int yPosition = 0;

        System.out.println("Survive");

        boolean mapSelection = true;

        while (mapSelection) {
            System.out.println("Fuel level: " + vehicle.getFuelLevel());
            System.out.println("Choose a direction to travel:");
            System.out.println("n. North");
            System.out.println("s. South");
            System.out.println("e. East");
            System.out.println("w. West");
            System.out.println("q. Quit");

            String directionChoice = userInput.nextLine();

            if (directionChoice.equals("n") || directionChoice.equals("N")) {
                // Move (add) 1 space in the y direction...
                System.out.println("You drive north...");
                yPosition++;
                System.out.println("Location: " + xPosition + ", " + yPosition);
            } else if (directionChoice.equals("s") || directionChoice.equals("S")) {
                // Move (subtract) 1 space in the y direction...
                System.out.println("You drive south...");
                yPosition--;
                System.out.println("Location: " + xPosition + ", " + yPosition);
            } else if (directionChoice.equals("e") || directionChoice.equals("E")) {
                // Move (add) 1 space in the x direction...
                System.out.println("You drive east...");
                xPosition++;
                System.out.println("Location: " + xPosition + ", " + yPosition);
            } else if (directionChoice.equals("w") || directionChoice.equals("W")) {
                // Move (subtract) 1 space in the x direction...
                System.out.println("You drive west...");
                xPosition--;
                System.out.println("Location: " + xPosition + ", " + yPosition);
            } else if (directionChoice.equals("q") || directionChoice.equals("Q")) {
                // Return to the main menu...
                mapSelection = false;
            } else {
                // Invalid selection...
                System.out.println("Invalid selection. Please choose another option\n");
            }
        }
    }

    private void move(int xDirection, int yDirection){
        // Do all the things with moving the vehicle...
        // May need a player class to record the score and the coordinate list.
    }

    private void quitMenu(){
        boolean quitSelection = true;
        while (quitSelection) {
            System.out.println("Are you sure you want to quit?");
            System.out.println("1. Yes, quit the game.");
            System.out.println("2. No, return to the main menu.");

            int quitChoice = Integer.parseInt(userInput.nextLine());

            if (quitChoice == 1){
                System.out.println("Quitting...");
                System.exit(0);
            } else if (quitChoice == 2) {
                quitSelection = false;
            } else {
                // Invalid selection...
                System.out.println("Invalid selection. Please choose another option\n");
            }
        }
    }
}
