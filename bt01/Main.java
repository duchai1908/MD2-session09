package btsession09.bt01;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 5);
        shapes[2] = new Square(6);

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle || shapes[i] instanceof Rectangle || shapes[i] instanceof Square) {
                System.out.println("before resize = " + shapes[i]);
                int percent = (int) Math.round(Math.random() * 100);
                System.out.println("resize = " + percent + " %");
//                ((Resizeable) shapes[i]).resize(percent);
                System.out.println("after resize = " + shapes[i]);
            }
        }
    }
}
