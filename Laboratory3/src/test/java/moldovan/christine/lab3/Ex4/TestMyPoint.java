package moldovan.christine.lab3.Ex4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMyPoint {
    @Test
    void testConstructorDefault() {
        MyPoint p = new MyPoint();
        assertEquals(0, p.getX());
        assertEquals(0, p.getY());
    }

    @Test
    void testConstructor() {
        MyPoint p = new MyPoint(2, 7);
        assertEquals(2, p.getX());
        assertEquals(7, p.getY());
    }

    @Test
    void testSettersIndividual() {
        MyPoint p = new MyPoint(2, 7);
        p.setX(3);
        p.setY(9);
        assertEquals(3, p.getX());
        assertEquals(9, p.getY());
    }

    @Test
    void testSetterBoth() {
        MyPoint p = new MyPoint(2, 7);
        p.setXY(5, 2);
        assertEquals(5, p.getX());
        assertEquals(2, p.getY());
    }

    @Test
    void testGetDistanceDefault() {
        MyPoint p = new MyPoint();
        assertEquals(10.0, p.getDistance(6, 8));
    }

    @Test
    void testGetDistance() {
        MyPoint p = new MyPoint(2, 7);
        assertEquals(7.28, p.getDistance(0, 0), 0.01);
    }

    @Test
    void testGetDistanceBetweenTwoPoints() {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(2, 7);
        assertEquals(7.28, p1.getDistance(p2), 0.01);
    }
}
