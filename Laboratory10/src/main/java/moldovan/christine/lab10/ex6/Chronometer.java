package moldovan.christine.lab10.ex6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chronometer extends JFrame {
    JFrame swFrame = new JFrame("Chronometer");
    JTextField tf = new JTextField();
    private JButton b1;
    private JButton b2;
    public int s = 0;
    public int m = 0;
    public int h = 0;
    public boolean isRunning = false;

    public Chronometer() {
        swFrame.setSize(500, 400);
        swFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        swFrame.setLayout(new GridLayout(3, 1));
        b1 = new JButton("Start/Stop");
        b2 = new JButton("Reset");

        tf.setText("00:00:00");
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setFont(tf.getFont().deriveFont(18.0f));
        tf.setEditable(false);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                synchronized (Chronometer.this) {
                    Chronometer.this.notify();
                    Chronometer.this.isRunning = !Chronometer.this.isRunning;
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Chronometer.this.s = 0;
                Chronometer.this.m = 0;
                Chronometer.this.h = 0;
                tf.setText(Chronometer.this.h + ":" + Chronometer.this.m + ":" + Chronometer.this.s);

            }
        });

        swFrame.add(tf);
        swFrame.add(b1);
        swFrame.add(b2);
        swFrame.setVisible(true);

    }

}
