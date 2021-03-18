package moldovan.christine.lab4.ex4;

import moldovan.christine.lab4.ex2.Author;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBookAuthor {
    @Test
    void testConstructor() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Ozzy", "ozzym@email.com", 'm');
        authors[1] = new Author("Lola", "lolase@email.com", 'f');
        authors[0].setEmail("ozzynew@gmail.com");
        assertEquals("Ozzy", authors[0].getName());
        assertEquals("ozzynew@gmail.com", authors[0].getEmail());
        assertEquals('m', authors[0].getGender());

        Book b = new Book("Harry Potter", authors, 25.55, 20);
        assertEquals(authors, b.getAuthors());
    }
}
