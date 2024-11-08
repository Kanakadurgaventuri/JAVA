import java.io.*;
import java.lang.String;
public class ImmutableDemo {
    public static void main(String args[]) {
        String s1 ="SASI";
        s1.concat("SITE");
         System.out.println("After concatenating s1 and s2 : "+s1);
         String s2="Makarajyothi";
         s2=s2.concat("Venturi");
          System.out.println("After concatenating : "+s2);
    }
}
