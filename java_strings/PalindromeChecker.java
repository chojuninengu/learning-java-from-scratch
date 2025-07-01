
public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
         String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();  

         String reversedInput = new StringBuilder(cleanedInput).reverse().toString();
         return cleanedInput.equals(reversedInput);
    }


public static void main(String[] args) {
    System.out.println(isPalindrome("A man, A plane A fould"));
    System.out.println(isPalindrome("Was it a car or a cat I saw"));
}
}