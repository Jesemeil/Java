package ArrayOperations;

public class MyStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder(100);
        StringBuilder sb2  = new StringBuilder("Hello");
        sb2.append(" world");
        System.out.println(sb1);
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("Everyone, would be going to watch the Chelsea Match");
        sb3.insert(9, " Aj ");
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("Everyone, would be going to watch the Chelsea Match");
        System.out.println(sb4.length());
        sb4.delete(25, 51);
        System.out.println(sb4);

        StringBuilder sb5 = new StringBuilder("This is a test");
        sb5.replace(8, 15, "an example" );
        System.out.println(sb5);

        StringBuilder sb6 = new StringBuilder("Hello");
        String str = sb6.toString();// converts StringBuilder to string.
        System.out.println(str);

        StringBuilder sb7 = new StringBuilder("Hello, my people");
        System.out.println(sb7.reverse());


    }
}
