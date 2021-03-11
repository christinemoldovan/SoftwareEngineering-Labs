package moldovan.christine.lab3.Ex4;

public class Main {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(2, 7);

        System.out.println(p1.getDistance(6, 8));
        System.out.println(p2.getDistance(0, 0));
        System.out.println(p1.getDistance(p2));
    }
}
