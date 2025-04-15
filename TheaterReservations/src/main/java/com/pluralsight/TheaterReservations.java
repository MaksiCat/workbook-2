package com.pluralsight;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TheaterReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName = input.nextLine().trim();
        String[] nameParts = fullName.split("\\s+");

        String firstName = "";
        String lastName ="";

        firstName = nameParts[0];
        lastName = nameParts[nameParts.length - 1];

        System.out.print("Enter date (MM/dd/yyyy): ");
        String dateInput = input.nextLine().trim();
        String formattedDate = "";

        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("MM/dd/yyyy");
            Date date = inputFormat.parse(dateInput);
            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
            formattedDate = outputFormat.format(date);
         } catch (Exception e) {
            System.out.println("❌ Invalid date format. Please use MM/dd/yyyy.");
            return; }
        System.out.print("How many tickets wiold you like? ");
        int ticketCount = 0;
        try {
            ticketCount = Integer.parseInt(input.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("❌ Please enter a valid number for tickets.");
            return;
        }
        String ticketWord = (ticketCount == 1) ? "ticket" : "tickets";

        System.out.println(ticketCount + " " + ticketWord + "reserved for " + formattedDate + " under" + lastName + ", " + firstName);
        input.close();
    }
}
