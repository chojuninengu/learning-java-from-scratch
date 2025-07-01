

public class Main {
    public static void main(String[] args) {
        Car Testla = new Car("Testla", 2025);
        Car BMW = new Car("BMW", 2026);
        ElectricCar TestlaElectric = new ElectricCar("Cyber Truck", 2025, 1000);
        
        Testla.displayInfo();
        System.out.println();
        BMW.displayInfo();
        TestlaElectric.displayElectricCarInfo();
    }
}
