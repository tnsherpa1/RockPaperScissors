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
        String choice;
        String move;
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
            Menu.displayGameMenu();
            move = pqScanner.next().toLowerCase();
        } while(!moveList.contains(move));

        Player playerOne = new Player(move);
        Player playerTwo = new Player(Player.randomMove());

        System.out.println("======================");
        System.out.println("User chose: " + playerOne.getChoice());
        System.out.println("Computer chose: " + playerTwo.getChoice());
        System.out.println("======================");
        Player.winLose(playerOne, playerTwo);
    }
}
