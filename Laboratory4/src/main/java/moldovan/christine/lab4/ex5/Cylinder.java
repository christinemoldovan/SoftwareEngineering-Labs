package moldovan.christine.lab4.ex5;

import moldovan.christine.lab4.ex1.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return (double) Math.PI * (getRadius() * getRadius()) * height;
    }

    @Override
    public double getArea() {
        return Math.PI * (getRadius() * getRadius()) * 2 + 2 * Math.PI * getRadius() * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
