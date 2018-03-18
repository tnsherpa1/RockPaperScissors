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

    public void init(){
        String playerType;
        String moveOne;
        String moveTwo;
        String choice;
        ArrayList<String> pqList = new ArrayList<String>();
            pqList.add("play");
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
        } while(!pqList.contains(choice));

        do {
            Menu.displayPlayerTypeMenu();
            playerType = pqScanner.next().toLowerCase();
        } while(!playerTypeList.contains(playerType));

        Player playerOne = new Player();
        Player playerTwo = new Player();
        if (playerType.equals("computer")){
                Menu.displayGameMenu();
                moveOne = pqScanner.next().toLowerCase();
                moveTwo = Player.randomMove();
                playerOne.setName("Player One");
                playerTwo.setName("Computer");
                playerOne.setMove(moveOne);
                playerTwo.setMove(moveTwo);
            } else if(playerType.equals("player")) {
                Menu.displayGameMenu();
                System.out.println("Player one: ");
                moveOne = pqScanner.next().toLowerCase();
                System.out.println("Player two: ");
                moveTwo = pqScanner.next().toLowerCase();
                playerOne.setName("Player One");
                playerTwo.setName("Player Two");
                playerOne.setMove(moveOne);
                playerTwo.setMove(moveTwo);
            }

            System.out.println("======================");
            System.out.println(playerOne.getName() + ": " + playerOne.getMove());
            System.out.println(playerTwo.getName() + ": " + playerTwo.getMove());
            System.out.println("======================");
            Player.winLose(playerOne, playerTwo);

    }
}
