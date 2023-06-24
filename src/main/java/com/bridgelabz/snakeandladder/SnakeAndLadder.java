package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("------Welcome to Snake and Ladder Problem------");
        int startPosition = 0, currentPosition = 0;
        System.out.println("Start position is: " + startPosition);
        int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("Dice Number is : " + diceNumber);
        int option = (int) (Math.floor(Math.random() * 10) % 3);
        System.out.println("Option: " +option);
        if(option == 0) {
            System.out.println("No play");
            currentPosition += 0;
        } else if(option == 1) {
            System.out.println("Ladder");
            currentPosition += diceNumber;
        } else {
            System.out.println("Snake");
            currentPosition -= diceNumber;
            if(currentPosition < 0) {
                currentPosition = startPosition;
            }
        }
        System.out.println("Current Position: " +currentPosition);
    }
}
