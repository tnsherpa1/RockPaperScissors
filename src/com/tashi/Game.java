package com.tashi;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private static Game gameInstance;

    private Game(){
    }

    public static Game getGameInstance(){
        if (gameInstance == null){
            gameInstance = new Game();
        }
        return gameInstance;
    }

    public void init() {
        String playerType;
        String moveOne;
        String moveTwo;
        String choice;
        ArrayList<String> playerTypeList = new ArrayList<String>();
        playerTypeList.add("player");
        playerTypeList.add("computer");
        ArrayList<String> moveList = new ArrayList<String>();
        moveList.add("rock");
        moveList.add("paper");
        moveList.add("scissors");
        Scanner pqScanner = new Scanner(System.in);
            do {
                Menu.displayMainMenu();
                choice = pqScanner.next().toLowerCase();
            } while(!choice.equals("play"));

            do {
                Menu.displayPlayerTypeMenu();
                playerType = pqScanner.next().toLowerCase();
                if (playerType.equals("quit")){
                    break;
                }
            } while (!playerTypeList.contains(playerType));

            Player playerOne = new Player();
            Player playerTwo = new Player();
                if (playerType.equals("computer")) {
                    do {
                        Menu.displayGameMenu();
                        moveOne = pqScanner.next().toLowerCase();
                        moveTwo = Player.randomMove();
                        playerOne.setName("Player One");
                        playerTwo.setName("Computer");
                        playerOne.setMove(moveOne);
                        playerTwo.setMove(moveTwo);
                    } while(!moveList.contains(moveOne));
                    System.out.println("======================");
                    System.out.println(playerOne.getName() + ": " + playerOne.getMove());
                    System.out.println(playerTwo.getName() + ": " + playerTwo.getMove());
                    System.out.println("======================");
                    Player.winLose(playerOne, playerTwo);
                } else if (playerType.equals("player")) {
                    do {
                        Menu.displayGameMenu();
                        System.out.println("Player one: ");
                        moveOne = pqScanner.next().toLowerCase();
                        playerOne.setName("Player One");
                        playerOne.setMove(moveOne);
                    } while (!moveList.contains(moveOne));

                    do {
                        Menu.displayGameMenu();
                        System.out.println("Player two: ");
                        moveTwo = pqScanner.next().toLowerCase();
                        playerTwo.setName("Player Two");
                        playerTwo.setMove(moveTwo);
                    } while (!moveList.contains(moveTwo));
                    System.out.println("======================");
                    System.out.println(playerOne.getName() + ": " + playerOne.getMove());
                    System.out.println(playerTwo.getName() + ": " + playerTwo.getMove());
                    System.out.println("======================");
                    Player.winLose(playerOne, playerTwo);
                }
        }
}
