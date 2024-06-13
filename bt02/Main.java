package btsession09.bt02;

import btsession09.bt01.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 5);
        shapes[2] = new Square(6);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Hình " + (i + 1));
            if (shapes[i] instanceof Colorable) {
                ((Colorable) shapes[i]).howToColor();
            }
            System.out.println(shapes[i].getArea());
        }
    }
}
