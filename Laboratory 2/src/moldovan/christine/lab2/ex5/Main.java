package moldovan.christine.lab2.ex5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i;
        int j;
        int aux;
        int num = 10;
        int array[] = new int[num];

        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.println(array[i]);
        }


        for (i = 0; i < (num - 1); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

        System.out.println("Sorted list of integers:");

        for (i = 0; i < num; i++)
            System.out.println(array[i]);
    }
}
