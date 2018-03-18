package com.tashi;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public Game(){

    }
    public void init(){
        Player.randomChoice();
        String choice;
        String move;
        ArrayList<String> moveList = new ArrayList<String>();
            moveList.add("rock");
            moveList.add("paper");
            moveList.add("scissors");
        Scanner pqScanner = new Scanner(System.in);
        do {
            Menu.displayMainMenu();
            choice = pqScanner.next();
            } while(!choice.equals("play"));

        do {
            Menu.displayGameMenu();
            move = pqScanner.next();
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
