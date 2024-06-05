import java.util.*;
public class l_fibo {
    public static void main(String[] args){
        System.out.println("Enter the number of terms : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            int t = fibo(i);
            System.out.println(t);
        }


    }

    static int fibo(int n){
        if(n==1){
            return 0;
        } 
        if(n==2){
            return 1;
        } 
        else {
            return fibo(n-1) + fibo(n-2);
        }
    }
}

