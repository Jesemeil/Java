package ArrayOperations;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        String str3 = "Help";
        String str4 = new String("Hello");

        boolean areEqual1 = str1.equals(str2);
        boolean areEqual2 = str2.equals(str4);
        boolean areEqual3 = str2.equals(str3);
        boolean areEqual4 = str1 == str2;
        boolean areEqual5 = str2 == (str4);
        boolean areEqual6 = str2 == str3;
        boolean areEqual7 = str1.equalsIgnoreCase(str2);
        boolean areEqual8 = str1.equalsIgnoreCase(str4);
        int comparison1 = str1.compareTo(str2);
        boolean match1 = str1.regionMatches(0,str2,3,5);

        System.out.println(str2.equals(str4));
        System.out.println(areEqual2);
        System.out.println(areEqual1);
        System.out.println(areEqual3);
        System.out.println(areEqual4);
        System.out.println(areEqual5);
        System.out.println(areEqual6);
        System.out.println(areEqual7);
        System.out.println(areEqual8);
        System.out.println(comparison1);
        System.out.println(match1);

    }
}
