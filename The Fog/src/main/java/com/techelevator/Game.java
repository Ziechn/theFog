package com.techelevator;

import com.techelevator.vehicles.Car;
import com.techelevator.vehicles.Motorcycle;
import com.techelevator.vehicles.Truck;
import com.techelevator.vehicles.Vehicle;

import java.util.Scanner;

public class Game {

    private Scanner userInput = new Scanner(System.in);
    private int xPosition = 0;
    private int yPosition = 0;
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

        Map map = new Map();

        System.out.println("Survive");

        boolean mapSelection = true;

        while (mapSelection) {
            System.out.println("Fuel level: " + vehicle.getFuelLevel());

            if (vehicle.getFuelLevel() <= 0) {
                System.out.println("You have run out of fuel... Game over.");
                int distanceTraveled = map.getListSize();
                System.out.println("You traveled a distance of " + distanceTraveled + ".\n");
                break;
            }

            System.out.println("Choose a direction to travel:");
            System.out.println("n. North");
            System.out.println("s. South");
            System.out.println("e. East");
            System.out.println("w. West");
            System.out.println("m. Map");
            System.out.println("q. Quit");

            String directionChoice = userInput.nextLine();

            if (directionChoice.equals("n") || directionChoice.equals("N")) {
                // Move (add) 1 space in the y direction...
                System.out.println("You drive north...");
                int yPositionNew = yPosition++;
                move(vehicle,map,yPositionNew,xPosition);
            } else if (directionChoice.equals("s") || directionChoice.equals("S")) {
                // Move (subtract) 1 space in the y direction...
                System.out.println("You drive south...");
                int yPositionNew = yPosition--;
                move(vehicle,map,yPositionNew,xPosition);
            } else if (directionChoice.equals("e") || directionChoice.equals("E")) {
                // Move (add) 1 space in the x direction...
                System.out.println("You drive east...");
                int xPositionNew = xPosition++;
                move(vehicle,map,yPosition,xPositionNew);
            } else if (directionChoice.equals("w") || directionChoice.equals("W")) {
                // Move (subtract) 1 space in the x direction...
                System.out.println("You drive west...");
                int xPositionNew = xPosition--;
                move(vehicle,map,yPosition,xPositionNew);
            } else if (directionChoice.equals("m") || directionChoice.equals("M")) {
                // Print the map list...
                map.printList();
            } else if (directionChoice.equals("q") || directionChoice.equals("Q")) {
                // Return to the main menu...
                mapSelection = false;
            } else {
                // Invalid selection...
                System.out.println("Invalid selection. Please choose another option\n");
            }
        }
    }

    private void move(Vehicle vehicle, Map map,int yPosition, int xPosition){
        // Update the vehicle...
        vehicle.setFuelLevel(1);

        // Did we find a pickup?
        int rng = (int)(Math.random() * 100);
        if (rng < 40) {
            System.out.println("There's nothing here.\n");
        } else if (rng >= 40 && rng < 60){
            System.out.println("Oh no! A zombie! Run away! You are forced to move one more place!\n");
            vehicle.setFuelLevel(1);

            if (yPosition > this.yPosition) {
                // Moved north...
                yPosition--;
            } else if (yPosition < this.yPosition) {
                // Moved south...
                yPosition++;
            } else if (xPosition > this.xPosition) {
                // Moved east...
                xPosition--;
            } else if (xPosition < this.xPosition) {
                // Moved west...
                xPosition++;
            } else {
                // Didn't move?
            }

        } else if (rng >= 60 && rng < 85) {
            System.out.println("Your found a small gas can. Fuel has been replenished by 1 point!\n");
            vehicle.addFuel(1);
        } else if (rng >= 85 && rng < 95) {
            System.out.println("You found a medium gas can. Fuel has been replenished by 2 points!\n");
            vehicle.addFuel(2);
        } else if (rng >= 95) {
            System.out.println("You found a large gas can! Fuel has been replenished by 3 points!\n");
            vehicle.addFuel(3);
        } else {
            System.out.println("How did we get here?\n");
        }

        // Add to the Map...
        map.addCoordinates(yPosition,xPosition);

        // Tell them where they are...
        System.out.println("Location: " + yPosition + ", " + xPosition);
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
