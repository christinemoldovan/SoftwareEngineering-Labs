package moldovan.christine.lab5.ex1;

public class Circle extends Shape {
    protected double radius;

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

    @Override
    double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with radius=" + getRadius() + ", which is a subclass of " + super.toString();
    }
}
