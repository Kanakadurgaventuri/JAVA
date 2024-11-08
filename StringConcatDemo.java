import java.io.*;
import java.lang.String;
public class StringConcatDemo {
    public static void main(String args[]) {
        String s1 ="Hello";
        String s2="World";
        String s3=s1.concat(s2);
        System.out.println("The result of s1 concat s3 is "+s3);
        String s4="SasiSiteWlcomeHello";
        String s5=s4.join("Wel",s2);
        System.out.println("The result of s4 join s2 is "+s5);
        System.out.println("The result of s1+s2 is "+(s1+s2));
    }
}
