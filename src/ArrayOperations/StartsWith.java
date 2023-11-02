package ArrayOperations;

public class StartsWith {
    public static void main(String[] args) {
        String str = "success, Aghogho";
        boolean aj = str.startsWith("success");
        System.out.println(aj);

        String[] strings  = {"start", "stop", "sleep", "student","sense"};
        for(String words : strings){
            if(words.startsWith("a",2)){
                System.out.print(words + " ");
            }
        }
        System.out.println();

        for(String words : strings){
            if(words.endsWith("p")){
                System.out.print(words + " ");
            }
        }


    }
}
