package com.pluralsight;

public class RollTheDiceApplication {
    public static void main(String[] args) {
        Dice cube = new Dice();
        int roll1, roll2;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 1; i <= 100; i++) {
            roll1 = cube.roll();
            roll2 = cube.roll();

            int sum = roll1 + roll2;

            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + sum);

            if (sum == 2) {
                twoCounter++;
            } else if (sum == 4) {
                fourCounter++;
            } else if (sum == 6) {
                sixCounter++;
            } else if (sum == 7) {
                sevenCounter++;
            }
        }
        System.out.println("\nSummary:");
        System.out.println("Number of times 2 was rolled: " + twoCounter);
        System.out.println("Number of times 4 was rolled: " + fourCounter);
        System.out.println("Number of times 6 was rolled: " + sixCounter);
        System.out.println("Number of times 7 was rolled: " + sevenCounter);

    }

    }

