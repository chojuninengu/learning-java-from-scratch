public class VowelRemover {
    public static String removeVowels(String input) {
        if (input == null) {
            return null;
        }
        return input.replaceAll("[aeiouAEIOU]", "");
    }
    
    public static void main(String[] args) {
        System.out.println(removeVowels("Hello World")); // Hll Wrld
        System.out.println(removeVowels("Programming")); // Prgrmmng
    }
} 