package moldovan.christine.lab4.ex6;

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println(s.toString());
        Circle c = new Circle();
        System.out.println(c.toString());
        System.out.println("perimeter=" + c.getPerimeter());
        System.out.println("area=" + c.getArea());
        Rectangle r = new Rectangle();
        System.out.println(r.toString());
        System.out.println("area=" + r.getArea());
        System.out.println("perimeter=" + r.getPerimeter());
        Square sq = new Square();

        System.out.println(sq.toString());
    }
}
