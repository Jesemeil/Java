package ArrayOperations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxMinArrayTest {
    @Test
    public void testThatMaximumIsObtained() {
        int[] arr = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int expectedMaximum = 100;
        int actualMaximum = MaxMinArray.solveMaximum(arr);
        assertEquals(expectedMaximum, actualMaximum);
    }

    @Test
    public void testThatMinimumIsObtained() {
        int[] arr = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int expectedMinimum = 68;
        int actualMinimum = MaxMinArray.solveMinimum(arr);
        assertEquals(expectedMinimum, actualMinimum);
    }


}
