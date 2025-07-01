import java.util.Scanner;

public class StringUtilsApp {
    private static final Scanner scanner = new Scanner(System.in);

    // 1. Check if string is palindrome
    public static boolean isPalindrome(String input) {
        if (input == null) return false;
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }

    // 2. Compress string
    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        char current = input.charAt(0);
        
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == current) {
                count++;
            } else {
                compressed.append(current).append(count);
                current = input.charAt(i);
                count = 1;
            }
        }
        compressed.append(current).append(count);
        
        return compressed.length() < input.length() ? compressed.toString() : input;
    }

    // 3. Reverse words in sentence
    public static String reverseWords(String sentence) {
        if (sentence == null) {
            return null;
        }
        
        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        
        return result.toString().trim();
    }

    // 4. Remove vowels
    public static String removeVowels(String input) {
        if (input == null) {
            return null;
        }
        return input.replaceAll("[aeiouAEIOU]", "");
    }

    // 5. Validate password
    public static boolean isStrongPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[!@#$%^&*()].*");
        boolean hasUpperCase = password.matches(".*[A-Z].*");
        boolean hasLowerCase = password.matches(".*[a-z].*");
        
        return hasNumber && hasSpecialChar && hasUpperCase && hasLowerCase;
    }

    // Display menu
    private static void displayMenu() {
        System.out.println("\n=== String Utilities Menu ===");
        System.out.println("1. Check if string is palindrome");
        System.out.println("2. Compress string");
        System.out.println("3. Reverse words in sentence");
        System.out.println("4. Remove vowels");
        System.out.println("5. Validate password strength");
        System.out.println("0. Exit");
        System.out.print("Enter your choice (0-5): ");
    }

    // Main application loop
    public static void main(String[] args) {
        System.out.println("Welcome to String Utilities!");
        
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            if (choice == 0) {
                System.out.println("Thank you for using String Utilities. Goodbye!");
                break;
            }
            
            System.out.print("Enter your input string: ");
            String input = scanner.nextLine();
            
            switch (choice) {
                case 1:
                    boolean isPal = isPalindrome(input);
                    System.out.println("Is palindrome: " + isPal);
                    break;
                    
                case 2:
                    String compressed = compressString(input);
                    System.out.println("Compressed string: " + compressed);
                    break;
                    
                case 3:
                    String reversed = reverseWords(input);
                    System.out.println("Reversed words: " + reversed);
                    break;
                    
                case 4:
                    String noVowels = removeVowels(input);
                    System.out.println("Without vowels: " + noVowels);
                    break;
                    
                case 5:
                    boolean isStrong = isStrongPassword(input);
                    System.out.println("Password strength: " + (isStrong ? "Strong" : "Weak"));
                    if (!isStrong) {
                        System.out.println("Password must contain:");
                        System.out.println("- At least 8 characters");
                        System.out.println("- At least one number");
                        System.out.println("- At least one special character (!@#$%^&*())");
                        System.out.println("- At least one uppercase letter");
                        System.out.println("- At least one lowercase letter");
                    }
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        scanner.close();
    }
} 