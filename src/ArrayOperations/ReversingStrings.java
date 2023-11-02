package ArrayOperations;

public class ReversingStrings {
    public static void main(String[] args) {
        String word = "bond";
        for (int index = word.length() - 1; index >= 0; index--){
            System.out.print( word.charAt(index));

        }
        char[] charArray = new char[4];
        word.getChars(0, 4, charArray, 0 );
        for(int index = 0; index < charArray.length; index++){
            System.out.print("\n" + charArray[index]);
        }
       


    }

}
