package moldovan.christine.lab2.ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int guessNumber;
        int tries = 1;

        guessNumber = (int) (Math.random() * 10 + 1);

        Scanner in = new Scanner(System.in);

        int guess;
        do {
            System.out.print("Enter a guess (1-10): ");
            guess = in.nextInt();
            if (guess == guessNumber) {
                System.out.println("Your guess is correct. Congratulations!");
                break;
            } else if (guess < guessNumber) {
                System.out.println("Your guess is smaller than the secret number.");
                tries++;
            } else {
                System.out.println("Your guess is greater than the secret number.");
                tries++;
            }
            if (tries == 4) {
                System.out.println("You lost!");
            }
        } while (tries <= 3);


    }
}

