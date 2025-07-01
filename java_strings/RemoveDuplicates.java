import java.util.*;

public class RemoveDuplicates {
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
    
    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming")); // progamin
        System.out.println(removeDuplicates("hello")); // helo
    }
} 