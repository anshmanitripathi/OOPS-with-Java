import java.util.*;

class InvalidAgeException extends Exception{
    public String toString(){
        return "InvalidAgeException:Valid age should be >18 and <60";
    }
}

public class g_throws_in_error_handling {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("enter your age");
        age=sc.nextInt();
        if (age<18||age>60) {
            System.out.println("you cannot work");
            InvalidAgeException e=new InvalidAgeException();
            throw e;
            
        }
        System.out.println("A1");
        System.out.println("A2");
        System.out.println("A3");
        System.out.println("A4");
    }    
}
