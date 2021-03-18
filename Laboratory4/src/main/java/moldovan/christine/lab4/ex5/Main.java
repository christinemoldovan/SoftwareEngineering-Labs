package moldovan.christine.lab4.ex5;

import moldovan.christine.lab4.ex6.Circle;

public class Main {
    public static void main(String[] args) {
//        Cylinder c1 = new Cylinder(2, 3);
//        System.out.println("Radius of 1st cylinder is: " + c1.getRadius() +
//                "\nHeight of 1st cylinder is: " + c1.getHeight() +
//                "\nVolume of 1st cylinder is: " + c1.getVolume());
//        Cylinder c2 = new Cylinder();
//        System.out.println("Radius of 2nd cylinder is: " + c2.getRadius() +
//                "\nHeight of 2nd cylinder is: " + c2.getHeight() +
//                "\nVolume of 2st cylinder is: " + c2.getVolume());

        Circle circle = new Circle(3);
        Cylinder cylinder = new Cylinder(3);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Cylinder area: " + cylinder.getArea());

    }
}
