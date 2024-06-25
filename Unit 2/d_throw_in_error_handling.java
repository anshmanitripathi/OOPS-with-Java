import java.util.*;

public class d_throw_in_error_handling {
     public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age : ");
        age=sc.nextInt();
        if(age<18||age>60){
            System.out.println("you cannot work");
            ArithmeticException e = new  ArithmeticException();
            throw e;
        }
        System.out.println("A1");
        System.out.println("A2");
        System.out.println("A3");
        System.out.println("A4");
    }
    
}