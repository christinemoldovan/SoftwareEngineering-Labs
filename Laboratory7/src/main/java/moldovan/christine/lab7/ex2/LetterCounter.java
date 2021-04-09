package moldovan.christine.lab7.ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LetterCounter {
    private FileReader file;
    private char lookingFor;

    public LetterCounter(FileReader file, char lookingFor) {
        this.file = file;
        this.lookingFor = lookingFor;
    }

    public String readFile() throws IOException {

        String readLine;

        try (BufferedReader br = new BufferedReader(file)) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();

            }
            readLine = sb.toString();
        }
        return readLine;
    }

    public int counter(String str, char charAppearance) {
        int nr = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == charAppearance) {
                nr++;
            }
        }
        return nr;
    }

}
