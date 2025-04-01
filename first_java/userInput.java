
import java.util.Scanner;

public class userInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = input.nextInt();
        System.out.println("you entered this value:" + number);

        System.out.println(" please enter a float");
        Float myFloat = input.nextFloat();
        System.out.println("this is the float you gave" + myFloat);
        System.out.println("please input a text");
        String myString = input.next();
        System.out.println("this is the string you entered" + myString);
        input.close();
    }

}
