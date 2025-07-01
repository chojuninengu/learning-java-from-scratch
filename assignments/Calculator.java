import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Simple Calculator");
        System.out.println("Operations: +, -, *, /, ! (factorial)");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter operator: ");
        char operator = scanner.next().charAt(0);
        
        double result = 0;
        
        switch(operator) {
            case '+':
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                result = num1 + num2;
                break;
            case '-':
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = num1 - num2;
                break;
            case '*':
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = num1 * num2;
                break;
            case '/':
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                if(num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            case '!':
                if(num1 < 0 || num1 != (int)num1) {
                    System.out.println("Error: Factorial requires non-negative integer!");
                    return;
                }
                result = factorial((int)num1);
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }
        
        System.out.println("Result: " + result);
    }
    
    public static  int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}