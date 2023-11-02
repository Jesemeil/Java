package ArrayOperations;

public class StringImmutability {
    public static void main(String[] args) {
        String originalContent = "Hello";
        String modifiedContent = originalContent.concat(", world");
        System.out.println("Original content = " + originalContent);
        System.out.println("Modified content = " + modifiedContent);
        System.out.println("Are their content the same? " + originalContent == modifiedContent);
        char character = 'b';
        char character1 = 'a';
        int ascii1 = (int) character;
        int ascii2 = (int) character1;
        System.out.println(" Integer value of b " + ascii1);
        System.out.println(" Integer value of a " + ascii2);
        char[] character2 = new char[5];
        String str = new String(character2);
        for(int index = 0; index < character2.length; index++){
            System.out.println(character2[index]);

        }


    }
}
