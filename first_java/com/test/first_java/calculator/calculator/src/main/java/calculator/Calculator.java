package calculator;

import java.util.Scanner;

public class Calculator {
    Adder adder;
    Subtractor subtract;
    Multiplier multiplier;
    Divider divider;

    public Calculator(){
        this.adder = new Adder();
        this.subtract = new Subtractor();
        this.multiplier = new Multiplier();
        this.divider = new Divider();
    }

    public int add(int a, int b) {
        return adder.add(a, b);
    }

    public float add(float a, float b) {
        return adder.add(a, b);
    }

    public long add(long a, long b) {
        return adder.add(a, b);
    }

    public double add(double a, double b) {
        return adder.add(a, b);
    }

    public int subtract(int a, int b) {
        return subtract.subtract(a, b);
    }

    public float subtract(float a, float b) {
        return subtract.subtract(a, b);
    }

    public long subtract(long a, long b) {
        return subtract.subtract(a, b);
    }

    public double subtract(double a, double b) {
        return subtract.subtract(a, b);
    }

    public int multiply(int a, int b) {
        return multiplier.multiply(a, b);
    }

    public float multiply(float a, float b) {
        return multiplier.multiply(a, b);
    }

    public long multiply(long a, long b) {
        return multiplier.multiply(a, b);
    }

    public double multiply(double a, double b) {
        return multiplier.multiply(a, b);
    }

    public int divide(int a, int b) {
        return divider.divide(a, b);
    }

    public float divide(float a, float b) {
        return divider.divide(a, b);
    }

    public long divide(long a, long b) {
        return divider.divide(a, b);
    }

    public double divide(double a, double b) {
        return divider.divide(a, b);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nCalculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an operation (1-5): ");
            
            int choice = scanner.nextInt();
            
            if (choice == 5) {
                System.out.println("Thank you for using the calculator!");
                break;
            }
            
            try {
                System.out.print("Enter first number: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter second number: ");
                int num2 = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.printf("%d + %d = %d%n", num1, num2, calculator.add(num1, num2));
                        break;
                    case 2:
                        System.out.printf("%d - %d = %d%n", num1, num2, calculator.subtract(num1, num2));
                        break;
                    case 3:
                        System.out.printf("%d * %d = %d%n", num1, num2, calculator.multiply(num1, num2));
                        break;
                    case 4:
                        try {
                            System.out.printf("%d / %d = %d%n", num1, num2, calculator.divide(num1, num2));
                        } catch (ArithmeticException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Invalid choice! Please select 1-5.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter valid numbers.");
                scanner.nextLine(); // Clear the scanner buffer
            }
        }
        
        scanner.close();
    }
}
