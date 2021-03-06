package moldovan.christine.lab2.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a;
        int b;
        int check;
        int counter = 0;
        System.out.println("Lower bound:");
        a = in.nextInt();
        System.out.println("Upper bound:");
        b = in.nextInt();

        for (int i = a; i <= b; i++) {

            if (i == 1 || i == 0)
                continue;

            check = 1;

            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    check = 0;
                    break;
                }
            }
            if (check == 1) {
                counter++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nTotal nr:" + counter);

    }
}
