package com.test.first_java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Engine {
    public static void main(String[] args) {
        // Check if the file path is provided as a command-line argument
        if (args.length == 0) {
            System.out.println("Please provide the path to the dictionary file as a command-line argument.");
            return;
        }

        String dictionaryFilePath = args[0];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the word to search: ");
        String wordToSearch = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive search

        try (BufferedReader reader = new BufferedReader(new FileReader(dictionaryFilePath))) {
            int occurrences = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().equals(wordToSearch)) {
                    occurrences++;
                }
            }

            if (occurrences > 0) {
                System.out.println("The word '" + wordToSearch + "' appears " + occurrences + " times in the dictionary.");
            } else {
                System.out.println("The word '" + wordToSearch + "' is not found in the dictionary.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        scanner.close();
    }
}