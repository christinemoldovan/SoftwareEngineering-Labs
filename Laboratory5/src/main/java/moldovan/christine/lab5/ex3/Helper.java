package moldovan.christine.lab5.ex3;

import java.util.Random;

public class Helper {
    public static int randomRange() {
        Random random = new Random();
        int randomInt = random.nextInt(100);
        return randomInt;
    }
}
