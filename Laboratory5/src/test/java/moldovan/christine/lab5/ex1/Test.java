package moldovan.christine.lab5.ex1;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
    @org.junit.jupiter.api.Test
    void TestConstructor() {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle();
        shapes[1] = new Circle(3);
        shapes[2] = new Rectangle();
        shapes[3] = new Rectangle(2, 3);

        assertEquals(3.14, shapes[0].getArea(), 0.01);
        assertEquals(6.28, shapes[0].getPerimeter(), 0.01);

        assertEquals(28.27, shapes[1].getArea(), 0.01);
        assertEquals(18.84, shapes[1].getPerimeter(), 0.01);

        assertEquals(1.0, shapes[2].getArea(), 0.01);
        assertEquals(4.0, shapes[2].getPerimeter(), 0.01);

        assertEquals(6.0, shapes[3].getArea(), 0.01);
        assertEquals(10.0, shapes[3].getPerimeter(), 0.01);

        Square sq = new Square(2);
        assertEquals(2, sq.getSide());
        assertEquals("A square with side=2.0, which is a subclass of A rectangle with width=2.0 and length=2.0, which is a subclass of A shape with color of red and it's true", sq.toString());


    }
}
