package moldovan.christine.lab4.ex3;

import moldovan.christine.lab4.ex2.Author;

public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("Ozzy", "ozzym@email.com", 'm');
        Author a2 = new Author("Lola", "lolase@email.com", 'f');
        a1.setEmail("ozzynew@gmail.com");
        Book b1 = new Book("Harry Potter", a1, 25.55, 20);
        Book b2 = new Book("Programming", a2, 35.99, 13);
        System.out.println(b1);
        System.out.println(b2);


    }
}
