package moldovan.christine.lab2.ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int guessNumber, tries=1;

        guessNumber = (int) (Math.random() * 1000 + 1);

        Scanner in = new Scanner(System.in);

        int guess;
        do {
            System.out.print("Enter a guess (1-1000): ");
            guess = in.nextInt();
            if (guess == guessNumber) {
                System.out.println("Your guess is correct. Congratulations!"); break;
            }
            else if (guess < guessNumber) {
                System.out.println("Your guess is smaller than the secret number.");
                tries++;
            }
            else if (guess > guessNumber){
                System.out.println("Your guess is greater than the secret number.");
                tries++;
            }
        } while (tries<=3);
        System.out.println("You lost");

    }
}

