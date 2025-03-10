package btsession09.bt01;

import btsession09.bt02.Colorable;

public class Square  extends Rectangle implements Colorable {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void howToColor() {

    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    public void setHeight(double height) {
        setSide(height);
    }

    public String toString() {
        return "A Square with side = "
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
