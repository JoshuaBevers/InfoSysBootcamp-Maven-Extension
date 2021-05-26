package calculator;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class calcTest {

    @Test
    public void testAdd() {

        double addTest = calcMethods.add(4, 5);
        assertEquals(9, addTest);
    }

    @Test
    public void testMultiply() {
        double multiplyTest = calcMethods.multiply(5, 4);
        assertEquals(20, multiplyTest);
    }

    @Test
    public void testDivide() {
        double divideTest = calcMethods.divide(20, 5);
        assertEquals(4, divideTest);
    }

    @Test
    public void testSubtract() {
        double divideTest = calcMethods.subtract(5, 3);
        assertEquals(divideTest, 2);
    }
}
