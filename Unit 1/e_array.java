import java.util.*;
class e_array {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<a.length; i++){
            System.out.println("Enter num:");
            a[i] = sc.nextInt();
        }
        for(int i=0; i<a.length; i++){
            System.out.println("first = " + a[i]);
        }

        for(int item : a){
            System.out.println("second = " + item);
    
        }
    sc.close();    
    }   

}
