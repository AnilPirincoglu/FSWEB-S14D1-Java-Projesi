package com.ap.cuboid;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double width, double length) {
        this.length = checkedValue(length);
        this.width = checkedValue(width);
    }

    protected double checkedValue(double value) {
        if (value < 0)
            value = 0;
        return value;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        return width*length;
    }
}
