package moldovan.christine.lab4.ex6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSquare {
    @Test
    void TestConstructor() {
        Square sq1 = new Square();
        assertEquals(1.0, sq1.getSide());
        assertEquals("A square with side=1.0, which is a subclass of A rectangle with width=1.0 and length=1.0, which is a subclass of A shape with color of red and it's true", sq1.toString());

        Square sq2 = new Square(3.3);
        sq2.setWidth(2.5); //doesnt affect!
        sq2.setLength(4.8); //this sets sides
        sq2.setColor("purple");
        sq2.setFilled(false);
        assertEquals(4.8, sq2.getSide());
        assertEquals("A square with side=4.8, which is a subclass of A rectangle with width=4.8 and length=4.8, which is a subclass of A shape with color of purple and it's false", sq2.toString());

    }
}
