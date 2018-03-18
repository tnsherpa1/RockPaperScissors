package com.tashi;

public class Player {
    private String choice;

    public static int randomChoice(){
        int num = 1 + (int)(Math.random() * ((3-1) + 1));
        return num;
    }

    public static String randomMove(){
        if(randomChoice() == 1){
            return "rock";
        } else if(randomChoice() == 1){
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static void winLose(Player p1, Player p2){
        if (p1.getChoice().equals("rock") && p2.getChoice().equals("paper")) {
            System.out.println("Sorry, you lost!");
        } else if(p1.getChoice().equals("paper") && p2.getChoice().equals("scissors")){
            System.out.println("Sorry, you lost!");
        } else if(p1.getChoice().equals("scissors") && p2.getChoice().equals("rock")){
            System.out.println("Sorry, you lost!");
        } else if(p1.getChoice().equals(p2.getChoice())){
            System.out.println("It's a tie!");
        }
        else {
            System.out.println("Congratulations, you won!");
        }
    }

    public Player(String choice) {
        this.choice = choice;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }
}
