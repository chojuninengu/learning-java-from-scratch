public class PasswordStrengthChecker {
    public static boolean isStrongPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[!@#$%^&*()].*");
        
        return hasNumber && hasSpecialChar;
    }
    
    public static void main(String[] args) {
        System.out.println(isStrongPassword("Password123!")); // true
        System.out.println(isStrongPassword("weak")); // false
        System.out.println(isStrongPassword("NoSpecialChar123")); // false
    }
} 