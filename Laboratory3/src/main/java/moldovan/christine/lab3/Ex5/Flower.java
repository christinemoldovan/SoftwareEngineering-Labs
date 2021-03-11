package moldovan.christine.lab3.Ex5;

public class Flower {
    int petal;
    static int counts = 0;


    Flower() {
        //System.out.println("Flower has been created!");
        counts++;
    }

    public static void main(String[] args) {
        Flower[] garden = new Flower[5];
        for (int i = 0; i < 5; i++) {
            Flower f = new Flower();
            garden[i] = f;
        }
        System.out.println("Number of objects created: " + counts);
    }
}