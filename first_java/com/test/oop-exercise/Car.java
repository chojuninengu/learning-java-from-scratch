public class  Car{
    private String brand;
    private int  year;
    public Car(String brand , int year) {
        this.brand = brand;
        this.year = year;

    }

    public Car() {
    }
    public void displayInfo(){
        System.out.printf("car {brand: %s, year: %s}\n", brand, year);

    }


    public String getGetBrand() {
        return brand;
    }
    public void setGetBrand(String getBrand) {
        this.brand = getBrand;
    }


}