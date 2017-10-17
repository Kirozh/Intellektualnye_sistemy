
import java.lang.String;
import java.util.Scanner;
import java.util.Collection;

public class Main {
    public static String rot13(String s)
    {
        StringBuilder result = new StringBuilder();
        char c;
        for (int i=0; i<s.length(); i++)
        {
            c=s.charAt(i);
            if (c>='A' &&  c<='Z' || c>='a' && c<='z')
                c = (char)(c+13);
                else
                    c=(char)(c-13);
            result.insert(i, c);
        }
        return result.toString();
    }

    public static void main(String[] args)
    {

        String s = args[0];

        System.out.println("proverka : " + s);
        System.out.println("Code: " + rot13(s));
        System.out.println("Decode: " + rot13(rot13(s)));
    }
}
