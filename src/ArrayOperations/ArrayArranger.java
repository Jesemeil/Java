package ArrayOperations;

public class ArrayArranger {

    public static int[] removeEvenNumbers(int[] array) {
        int[] arr = new int[array.length];
        for (int element : array) {
            if (element % 2 != 0) {
                arr = new int[]{element};

            }
        }
        return arr;
    }
}
