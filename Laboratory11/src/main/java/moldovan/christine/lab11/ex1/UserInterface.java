package moldovan.christine.lab11.ex1;

import javax.swing.*;
import java.awt.*;

public class UserInterface extends JFrame implements Observer {
    private JTextArea textArea= new JTextArea();
    private JFrame frame = new JFrame("Temperature sensor");

    @Override
    public void update(Object event) {
        textArea.append("Temperature: "+event.toString() + "\n");
    }

    public UserInterface(){
        frame.setLayout(new GridLayout(3, 3));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(textArea);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        Sensor tempSensor = new Sensor();
        UserInterface ui = new UserInterface();
        tempSensor.register(ui);
        Thread t = new Thread(tempSensor);
        t.start();

    }
}
