package com.tashi;

import java.util.Scanner;

public class Menu {
    public static void displayMenu(){
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println();
        System.out.println("MAIN MENU");
        System.out.println("=====");
        System.out.println("Type 'play' to play");
        System.out.println("Type 'history' to view your game history");
        System.out.println("Type 'quit' to stop playing");
        System.out.println("What's your choice: ");
    };
    public static void acceptInput(){
        Scanner userChoice = new Scanner(System.in);
        String choice = userChoice.next();
        System.out.println(choice);
    }
}
