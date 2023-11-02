package ArrayOperations;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayArrangerTest {
    @Test
    public void testThatItRemovesTheEvenNumbers() {
        int[] array = {22, 41, 15, 8, 2, 1};
        int[] expectedArray = {41, 15, 1};
        int[] actualArray = ArrayArranger.removeEvenNumbers(array);
        assertArrayEquals(expectedArray, actualArray);
        System.out.println(Arrays.toString(actualArray));
    }



}
