package moldovan.christine.lab4.ex4;

import moldovan.christine.lab4.ex2.Author;


public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qtyInStock = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qtyInStock) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    @Override
    public String toString() {
        return name + " by " + this.authors.length + " authors.";
    }

    public void printAuthors() {
        for (Author a : this.authors) {
            System.out.println(a.getName());
        }
    }
}
