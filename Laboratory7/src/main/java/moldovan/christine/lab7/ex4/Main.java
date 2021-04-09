package moldovan.christine.lab7.ex4;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String outputFile = "C:\\Users\\chris\\Desktop\\Facultate\\~sem2\\SE Lab\\30323_2_moldovan_christine_se_labs\\Laboratory7\\output.txt";
        Car c = new Car("Opel", 245.000);
        System.out.println("Created object:" + c.toString());
        Serialize(c, outputFile);
        Car desCar = Deserialize(outputFile);

    }

    static void Serialize(Car car, String outputFile) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(outputFile);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(car);
        }
    }

    static Car Deserialize(String file) throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (Car) ois.readObject();
        }
    }

}
