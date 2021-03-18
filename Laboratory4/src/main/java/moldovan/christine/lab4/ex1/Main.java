package moldovan.christine.lab4.ex1;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.0);
        System.out.println("Radius of first circle: " + c1.getRadius() +
                "\nArea of first circle: " + c1.getArea());

        System.out.println("Radius of second circle: " + c2.getRadius() +
                "\nArea pf second circle: " + c2.getArea());
    }
}
