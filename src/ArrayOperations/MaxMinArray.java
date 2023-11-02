package ArrayOperations;

public class MaxMinArray {
    public static int solveMaximum(int[] arr) {
        int maximum = arr[0];
        for(int index = 1; index < arr.length; index++){
            if(arr[index] > maximum){
                maximum =arr[index];
            }
        }
        return maximum;
    }

    public static int solveMinimum(int[] arr) {
        int minimum = arr[0];
        for(int index = 1; index < arr.length; index++){
            if(arr[index] < minimum){
                minimum =arr[index];
            }
        }
        return minimum;
    }
}
