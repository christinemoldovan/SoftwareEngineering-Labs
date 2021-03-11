package moldovan.christine.lab3.Ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAuthor {
    @Test
    void testConstructor() {
        Author a = new Author("Ozzy", "oz@email.com", 'm');
        assertEquals("Ozzy", a.getName());
        assertEquals("oz@email.com", a.getEmail());
        assertEquals('m', a.getGender());
    }

    @Test
    void testSetterEmail() {
        Author a = new Author("Ozzy", "oz@email.com", 'm');
        a.setEmail("newoz@mail.com");
        assertEquals("newoz@mail.com", a.getEmail());
    }

    @Test
    void testToString() {
        Author a = new Author("Ozzy", "oz@email.com", 'm');
        String expected = "Name Ozzy (m) at oz@email.com";
        assertEquals(expected, a.toString());

    }
}
