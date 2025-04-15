package com;
import java.awt.*;
import java.util.Scanner;
public class FullNameParser {
    public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
System.out.print("Enter your name: ");
String fullKeyboard = keyboard.nextLine().trim();
String[] nameParts = fullKeyboard.split("\\s+");
if (nameParts.length == 2) {
    System.out.println("First name: " + nameParts[0]);
    System.out.println("Middle name: ");
    System.out.println("Last name: "+ nameParts[1]);
} else if (nameParts.length ==3) {
    System.out.println("First name: " + nameParts[0]);
    System.out.println("Middle name: " + nameParts[1]);
    System.out.println("Last name: " + nameParts[2]);
} else {
    System.out.println("Invalid input. Please enter a name in the format: ");
    System.out.println("  -First last");
    System.out.println("  -First middle name");
}
keyboard.close();
    }
}
