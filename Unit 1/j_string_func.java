import java.util.*;
class j_string_func {
    public static void main(String[] args) {
        String str = "Hello I am Ansh Mani Tripathi.";
        int s1 =  str.length();
        String s2 = str.toUpperCase();
        String s3 = str.toLowerCase();
        int s4 = str.indexOf("Ansh");
        char s5 = str.charAt(1);
        String s6 = str.substring(0, 10);
        System.out.println(str);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }
}
