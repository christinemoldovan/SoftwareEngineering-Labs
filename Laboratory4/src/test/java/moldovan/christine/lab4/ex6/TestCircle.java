package moldovan.christine.lab4.ex6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCircle {
    @Test
    void TestConstructor() {
        Circle c1 = new Circle();
        assertEquals(1.0, c1.getRadius());
        assertEquals("A circle with radius=1.0, which is a subclass of A shape with color of red and it's true", c1.toString());
        assertEquals(6.28, c1.getPerimeter(), 0.01);
        assertEquals(3.14, c1.getArea(), 0.01);
        Circle c2 = new Circle(2.0);
        c2.setRadius(4.0);
        c2.setColor("yellow");
        c2.setFilled(false);
        assertEquals(4.0, c2.getRadius());
        assertEquals("A circle with radius=4.0, which is a subclass of A shape with color of yellow and it's false", c2.toString());

    }
}
