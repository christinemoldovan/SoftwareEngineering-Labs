package moldovan.christine.lab3.Ex2;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double rad) {
        radius = rad;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = Math.PI * (radius * radius);
        return area;
    }


}
