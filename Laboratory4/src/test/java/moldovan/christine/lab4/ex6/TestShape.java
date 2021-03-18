package moldovan.christine.lab4.ex6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestShape {
    @Test
    void TestConstructor() {
        Shape s = new Shape();
        assertEquals("red", s.getColor());
        assertEquals(true, s.isFilled());
        assertEquals("A shape with color of red and it's true", s.toString());
        Shape s2 = new Shape("blue", false);
        s2.setColor("yellow");
        assertEquals("yellow", s2.getColor());
        assertEquals(false, s2.isFilled());
        assertEquals("A shape with color of yellow and it's false", s2.toString());
    }
}
