package test;  

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Guess the number!");
        Random rand = new Random();
        int secretNumber = rand.nextInt(100) + 1; // 1 to 100
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please input your guess.");
            String guessInput = scanner.nextLine();

            int guess;
            try {
                guess = Integer.parseInt(guessInput.trim());
            } catch (NumberFormatException e) {
                continue; // skip invalid input
            }

            System.out.println("You guessed: " + guess);

            if (guess < secretNumber) {
                System.out.println("Too small!");
            } else if (guess > secretNumber) {
                System.out.println("Too big!");
            } else {
                System.out.println("You win!");
                break;
            }
        }

        scanner.close();
    }
}
