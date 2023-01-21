import java.util.Locale;

public class string_methods {
    public static void main(String[] args) {
        String name = "      Laya         ";
        System.out.println(name);

        int value = name.length();  //1) name.length()
        System.out.println(value);

        String val = name.toLowerCase(); //2) lowercase
        System.out.println(val);

        String val1 = name.toUpperCase(); //2) lowercase
        System.out.println(val1);

        String val2 = name.trim(); //2) lowercase
        System.out.println(val2);


        System.out.println(name.substring(1));

    }
}
