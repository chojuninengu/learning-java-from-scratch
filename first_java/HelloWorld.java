import java.util.Random;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        int userNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your number");
         String name = scanner.nextLine();
         System.out.println(" please input your age");
         int age = scanner.nextInt();
         System.out.println("you are " + age + "old" );
        scanner.close();
        try {
            userNumber = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer as an argument.");
            return;
        }
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("Random Number: " + randomNumber);
        System.out.println("Your Number: " + userNumber);
        if (userNumber > randomNumber) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
 
        int arrays[] = {2025,2024,2024, 2023 ,2022,  2021, 2020};
        int a = 2233;
        byte b = (byte) a;
        int c = (int) b;
        System.out.println("a" + a);
        System.out.println("b" + b);
        System.out.println("c" + c);

    }
}
// WRITE   A PROGRAM THAT TAKES IN AN INTEGER, AND PRINTS IT, THEN CASTS IT TO BYTE AND PRINTS IT TOO 