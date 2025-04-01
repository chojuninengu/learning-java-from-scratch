public class Main {
    public static void main(String[] args) {
        int a = 23, b = 35;
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a / b = " + (a % b));
        System.out.println( a == b);

        System.out.println( a != b);
        System.out.println( a <= b);
        System.out.println( a >= b);
        System.out.println(( 6 < 5) || (9>10));
        System.out.println( !( a > b));
        int result;
        result = ++a;
        System.out.println(result);
    }
    
}
