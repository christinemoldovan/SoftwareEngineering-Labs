package moldovan.christine.lab9.ex3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class Exercise3 {
    private JTextArea textArea1;
    private JButton button1;
    private JTextField textField1;
    private JPanel panel;

    public Exercise3() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (BufferedReader reader = new BufferedReader(new FileReader(textField1.getText()))) {
                    textArea1.read(reader, "File");
                } catch (IOException exp) {
                    exp.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise3");
        frame.setContentPane(new Exercise3().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
