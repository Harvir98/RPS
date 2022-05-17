package com.nology;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i = 0;
        int computerWin = 0;
//        int userWin = 0;

       ArrayList <Players> playerList  = new ArrayList<>();


        System.out.println("Enter your name");
        Scanner input2 = new Scanner(System.in);
        String playerName = input2.nextLine().toLowerCase();

        Players player1 = new Players(playerName);
        playerList.add(player1);

        while (i < 3) {
            String[] rps = {"rock", "paper", "scissors"};
            String computerMove = rps[(int) (Math.random() * 3)];

            System.out.println("Choose Rock, Paper or Scissors");
            Scanner input = new Scanner(System.in);
            String userInput = input.nextLine().toLowerCase();

            if (!Objects.equals(userInput, "rock") && !Objects.equals(userInput, "paper") && !Objects.equals(userInput, "scissors")) {
                System.out.println("Please choose rock, paper or scissors");
            } else if (computerMove.equals("rock") && userInput.equals("scissors")) {
                System.out.println("Computer Wins");
                computerWin++;
            } else if (computerMove.equals("rock") && userInput.equals("paper")) {
                System.out.println("You Win");
                player1.setScore(+1);
            } else if (computerMove.equals("rock") && userInput.equals("rock")) {
                System.out.println("Draw");
            } else if (computerMove.equals("paper") && userInput.equals("rock")) {
                System.out.println("Computer Wins");
                computerWin++;
            } else if (computerMove.equals("paper") && userInput.equals("paper")) {
                System.out.println("Draw");
            } else if (computerMove.equals("paper") && userInput.equals("scissors")) {
                System.out.println("You Win");
                player1.setScore(+1);
            } else if (computerMove.equals("scissors") && userInput.equals("rock")) {
                System.out.println("You Win");
                player1.setScore(+1);
            } else if (computerMove.equals("scissors") && userInput.equals("scissors")) {
                System.out.println("Draw");
            } else if (computerMove.equals("scissors") && userInput.equals("paper")) {
                System.out.println("Computer Wins");
                computerWin++;
            }
            i++;

            if(player1.getScore() > computerWin) {
                player1.setWins(+1);
            }
        }

        System.out.println(computerWin);
        System.out.println(player1.getScore());
//        System.out.println(playerList);
        System.out.println(player1.getWins());


        }


    }






