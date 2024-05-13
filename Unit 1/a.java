import java.util.*;
class a{
    public static void main(String args[]){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        a = sc.nextInt();
        System.out.print("Enter number : ");
        b = sc.nextInt();
        int c = a*b;
        System.out.print("Product is "+ c);
        sc.close();
    }
}