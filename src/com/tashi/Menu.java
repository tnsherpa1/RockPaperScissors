package com.tashi;

public class Menu {
    public static void displayMainMenu(){
        System.out.println("\n");
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println();
        System.out.println("MAIN MENU");
        System.out.println("=====");
        System.out.println("Type 'play' to play");
        System.out.println("Type 'history' to view your game history");
        System.out.println("Type 'quit' to stop playing");
    }

    public static void displayPlayerTypeMenu(){
        System.out.println("\n");
        System.out.println("Type 'player' for player two");
        System.out.println("Type 'computer' to play with computer");
        System.out.println("Type 'quit' to go back to main menu");
    }

    public static void displayGameMenu(){
        System.out.println("\n");
        System.out.println("Type in 'rock' 'paper' or 'scissors' to play.");
        System.out.println("  Type 'quit' to go back to the Main Menu  ");
    }
}
