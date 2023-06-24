package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("------Welcome to Snake and Ladder Problem------");
        int startPosition = 0, currentPosition = 0, finalPosition = 100, noOfRoll = 0;
        currentPosition = startPosition;
        while (currentPosition < finalPosition) {
            int diceValue = (int) (Math.floor(Math.random() * 10) % 6) + 1;
            System.out.println("The player get dice value as: " + diceValue);
            noOfRoll++;
            int option = (int) (Math.floor(Math.random() * 10) % 3);
            System.out.println("Option: " + option);
            if(option == 0) {
                System.out.println("No play");
                currentPosition += 0;
            } else if(option == 1) {
                System.out.println("Ladder");
                currentPosition += diceValue;
                if(currentPosition > 100 ) {
                    currentPosition -= diceValue;
                }
            } else {
                System.out.println("Snake");
                currentPosition -= diceValue;
                if(currentPosition < 0) {
                    currentPosition = startPosition;
                }
            }
            System.out.println("Current Position: " +currentPosition);
        }
        System.out.println("Number Of total Dice: " +noOfRoll);
    }
}
