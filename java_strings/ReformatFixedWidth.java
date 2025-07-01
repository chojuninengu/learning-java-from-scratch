public class ReformatFixedWidth {
    public static String reformatFixedWidth(String input) {
        if (input == null) {
            return null;
        }
        
        String[] entries = input.split("(?<=\\G.{10})");
        return String.join("\n", entries);
    }
    
    public static void main(String[] args) {
        System.out.println(reformatFixedWidth("JohnSmith AnneBrown"));
        System.out.println(reformatFixedWidth("12345678901234567890"));
    }
} 