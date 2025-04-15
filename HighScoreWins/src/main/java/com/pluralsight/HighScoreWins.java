package com.pluralsight;
import java.text.NumberFormat;
import java.util.Scanner;
public class HighScoreWins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.println("Enter a game score (format: Home:Visitor|ScoreA:ScoreB): ");
       String gameInput = input.nextLine().trim();

       String[] parts = gameInput.split("\\|");

       if (parts.length !=2) {
           System.out.println("Invalid input format.");
           return;
       }
       String[] teams = parts[0].split(":");
       String[] scores = parts[1].split(":");

       if (teams.length !=2 || scores.length !=2) {
           System.out.println("Invalid format for teams or scores.");
           return;
       }
       String home = teams[0].trim();
       String visitor = teams[1].trim();

       int scoreA;
       int scoreB;

       try {
           scoreA = Integer.parseInt(scores[0].trim());
           scoreB = Integer.parseInt(scores[1].trim());
       } catch (NumberFormatException e) {
           System.out.println("Scores must be valid integers.");
           return;
       }
    if (scoreA > scoreB) {
        System.out.println("Winner: " + home);
    } else if (scoreA < scoreB) {
        System.out.println("Winner: " + visitor);
    } else {
        System.out.println("What a match siiiiiuu, but a draw");
    }
    input.close();
    }
}
