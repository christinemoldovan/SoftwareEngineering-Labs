package moldovan.christine.lab4.ex4;


import moldovan.christine.lab4.ex2.Author;

public class Main {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Ozzy", "ozzym@email.com", 'm');
        authors[1] = new Author("Lola", "lolase@email.com", 'f');

        Book b = new Book("Harry Potter", authors, 25.55, 20);
        System.out.println(b); //with toString
        System.out.println("Authors are:");
        b.printAuthors();

    }
}
