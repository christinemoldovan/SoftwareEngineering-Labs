package moldovan.christine.lab4.ex6;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
        radius = 1.0;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (double) Math.PI * (radius * radius);
    }

    public double getPerimeter() {
        return (double) 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with radius=" + getRadius() + ", which is a subclass of " + super.toString();
    }
}
