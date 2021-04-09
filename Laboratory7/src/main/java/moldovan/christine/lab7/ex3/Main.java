package moldovan.christine.lab7.ex3;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        EncryptDecrypt ed = new EncryptDecrypt();
        //user input file
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        System.out.flush();
        String filename = scanner.nextLine();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        String ls = System.getProperty("line.separator");
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        reader.close();
        String content = stringBuilder.toString();

        int choice;
        //todo implement using args because i had some trouble with it
        do {
            System.out.println("1. Encrypt file\n" +
                    "2. Decrypt file\n" +
                    "3. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    try {
                        FileWriter encrypt = new FileWriter("encrypted.txt");
                        encrypt.write(ed.encryptFile(content));
                        encrypt.close();
                        System.out.println("Successfully wrote to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        FileWriter decrypt = new FileWriter("decrypted.txt");
                        decrypt.write(ed.decryptFile(content));
                        decrypt.close();
                        System.out.println("Successfully wrote to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    break;
            }
        } while (choice != 3);
    }


}
