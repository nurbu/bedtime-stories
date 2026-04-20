package com.pluralsight;

import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("List of bed time stories:");
        System.out.println("\ngoldilocks.txt");
        System.out.println("hansel_and_gretel.txt");
        System.out.println("mary_had_a_little_lamb.txt");
        System.out.print("Choose a bed time story: ");
        String bedTimeStory = scanner.nextLine();


    }
}
