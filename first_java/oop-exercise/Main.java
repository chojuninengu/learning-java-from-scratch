public class Main {
    public static void main(String[] args) {
        // Part 1: Basic Car objects
        System.out.println("Part 1: Basic Cars");
        System.out.println("------------------");
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Honda", 2021);

        System.out.println("Car 1 Information:");
        car1.displayInfo();
        
        System.out.println("\nCar 2 Information:");
        car2.displayInfo();

        // Part 2: Electric Car
        System.out.println("\nPart 2: Electric Car");
        System.out.println("-------------------");
        ElectricCar electricCar = new ElectricCar("Tesla", 2023, 75);
        System.out.println("Electric Car Information:");
        electricCar.displayElectricInfo();

        // Part 3: Polymorphism
        System.out.println("\nPart 3: Polymorphism");
        System.out.println("--------------------");
        System.out.println("Regular car through printCarDetails:");
        printCarDetails(car1);
        
        System.out.println("\nElectric car through printCarDetails:");
        printCarDetails(electricCar);

        // Part 4: Zoo
        System.out.println("\nPart 4: Zoo");
        System.out.println("-----------");
        Animal[] animals = new Animal[2];
        animals[0] = new Lion("Simba", 5);
        animals[1] = new Elephant("Dumbo", 10);

        System.out.println("Animals making sounds:");
        for (Animal animal : animals) {
            animal.makeSound();
        }

        // Bonus Challenge: Shapes
        System.out.println("\nBonus Challenge: Shapes");
        System.out.println("----------------------");
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Calculating areas:");
        circle.calculateArea();
        rectangle.calculateArea();
    }

    // Polymorphism demonstration method
    public static void printCarDetails(Car car) {
        car.displayInfo();
    }
} 