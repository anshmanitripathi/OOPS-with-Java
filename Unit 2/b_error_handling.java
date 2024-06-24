import java.util.*;

public class b_error_handling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={12,23,45,56,78,90};
        int i,a,ans=0;
        System.out.println("enter index");
        try {
           i=sc.nextInt();
           System.out.println("enter value"); 
           a=sc.nextInt();
           ans=arr[i]/a;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error : enter array size less than 7");
        }catch(ArithmeticException e){
            System.out.println("Error : enter the value excepet 0");
        }catch(InputMismatchException e){
            System.out.println("Error : enter only number");
        }catch(Exception e){
            System.out.println("some exception occure");
        }
        System.out.println("Answer " + ans);
    }
}
