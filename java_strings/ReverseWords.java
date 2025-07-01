import java.util.StringTokenizer;

public class ReverseWords {
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
    
    public static void main(String[] args) {
        System.out.println(reverseWords("Learn Java Today")); // nraeL avaJ yadot
        System.out.println(reverseWords("Hello World")); // olleH dlroW
    }
} 