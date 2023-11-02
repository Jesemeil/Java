package ArrayOperations;

public class Array1 {

    public static int getSum(int[] array) {
        int sum = 0;
        for(int index: array){
            sum += index;
        }

        return sum;
    }

    public static int getProduct(int[] array) {
        int product = 1;
        for(int index: array){
            product *= index;
        }

        return product;
    }

    public static double getAverage(int[] array) {

        return (double) getSum(array) / array.length;

    }

}

