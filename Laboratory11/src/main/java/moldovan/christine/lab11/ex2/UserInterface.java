package moldovan.christine.lab11.ex2;

import javax.swing.*;

public class UserInterface {
    private JPanel panel;
    private JLabel productInfo;
    private JTextField productName;
    private JTextField productQuantity;
    private JTextField productPrice;
    private JTextField newQuantity;
    private JList<Product> productJList;

    private JButton addProduct;
    private JButton deleteProduct;
    private JButton viewProducts;
    private JButton updateQuantity;

    public JPanel getPanel() {
        return panel;
    }

    public JLabel getProductInfo() {
        return productInfo;
    }

    public JTextField getProductName() {
        return productName;
    }

    public JTextField getProductQuantity() {
        return productQuantity;
    }

    public JTextField getProductPrice() {
        return productPrice;
    }

    public JTextField getNewQuantity() {
        return newQuantity;
    }

    public JList<Product> getProductJList() {
        return productJList;
    }

    //buttons

    public JButton getAddProduct() {
        return addProduct;
    }

    public JButton getDeleteProduct() {
        return deleteProduct;
    }

    public JButton getViewProducts() {
        return viewProducts;
    }

    public JButton getUpdateQuantity() {
        return updateQuantity;
    }

    public void setAddProduct(JButton addProduct) {
        this.addProduct = addProduct;
    }

    public void setDeleteProduct(JButton deleteProduct) {
        this.deleteProduct = deleteProduct;
    }

    public void setViewProducts(JButton viewProducts) {
        this.viewProducts = viewProducts;
    }

    public void setUpdateQuantity(JButton updateQuantity) {
        this.updateQuantity = updateQuantity;
    }
}

