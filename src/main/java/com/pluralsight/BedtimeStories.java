package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BedtimeStories {
    // Gives available bedtime stories to read.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("List of bedtime stories:");
        System.out.println("\ngoldilocks.txt");
        System.out.println("hansel_and_gretel.txt");
        System.out.println("mary_had_a_little_lamb.txt");
        System.out.print("\nChoose a bed time story: ");
        // Takes user input and makes it lowercase
        String bedTimeStory = scanner.nextLine().toLowerCase();

        try {
            FileReader fileReader = new FileReader(bedTimeStory);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            int count = 1;
            // Goes through buffer Line by Line and prints it.
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(count + ". " + line);
                count++;
            }
        } catch (Exception e) {
            // Displays error
            System.out.println(e.getMessage());
        }

    }
}
