package moldovan.christine.lab2.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nGive two numbers");
        Scanner in = new Scanner(System.in);
        System.out.println("First number: ");
        int x = in.nextInt();
        System.out.println("Second number: ");
        int y = in.nextInt();

        System.out.println("x="+x+" y="+y);

        if(x > y)
            System.out.println(x+" is greater than "+y);
        else
            System.out.println(y+" is greater than "+x);
    }

}
