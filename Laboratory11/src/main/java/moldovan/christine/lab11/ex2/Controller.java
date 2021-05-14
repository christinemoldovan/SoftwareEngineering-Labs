package moldovan.christine.lab11.ex2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;

public class Controller {
    private static final Vector<Product> products = new Vector<>(0);

    public static void main(String[] args) {
        JFrame frame = new JFrame("Products List");
        var ui = new UserInterface();
        //todo solve error nullpointerexception
        ui.getAddProduct().addActionListener(e -> {

            String name = ui.getProductName().getText();
            Integer quantity = Integer.parseInt(ui.getProductQuantity().getText());
            Double price = Double.parseDouble(ui.getProductPrice().getText());

            products.add(new Product(name,quantity,price));
        });


        frame.setContentPane(ui.getPanel());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
