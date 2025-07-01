public class ElectricCar extends Car {
    private int batteryCapacity;

    // Constructor
    public ElectricCar(String brand, int year, int batteryCapacity) {
        super(brand, year);
        this.batteryCapacity = batteryCapacity;
    }

    // Display electric car info method
    public void displayElectricInfo() {
        displayInfo();  // Call parent's displayInfo method
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    // Override displayInfo to include electric version indication
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("(Electric Version)");
    }

    // Getter and Setter for battery capacity
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
} 