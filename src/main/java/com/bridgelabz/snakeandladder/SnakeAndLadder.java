package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("------Welcome to Snake and Ladder Problem------");
        int startPosition = 0;
        System.out.println(" Start position is: " + startPosition);
        int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println(" Dice Number is : " + diceNumber);
    }
}
