public class StringCompression {
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
    
    public static void main(String[] args) {
        System.out.println(compressString("aaabbcc")); // a3b2c2
        System.out.println(compressString("abc")); // abc (returns original as compressed is longer)
    }
} 