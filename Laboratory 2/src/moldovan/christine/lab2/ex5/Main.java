package moldovan.christine.lab2.ex5;

import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        int num, i, j, aux;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter how many numbers the array has:");
        num = in.nextInt();

        int array[] = new int[num];

        System.out.println("Enter " + num + " integers: ");

        for (i = 0; i < num; i++)
            array[i] = in.nextInt();

        for (i = 0; i < ( num - 1 ); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j+1])
                {
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }

        System.out.println("Sorted list of integers:");

        for (i = 0; i < num; i++)
            System.out.println(array[i]);
    }
}
