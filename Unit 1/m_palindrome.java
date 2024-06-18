import java.util.*;
public class m_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int a = num;
        int newnum =0;
        while (num!=0) {
            int r = num%10;
            newnum = (newnum * 10) + r;
            num = num/10;
        }

        if(newnum == a){
            System.out.println("Palindrom");
        } else{
            System.out.println("not palindrome");
        }
    }
}