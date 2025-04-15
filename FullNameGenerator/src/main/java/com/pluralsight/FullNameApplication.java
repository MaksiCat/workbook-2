package com.pluralsight;
 import java.util.Scanner;
public class FullNameApplication {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your First name :");
        String firstName = keyboard.nextLine().trim();
        System.out.print("Enter yor Middle name(if any): ");
        String middleName = keyboard.nextLine().trim();
        System.out.print("Enter yor Last name: ");
        String lastName = keyboard.nextLine().trim();
        System.out.print("Enter your Suffix (if any): ");
        String suffix = keyboard.nextLine().trim();
        String fullName = firstName;
        if (!middleName.isEmpty()) {
            fullName += " " + middleName;
        }
    fullName += " " + lastName;
        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }
        System.out.println("Full name: " + fullName);
        keyboard.close();
    }
}
