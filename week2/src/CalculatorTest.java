import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(7, Calculator.add(3, 4));
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, Calculator.subtract(3, 4));
    }

    @Test
    public void testMultiply() {
        assertEquals(12, Calculator.multiply(3, 4));
    }

    @Test
    public void testDivideNormal() {
        assertEquals("2", Calculator.divide(8, 4));
    }

    @Test
    public void testDivideByZero() {
        assertEquals("0으로 나눌 수 없습니다.", Calculator.divide(8, 0));
    }

    @Test
    public void testModuloNormal() {
        assertEquals("2", Calculator.modulo(8, 3));
    }

    @Test
    public void testModuloByZero() {
        assertEquals("0으로 나눌 수 없습니다.", Calculator.modulo(8, 0));
    }
}
