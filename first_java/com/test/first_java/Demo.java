package com.test.first_java;


public class Demo {

    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Pixel";
        obj1.price = 1500;
        Mobile.name = "Smart Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Iphone";
        obj2.price = 500;
        Mobile.name = "Smart Phone";
        obj1.show();
        obj2.show();
        Mobile.show1(obj1);
    }

}

class Mobile {


    
    String brand;
    int price;
  static String name;

    public void show() {
        System.out.println(brand + ":" + price + ":" + name);
    }
    public static void  show1(Mobile obj){
        System.out.println(obj.brand + ":" + obj.price + ":" + name);
        
    }
}
