package com.ap.cylinder;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if(radius<0)
            radius=0;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
