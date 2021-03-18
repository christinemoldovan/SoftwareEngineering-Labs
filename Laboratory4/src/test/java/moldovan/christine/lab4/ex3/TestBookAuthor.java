package moldovan.christine.lab4.ex3;

import moldovan.christine.lab4.ex2.Author;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBookAuthor {
    @Test
    void testConstructor() {
        Author a = new Author("Ozzy", "ozzym@email.com", 'm');
        a.setEmail("ozzynew@gmail.com");
        assertEquals("Ozzy", a.getName());
        assertEquals("ozzynew@gmail.com", a.getEmail());
        assertEquals('m', a.getGender());

        Book b = new Book("Harry Potter", a, 25.99, 20);
        assertEquals("Harry Potter", b.getName());
        assertEquals(a, b.getAuthor()); // ?????
        assertEquals(25.99, b.getPrice());
        assertEquals(20, b.getQtyInStock());
    }

}

