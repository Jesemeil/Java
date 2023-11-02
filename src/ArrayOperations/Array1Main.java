package ArrayOperations;

public class Array1Main {
    public static void main(String[] args) {
        int[] array = {1, 2, -3, 5, 7};
        int sum = Array1.getSum(array);
        System.out.println("The sum of the array = " + sum);

        int product = Array1.getProduct(array);
        System.out.println("The product of the array = " + product);

        double average = Array1.getAverage(array);
        System.out.println("The average of the array = " + average);

    }
}
