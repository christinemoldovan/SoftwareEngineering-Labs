package moldovan.christine.lab4.ex5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCylinder {
    @Test
    void TestConstructor() {
        Cylinder c1 = new Cylinder(2, 3);
        Cylinder c2 = new Cylinder();
        assertEquals(2, c1.getRadius());
        assertEquals(3, c1.getHeight());
        assertEquals(37.69, c1.getVolume(), 0.01);

        assertEquals(1, c2.getRadius());
        assertEquals(1, c2.getHeight());
        assertEquals(3.14, c2.getVolume(), 0.01);

        Cylinder c3 = new Cylinder(3);
        assertEquals(56.54, c3.getArea(), 0.01);


    }
}
