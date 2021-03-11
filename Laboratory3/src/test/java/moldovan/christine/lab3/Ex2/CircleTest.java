package moldovan.christine.lab3.Ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {
    @Test
    void testConstructorDefault() {
        Circle c = new Circle();
        assertEquals(3.14, c.getArea(), 0.01);
        assertEquals(1, c.getRadius());
    }

    @Test
    void testConstructor() {
        Circle c = new Circle(1);
        assertEquals(3.141592653589793, c.getArea());
        assertEquals(1, c.getRadius());

    }
}
