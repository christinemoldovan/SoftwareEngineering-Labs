package moldovan.christine.lab3.Ex1;

public class Main {
    public static void main(String[] args) {
        Robot r1 = new Robot(1);
        Robot r2 = new Robot(0);
        r1.change(5);
        r2.change(-1);
        System.out.println(r1 + "\n" + r2);
    }

}