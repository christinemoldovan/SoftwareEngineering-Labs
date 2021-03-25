package moldovan.christine.lab5.ex1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle();
        shapes[1] = new Circle(3);
        shapes[2] = new Rectangle();
        shapes[3] = new Rectangle(2, 3);


        for (int i = 0; i <= shapes.length - 1; i++) {
            System.out.println(shapes[i].toString());
            System.out.println("perimeter=" + shapes[i].getPerimeter());
            System.out.println("area=" + shapes[i].getArea());
        }


    }
}
