import java.util.Scanner;

class f_min_max {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i< arr.length; i++){
            System.out.print("Enter num :" );
            arr[i]= sc.nextInt();
        }
        int min = arr[0];
        for(int item : arr){
            if(item < min){
                min = item;
            }
        }
        System.out.println("min = "+min);
        sc.close();
    }
}
