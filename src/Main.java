public class Main {
    public static void printArray(int[] myArray){
        for( int index: myArray) {
            System.out.println(index);
        }
    }

    public static void main(String[] args) {
        int [] arr = {2, 3, 6, 7, 8,};
        printArray(arr);
    }
}