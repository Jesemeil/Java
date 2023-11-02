package ArrayOperations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Array1Test {
    @Test
    public void testThatItGivesTheSum () {
        int[] array = {1, 2, -3, 5, 7};
        int expectedArray = 12;
        int actualArray = Array1.getSum(array);
        assertEquals(expectedArray, actualArray);
    }

    @Test
    public void testThatItGivesTheProduct() {
        int[] array = {1, 2, -3, 5, 7};
        int expectedArray = -210;
        int actualArray = Array1.getProduct(array);
        assertEquals(expectedArray, actualArray);
    }

    @Test
    public void testThatItGivesTheAverage() {
        int[] array = {1, 2, -3, 5, 7};
        double expectedArray = 2.4;
        double actualArray = Array1.getAverage(array);
        assertEquals(expectedArray, actualArray);
    }

}
