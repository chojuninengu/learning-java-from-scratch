public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        double area = width * height;
        System.out.println("Rectangle area: " + area);
    }
} 