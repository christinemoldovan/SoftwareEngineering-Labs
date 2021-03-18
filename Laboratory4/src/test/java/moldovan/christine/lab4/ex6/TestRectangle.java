package moldovan.christine.lab4.ex6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRectangle {
    @Test
    void TestConstructor() {
        Rectangle r1 = new Rectangle();
        assertEquals(1.0, r1.getWidth());
        assertEquals(1.0, r1.getLength());
        assertEquals("A rectangle with width=1.0 and length=1.0, which is a subclass of A shape with color of red and it's true", r1.toString());
        assertEquals(4.0, r1.getPerimeter(), 0.01);
        assertEquals(1.0, r1.getArea());

        Rectangle r2 = new Rectangle(2.0, 4.5);
        r2.setWidth(2.5);
        r2.setFilled(false);
        assertEquals(2.5, r2.getWidth());
        assertEquals(4.5, r2.getLength());
        assertEquals("A rectangle with width=2.5 and length=4.5, which is a subclass of A shape with color of red and it's false", r2.toString());


    }
}
