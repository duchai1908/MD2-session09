package btsession09.bt04;

public class Circle extends Shape{
    private double r;

    public Circle() {
    }
    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}
