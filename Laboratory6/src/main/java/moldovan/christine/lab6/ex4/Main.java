package moldovan.christine.lab6.ex4;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        int choice;
        Scanner scanner = new Scanner(in);

        do {
            System.out.println("1. Add new word" +
                    "\n2. Word definition" + "\n3. Get all words" +
                    "\n4. Get all definitions" + "\n5. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    dictionary.addWord(new Word("someName"), new Definition("someDefinition"));
                    dictionary.addWord(new Word("otherName"), new Definition("otherDefinition"));
                    dictionary.addWord(new Word("somethingNew"), new Definition("newDefinition"));
                    break;
                case 2:
                    System.out.println(dictionary.getDefinition(new Word("otherName")));
                    System.out.println(dictionary.getDefinition(new Word("someName")));
                    break;
                case 3:
                    System.out.println(dictionary.getAllWords());
                    break;
                case 4:
                    System.out.println(dictionary.getAllDefinition());
                    break;
            }
        } while (choice != 5);
    }

}


