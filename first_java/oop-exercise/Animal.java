public class Animal {
    protected String name;
    protected int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Make sound method
    public void makeSound() {
        System.out.println("Animal sound...");
    }
} 