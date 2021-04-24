package moldovan.christine.lab9.ex4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class XO extends JPanel {
    JButton[] buttons = new JButton[9];
    JFrame frame = new JFrame("XO game");
    private String pressed;
    private int count;

    public XO() {
        initButtons();
        frame.setLayout(new GridLayout(3, 3));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void initButtons() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(pressed);
            buttons[i].addActionListener(new buttonListener());
            frame.add(buttons[i]);
        }

    }

    public void resetGame() {
        count = 0;
        int playAgain = JOptionPane.showConfirmDialog(null, "Play again?", null, JOptionPane.YES_NO_OPTION);
        if (playAgain == JOptionPane.NO_OPTION) {
            System.exit(0);
        } else {
            //TODO Close previous window ??
            // is it good this way?
            frame.setVisible(false);
            new XO();
        }
    }

    private class buttonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            JButton clicked = (JButton) event.getSource();

            if (count % 2 == 0) {
                pressed = "X";
                clicked.setBackground(Color.RED);
            } else {
                pressed = "O";
                clicked.setBackground(Color.BLUE);
            }

            clicked.setText(pressed);
            clicked.setEnabled(false);
            boolean winner = getWinner();
            if (winner) {
                if (count % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "Winner is: X");
                    resetGame();
                } else {
                    JOptionPane.showMessageDialog(null, "Winner is: O");
                    resetGame();
                }
            } else if (count == 8) {
                JOptionPane.showMessageDialog(null, "Match is a draw!");
                resetGame();
            }
            count++;

        }

    }

    public boolean getWinner() {
       /* 0 | 1 | 2
          3 | 4 | 5
          6 | 7 | 8 */
        int[][] winPositions = new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8},//row
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8},//col
                {0, 4, 8}, {2, 4, 6}};//diag

        for (int[] positions : winPositions) {
            if (buttons[positions[0]].getText().length() > 0
                    && buttons[positions[0]].getText().equals(buttons[positions[1]].getText())
                    && buttons[positions[1]].getText().equals(buttons[positions[2]].getText())
            ) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        new XO();
    }

}