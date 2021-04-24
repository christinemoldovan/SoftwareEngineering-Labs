package moldovan.christine.lab9.ex2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise2 {
    private JButton button1;
    private JPanel panel1;
    private JTextField textField1;
    private int counter = 0;

    public Exercise2() {
        textField1.setText(counter + "");
        textField1.setEditable(false);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(++counter + "");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise2");
        frame.setContentPane(new Exercise2().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
