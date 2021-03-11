package moldovan.christine.lab3.Ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRobot {
    @Test
    void testConstructor() {
        Robot r = new Robot(1);
        assertEquals(1, r.getPosition());
    }

    @Test
    void testChangeValueIsHigherThan1() {
        Robot r = new Robot(1);
        assertEquals(1, r.getPosition());
        r.change(10);
        assertEquals(11, r.getPosition());
    }

    @Test
    void testChangeValueIsLowerThan1() {
        Robot r = new Robot(0);
        assertEquals(1, r.getPosition());
        r.change(0);
        assertEquals(1, r.getPosition());
    }


}
