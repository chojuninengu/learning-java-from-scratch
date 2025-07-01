import java.util.StringTokenizer;

public class FindLongestWord {
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
    
    public static void main(String[] args) {
        System.out.println(findLongestWord("Find the longest word in this sentence")); // sentence
        System.out.println(findLongestWord("Hello World")); // World
    }
} 