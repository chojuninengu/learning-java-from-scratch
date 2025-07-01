import java.util.*;
import java.util.regex.*;

public class StringExercises {
    
    // 3. String Compression
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
    
    // 4. Group Splitter
    public static List<String> splitIntoGroups(String input, int n) {
        if (input == null || n <= 0) {
            return new ArrayList<>();
        }
        
        String[] groups = input.split("(?<=\\G.{" + n + "})");
        return Arrays.asList(groups);
    }
    
    // 5. Vowel Remover
    public static String removeVowels(String input) {
        if (input == null) {
            return null;
        }
        return input.replaceAll("[aeiouAEIOU]", "");
    }
    
    // 6. Reverse Words
    public static String reverseWords(String sentence) {
        if (sentence == null) {
            return null;
        }
        
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        StringBuilder result = new StringBuilder();
        
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            result.append(new StringBuilder(word).reverse());
            if (tokenizer.hasMoreTokens()) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
    
    // 7. Password Strength Checker
    public static boolean isStrongPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[!@#$%^&*()].*");
        
        return hasNumber && hasSpecialChar;
    }
    
    // 8. Remove Duplicate Characters
    public static String removeDuplicates(String input) {
        if (input == null) {
            return null;
        }
        
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        
        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }
        
        return result.toString();
    }
    
    // 9. Find Longest Word
    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }
        
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        String longestWord = "";
        
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        return longestWord;
    }
    
    // 10. Reformat Fixed Width File
    public static String reformatFixedWidth(String input) {
        if (input == null) {
            return null;
        }
        
        String[] entries = input.split("(?<=\\G.{10})");
        return String.join("\n", entries);
    }
    
    // Main method for testing
    public static void main(String[] args) {
        // Test cases
        System.out.println("1. String Compression:");
        System.out.println(compressString("aaabbcc")); // a3b2c2
        
        System.out.println("\n2. Group Splitter:");
        System.out.println(splitIntoGroups("abcdefghij", 3)); // [abc, def, ghi, j]
        
        System.out.println("\n3. Vowel Remover:");
        System.out.println(removeVowels("Hello World")); // Hll Wrld
        
        System.out.println("\n4. Reverse Words:");
        System.out.println(reverseWords("Learn Java Today")); // nraeL avaJ yadot
        
        System.out.println("\n5. Password Strength Checker:");
        System.out.println(isStrongPassword("Password123!")); // true
        System.out.println(isStrongPassword("weak")); // false
        
        System.out.println("\n6. Remove Duplicates:");
        System.out.println(removeDuplicates("programming")); // progamin
        
        System.out.println("\n7. Find Longest Word:");
        System.out.println(findLongestWord("Find the longest word in this sentence")); // sentence
        
        System.out.println("\n8. Reformat Fixed Width:");
        System.out.println(reformatFixedWidth("JohnSmith AnneBrown"));
    }
} 