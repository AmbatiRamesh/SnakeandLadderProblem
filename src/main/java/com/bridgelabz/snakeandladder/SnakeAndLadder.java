package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
    public static final int startPosition = 0;
    public static  int currentPosition = 0;
    public static final int finalPosition = 100;
    public static void main(String[] args) {
        System.out.println("------Welcome to Snake and Ladder Problem------");
            currentPosition = startPosition;
            int rollPlayer1 = diceRolls("player1");
            int rollPlayer2 = diceRolls("player2");
            if(rollPlayer1 > rollPlayer2) {
                System.out.println("Player2 is the winner");
            }else if(rollPlayer1 < rollPlayer2) {
                System.out.println("Player1 is winner");
            }else {
                System.out.println("It is a tie");
            }
        }
        public static int diceRolls(String player) {
            int noOfRolls = 0;
            currentPosition = startPosition;
            while(currentPosition < finalPosition) {
                int diceValue = (int) (Math.floor(Math.random() * 10) % 6) + 1;
                System.out.println("The player get dice value as: " + diceValue);
                noOfRolls++;
                int option = (int) (Math.floor(Math.random() * 10) % 3);
                System.out.println("Option: " +option);
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
            System.out.println("Number Of total Dice rolls by " + player + " are: " + noOfRolls);
            return noOfRolls;
        }
}
