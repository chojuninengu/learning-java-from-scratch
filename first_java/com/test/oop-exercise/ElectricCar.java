
public class ElectricCar extends Car {

    private int BatteryCapacity;

    public ElectricCar(String brand, int year, int BatteryCapacity) {
        super(brand, year);
        this.BatteryCapacity = BatteryCapacity;
    }

    public void displayElectricCarInfo(){
        displayInfo();
        System.out.printf("ElectricCar {BatteryCapacity: %s}\n", BatteryCapacity);
    }

    public int getBatteryCapacity() {
        return BatteryCapacity;
    }

    public void setBatteryCapacity(int BatteryCapacity) {
        this.BatteryCapacity = BatteryCapacity;
        
    }

}
