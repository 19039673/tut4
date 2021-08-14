package tut4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCalc {

    @Test
    public void testAdd() {
        assertEquals(Calc.add(2, 2), 4);
    }

    @Test
    public void testSubtract() {
        assertEquals(Calc.subtract(4, 2), 2)
    }

    
}