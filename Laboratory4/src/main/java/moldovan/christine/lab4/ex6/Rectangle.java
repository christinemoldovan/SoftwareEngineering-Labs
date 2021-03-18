package moldovan.christine.lab4.ex6;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        super();
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return (double) length * width;
    }

    public double getPerimeter() {
        return (double) 2 * (length + width);
    }

    @Override
    public String toString() {
        return "A rectangle with width=" + getWidth() + " and length=" + getLength() + ", which is a subclass of " + super.toString();
    }
}
