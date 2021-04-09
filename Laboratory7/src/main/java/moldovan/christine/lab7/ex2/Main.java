package moldovan.christine.lab7.ex2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("C:\\Users\\chris\\Desktop\\Facultate\\~sem2\\SE Lab\\30323_2_moldovan_christine_se_labs\\Laboratory7\\data.txt");
        char lookingFor = 'e';
        LetterCounter cnt = new LetterCounter(file, lookingFor);
        System.out.println(cnt.counter(cnt.readFile(), lookingFor));
    }
}
