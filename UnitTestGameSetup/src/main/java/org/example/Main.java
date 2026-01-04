package org.example;

public class Main {
    public static void main(String[] args) {

        PlayerBoard playerBoard = new PlayerBoard();

        playerBoard.applyWinner(2,10);

        for(int i = 1; i <= 4; i++) {
            System.out.println("Player " + i + ": " + playerBoard.getPlayer(i) + " coins");
        }
    }
}