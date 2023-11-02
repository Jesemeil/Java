package ArrayOperations;

public class MaxMinArrayMain {
    public static void main(String[] args) {
        int[] arr = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87, 122, 5};
        int maximum = MaxMinArray.solveMaximum(arr);
        int minimum = MaxMinArray.solveMinimum(arr);
        System.out.println("The minimum and maximum numbers of the array are respectively " + minimum + " and " + maximum);}
}
