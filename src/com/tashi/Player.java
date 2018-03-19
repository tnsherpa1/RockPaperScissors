package com.tashi;

public class Player {
    private String move;
    private String name;

    public static int randomChoice() {
        return 1 + (int)(Math.random() * ((3-1) + 1));
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
        if (p1.getMove().equals("rock") && p2.getMove().equals("paper")) {
            System.out.println(p2.getName() + " won!");
        } else if(p1.getMove().equals("paper") && p2.getMove().equals("scissors")){
            System.out.println(p2.getName() + " won!");
        } else if(p1.getMove().equals("scissors") && p2.getMove().equals("rock")){
            System.out.println(p2.getName() + " won!");
        } else if(p1.getMove().equals(p2.getMove())){
            System.out.println("It's a tie!");
        }
        else {
            System.out.println(p1.getName() + " won!");
        }
    }

    public String getMove() {
        return move;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMove(String move) {
        this.move = move;
    }
}
