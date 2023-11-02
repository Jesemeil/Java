package ArrayOperations;

public class Substrings {
    public static void main(String[] args) {
        String str1 = "I love you so much";
        String index1 = str1.substring(2);
        System.out.println(index1);

        String index2 = str1.substring(2, 10);
        System.out.println(index2);

        String concatenatedString = str1.concat(", everyone.");
        System.out.println(concatenatedString);

        String newString = str1.replace("I", "We");
        System.out.println(newString);

        String str3 = "Hello, World!";
        String oldChar3 = "o";
        String newChar3 = " ";
        String result3 = str3.replace(oldChar3, newChar3);

        System.out.println("Result 3: " + result3);


    }
}
